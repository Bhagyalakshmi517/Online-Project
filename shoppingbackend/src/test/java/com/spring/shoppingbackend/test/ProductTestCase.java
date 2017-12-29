package com.spring.shoppingbackend.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.shoppingbackend.dao.ProductDAO;
import com.spring.shoppingbackend.dto.Product;

public class ProductTestCase {
private static AnnotationConfigApplicationContext context;
	
	private static ProductDAO productDAO;
	
	private static Product product;
	
	@BeforeClass
	public static void init() {
		
		context = new AnnotationConfigApplicationContext();
		context.scan("com.spring.shoppingbackend");
		context.refresh();
		productDAO = (ProductDAO)context.getBean("productDAO");
		
	}
	/*
	@Test
	public void testCRUDProduct() {
		
		//create operations
		
		product =new Product();
		product.setName("nokia");
		product.setBrand("nokia");
		product.setDescription("This is some description for nokia mobile phone");
		product.setUnitPrice(25000);
		product.setActive(true);
		product.setCategoryId(3);
		product.setSupplierId(3);
		
		assertEquals("Something went wrong while inserting a new product!",true,productDAO.add(product));
		
		//reading and updating the category
		
		product = productDAO.get(7);
		product.setName("Moto");
		assertEquals("Something went wrong while updating the existing record!",true,productDAO.update(product));
		
		assertEquals("Something went wrong while deleting the existing record!",true,productDAO.delete(product));
		
		assertEquals("Something went wrong while fecthing the list of Products!",8,productDAO.list().size());
		}*/
	/*	
		@Test
		public void testListActiveProducts(){
			assertEquals("Something went wrong while fecthing the list of Products!",6,productDAO.listActiveProducts().size());
			
		}
		
	*/
	/*
	@Test
	public void testListActiveProductsByCategory(){
		assertEquals("Something went wrong while fecthing the list of Products!",4,productDAO.listActiveProductsByCategory(3).size());
		
		assertEquals("Something went wrong while fecthing the list of Products!",2,productDAO.listActiveProductsByCategory(1).size());
		
	}*/
		
	@Test
	public void testGetLatestActiveProduct(){
		assertEquals("Something went wrong while fecthing the list of Products!",3,productDAO.getLatestActiveProducts(3).size());
		
	}
}


