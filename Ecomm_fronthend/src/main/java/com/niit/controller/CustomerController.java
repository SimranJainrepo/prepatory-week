package com.niit.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.backend.model.Customer;
import com.niit.backend.model.Product;
import com.niit.backend.model.User;
import com.niit.backend.service.CustomerService;
import com.niit.backend.service.ProductService;

@Controller
public class CustomerController 
{
	CustomerController(){
		System.out.println("customer controller instantiated");
	}
	@Autowired
	private CustomerService customerService;
	@Autowired
	private ProductService productService;
	@RequestMapping("/all/registrationform")
	public String getRegistrationForm(Model model)
	{
		model.addAttribute("customer", new Customer());
		return "registrationform";
	}
	@RequestMapping("/all/savecustomer")
	public String registerCustomer(@Valid @ModelAttribute Customer customer,BindingResult result,Model model)
	{
		if(result.hasErrors())
		{
			return "registrationform";
		}
		User user=customerService.validateUsername(customer.getUser().getUsername());
		if(user!=null)
		{
			model.addAttribute("duplicateUsername","Username already exist");
			return "registrationform";
			
		}
		Customer duplicateCustomer=customerService.validateEmail(customer.getEmail());
		if(duplicateCustomer!=null)
		{
			model.addAttribute("duplicateEmail","Email already exist");
			return "registrationform";
		}
		customerService.registerCustomer(customer);
		return "login";
	}
	
	@RequestMapping("/all/product/getallproducts")
	public String getAllProducts(Model model) {
		List<Product> products = productService.getAllProducts();
		model.addAttribute("products", products);
		return "productlist";
	}
	@RequestMapping("/all/product/viewproduct/{id}")
	public String getProductById(@PathVariable int id, Model model) {
		Product product = productService.getProductById(id);
		model.addAttribute("product", product);
		return "viewproduct";
	}
	@RequestMapping("all/product/searchbycategory")
	public String selectByCategory(@RequestParam String searchCondition,Model model)
	{
		model.addAttribute("products",productService.getAllProducts());
		
		model.addAttribute("searchCondition", searchCondition);
		return "productlist";
	}
}
