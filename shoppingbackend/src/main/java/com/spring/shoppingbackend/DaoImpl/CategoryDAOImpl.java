package com.spring.shoppingbackend.DaoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.shoppingbackend.dao.CategoryDAO;
import com.spring.shoppingbackend.dto.Category;
@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories=new ArrayList<>();
	static{
		//first category
		Category category=new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("this is some of description for Television");
		category.setImageUrl("cat_1.png");
		categories.add(category);
		
		//second category
		 category=new Category();
				category.setId(2);
				category.setName("Mobile");
				category.setDescription("this is some of description for Mobile");
				category.setImageUrl("cat_2.png");
				categories.add(category);
				
		//first category
				 category=new Category();
				category.setId(3);
				category.setName("laptop");
				category.setDescription("this is some of description for laptop");
				category.setImageUrl("cat_3.png");
				categories.add(category);
	}
	
	@Override
	public List<Category> list() {
		
		return categories;
	}

	@Override
	public Category get(int id) {
		for(Category category:categories)
		{
			if(category.getId()==id) return category;
		}
	
		return null;
	}

}
