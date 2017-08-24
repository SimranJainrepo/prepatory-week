package com.niit.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.niit.backend.model.Category;
import com.niit.backend.model.Product;
import com.niit.backend.service.ProductService;

@Controller
public class AdminController {
	@Autowired
	private ProductService productService;

	@RequestMapping("/getproductform")
	public String getProductForm(Model model) {
		List<Category> categories = productService.getAllCategories();
		model.addAttribute("categories", categories);
		model.addAttribute("product", new Product());
		return "productform";
	}

	public AdminController() {
		System.out.println("save method is called");
	}

	@RequestMapping("/saveproduct")
	public String saveproduct(@Valid @ModelAttribute(name = "product") Product product, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			List<Category> categories = productService.getAllCategories();
			model.addAttribute("categories", categories);
			return "productform";

		}

		productService.saveProduct(product);

		MultipartFile image = product.getImage();
		Path path = Paths.get("F:\\workspace\\Ecomm_fronthend\\src\\main\\webapp\\WEB-INF\\resources\\images\\"
				+ product.getId() + ".png");
		try {
			image.transferTo(new File(path.toString()));
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/admin/product/getallproducts";
	}

	@RequestMapping("/admin/product/viewproduct/{id}")
	public String getProductById(@PathVariable int id, Model model) {
		Product product = productService.getProductById(id);
		model.addAttribute("product", product);
		return "adminviewproduct";
	}

	@RequestMapping("/admin/product/deleteproduct/{id}")

	public String deleteProductById(@PathVariable int id) {
		productService.deleteProduct(id);
		return "redirect:/admin/product/getallproducts";
	}

	@RequestMapping("/admin/product/geteditform/{id}")
	public String getEditform(@PathVariable int id, Model model) {
		List<Category> categories = productService.getAllCategories();
		model.addAttribute("categories", categories);
		Product product = productService.getProductById(id);
		System.out.println(product);
		System.out.println(categories.size());
		model.addAttribute("productObj", product);
		return "editform";
	}

	@RequestMapping("/admin/product/editproduct")
	public String editProduct(@Valid @ModelAttribute(name = "productObj") Product product, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			List<Category> categories = productService.getAllCategories();
			model.addAttribute("categories", categories);
			return "editform";
		}
		productService.updateProduct(product);
		MultipartFile image = product.getImage();
		Path path = Paths.get("F:\\workspace\\Ecomm_fronthend\\src\\main\\webapp\\WEB-INF\\resources\\images\\"
				+ product.getId() + ".png");
		try {
			image.transferTo(new File(path.toString()));
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "redirect:/admin/product/getallproducts";
	}

	@RequestMapping("/admin/product/getallproducts")
	public String getAllProductslist(Model model) {
		List<Product> products = productService.getAllProducts();
		model.addAttribute("products", products);
		return "adminproduct";
	}

	@RequestMapping("/all/category/getallcategories")
	public String getAllCategories(Model model) {
		List<Category> categories = productService.getAllCategories();
		model.addAttribute("categories", categories);
		return "categorylist";
	}

	@RequestMapping("/getcategoryform")
	public String getCategoryForm(Model model) {

		model.addAttribute("category", new Category());
		return "categoryform";
	}

	@RequestMapping("/savecategory")
	public String savecategory(@ModelAttribute(name = "category") Category category) {
		productService.saveCategory(category);
		return "redirect:/all/category/getallcategories";
	}

	@RequestMapping("/admin/category/deletecategory/{id}")

	public String deleteCategoryById(@PathVariable int id) {
		productService.deleteCategory(id);
		return "redirect:/all/category/getallcategories";
	}
}
