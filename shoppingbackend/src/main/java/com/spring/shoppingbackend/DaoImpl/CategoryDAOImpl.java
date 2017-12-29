package com.spring.shoppingbackend.DaoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.shoppingbackend.dao.CategoryDAO;
import com.spring.shoppingbackend.dto.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;

	/*
	 * fetch the list of category from the database
	 */

	@Override
	public List<Category> list() {
		String selectActiveCategory="FROM Category WHERE active= :active";
		Query query=sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
		query.setParameter("active",true);
		

		return query.getResultList();
	}

	/*
	 * fetch the single category from the database
	 */
	@Override
	public Category get(int id) {

		return sessionFactory.getCurrentSession().get(Category.class, Integer.valueOf(id));
	}

	/*
	 * add the category into the database
	 */
	@Override
	@Transactional
	public boolean add(Category category) {

		try {
			// add the category to the databse table

			sessionFactory.getCurrentSession().persist(category);

			return true;

		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}

	}

	/*
	 * update the category
	 */

	@Override
	public boolean update(Category category) {

		try {
			// add the category to the databse table

			sessionFactory.getCurrentSession().update(category);

			return true;

		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}

	}

	/*
	 * method is used to delete the category
	 */
	@Override
	public boolean delete(Category category) {

		category.setActive(false);

		try {
			// add the category to the databse table

			sessionFactory.getCurrentSession().update(category);

			return true;

		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
