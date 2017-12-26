package com.spring.shoppingbackend.dao;

import java.util.List;

import com.spring.shoppingbackend.dto.Category;

public interface CategoryDAO {
	Category get(int id);
	List<Category> list();

}
