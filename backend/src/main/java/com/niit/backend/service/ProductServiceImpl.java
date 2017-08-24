package com.niit.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.dao.Productdao;
import com.niit.backend.model.Category;
import com.niit.backend.model.Product;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService {
	public ProductServiceImpl() {
		System.out.println("ProductServiceImpl object is created");

	}

	@Autowired
	private Productdao productDao;

	public void saveProduct(Product product) {
		productDao.saveProduct(product);
	}

	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}

	public Product getProductById(int id) {
		return productDao.getProductById(id);
	}

	public void deleteProduct(int id) {
		Product product = getProductById(id);
		productDao.deleteProduct(product);
	}

	public void updateProduct(Product product) {
		productDao.editProduct(product);

	}

	public List<Category> getAllCategories() {
		return productDao.getAllCategories();
	}

	public void saveCategory(Category category) {
		productDao.saveCategory(category);
		
	}
	

	public Category getCategoryById(int id) {
		return productDao.getCategorytById(id);
	}

	public void deleteCategory(int id) {
		Category category = getCategoryById(id);
		productDao.deleteCategory(category);
		
	}

	
		
	}

	

