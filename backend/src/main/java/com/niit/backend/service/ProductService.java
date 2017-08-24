package com.niit.backend.service;

import java.util.List;

import com.niit.backend.model.Category;
import com.niit.backend.model.Product;

public interface ProductService {
	void saveProduct(Product product);

	public List<Product> getAllProducts();

	Product getProductById(int id);

	void deleteProduct(int id);

	void updateProduct(Product product);

	List<Category> getAllCategories();

	Category getCategoryById(int id);

	public void saveCategory(Category category);

	void deleteCategory(int id);

}
