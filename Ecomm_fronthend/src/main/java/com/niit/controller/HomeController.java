package com.niit.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.niit.backend.service.ProductService;

@Controller
public class HomeController 
{
	@Autowired
	private ProductService productService;
	HomeController(){
		System.out.println("home controller instantiated");
	}
	@RequestMapping("/home")
	public String homepage(HttpSession session)
	{
		session.setAttribute("categories",productService.getAllCategories());
		return "home";
	}
	
	@RequestMapping("/aboutus")
	public String aboutus()
	{
		return "aboutus";
	}
	@RequestMapping("/login")
	public String login(@RequestParam(required=false)String error,Model model){
		if(error!=null)
			model.addAttribute("error","Invalid username or password.Try Again!");
		return"login";
	}
}
