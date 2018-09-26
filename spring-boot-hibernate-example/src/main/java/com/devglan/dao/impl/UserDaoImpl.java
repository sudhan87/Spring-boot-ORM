package com.devglan.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.devglan.dao.UserDao;
import com.devglan.model.UserDetails;

@Component
public class UserDaoImpl implements UserDao {

//	@Autowired
	private SessionFactory sessionFactory;
	
	public List<UserDetails> getUserDetails() {
		Criteria criteria = sessionFactory.openSession().createCriteria(UserDetails.class);
		return criteria.list();
	}
	 
}
