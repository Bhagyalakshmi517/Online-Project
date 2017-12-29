package com.spring.shoppingbackend.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.shoppingbackend.dao.CategoryDAO;
import com.spring.shoppingbackend.dto.Category;

public class CategoryTestCase {
	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	private static Category category;
	
	@BeforeClass
	public static void init() {
		
		context = new AnnotationConfigApplicationContext();
		context.scan("com.spring.shoppingbackend");
		context.refresh();
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		
	}
	
	/*
	@Test
	public void testAddCategory() {
		
		category = new Category();
		category.setName("Television");
		category.setDescription("this is some of description for Television");
		category.setImageUrl("cat_4.png");
		
		assertEquals("successfully added a category inside the table",true,categoryDAO.add(category));
		
		
		
	}
	*/
	/*
	@Test
	public void testGetCategory(){
		category=categoryDAO.get(2);
		assertEquals("successfully fechted a single category from the table","Laptop",category.getName());
		
		
		
	}*/
	
	/*
	@Test
	public void testUpdateCategory(){
		category=categoryDAO.get(1);
		category.setName("TV");
		assertEquals("successfully updated a single category from the table",true,categoryDAO.update(category));
		
		
		
	}*/
	
/*
	@Test
	public void testDeleteCategory(){
		category=categoryDAO.get(3);
		assertEquals("successfully deleted a single category from the table",true,categoryDAO.delete(category));
		
		
		
	}*/
	
	/*
	@Test
	public void testListCategory(){
		
		assertEquals("successfully deleted a single category from the table",2,categoryDAO.list().size());
		
		
		
	}*/
	/*
	@Test
	public void testCRUDCategory(){
		//add the category
		category = new Category();
		category.setName("Television");
		category.setDescription("this is some of description for Television");
		category.setImageUrl("cat_65.png");
		
		assertEquals("successfully added a category inside the table",true,categoryDAO.add(category));
		
		category = new Category();
		category.setName("Laptop");
		category.setDescription("this is some of description for Laptop");
		category.setImageUrl("cat_41.png");
		
		assertEquals("successfully added a category inside the table",true,categoryDAO.add(category));
		
		//update category
		
		category=categoryDAO.get(2);
		category.setName("Mobile");
		assertEquals("successfully updated a single category from the table",true,categoryDAO.update(category));
		
		//delete category
		category=categoryDAO.get(1);
		assertEquals("successfully deleted a single category from the table",true,categoryDAO.delete(category));
		
		//fetch the list of category
		
		assertEquals("successfully deleted a single category from the table",3,categoryDAO.list().size());
		
		
		
		
	}*/

}
