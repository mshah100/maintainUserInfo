package com.example.demo.jpa.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.jpa.dao.IUserDataJPADAO;
import com.example.demo.model.UserAcctDetails;

@Component
@Transactional
public class UserDataJPADAOImpl implements IUserDataJPADAO {
	
	@PersistenceContext	
	private EntityManager entityManager;	

	@Override
	public List<UserAcctDetails> getAllUserAcctDetails() {
		Criteria criteria = entityManager.unwrap(Session.class).createCriteria(UserAcctDetails.class);
		@SuppressWarnings("unchecked")
		List<UserAcctDetails> list = criteria.list();
		return list;
	}

}
