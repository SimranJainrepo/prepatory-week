package com.niit.backend.dao;

import java.util.List;

import com.niit.backend.model.Category;
import com.niit.backend.model.Product;



public interface Productdao {
	public void saveProduct(Product product);

	 List<Product> getAllProducts();

	Product getProductById(int id);

	void deleteProduct(Product product);

	void editProduct(Product product);
	
	List<Category> getAllCategories();
	
	public void saveCategory(Category category);
	  
	void deleteCategory(Category category);

	Category getCategorytById(int id);

	
	
}
