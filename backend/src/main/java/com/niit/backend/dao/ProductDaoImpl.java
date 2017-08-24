package com.niit.backend.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.backend.model.Category;
import com.niit.backend.model.Product;



@Repository("productDao")
public class ProductDaoImpl implements Productdao {
	public ProductDaoImpl() {
		System.out.println("ProductDaoImpl object is created");

	}

	@Autowired
	private SessionFactory sessionFactory;

	public void saveProduct(Product product) {
		Session session = sessionFactory.getCurrentSession();
		session.save(product);
	}

	public List<Product> getAllProducts() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Product");
		List<Product> products = query.list();
		return products;
	}

	public Product getProductById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Product product = (Product) session.get(Product.class, id);
		return product;
	}

	public void deleteProduct(Product product) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(product);
	}

	public void editProduct(Product product) {
		Session session = sessionFactory.getCurrentSession();
		session.update(product);

	}

	public List<Category> getAllCategories() {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("from Category");
		List<Category> categories = query.list();
		return categories;
	}

	public void saveCategory(Category category) {
		Session session = sessionFactory.getCurrentSession();
		session.save(category);
		
	}

	public void deleteCategory(Category category) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(category);
		
		
	}
	


	public Category getCategorytById(int id) {
		 {
				Session session = sessionFactory.getCurrentSession();
				Category category = (Category) session.get(Category.class, id);
				return category;

		}
	}

	
	}

