package com.exam.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exam.model.CreateUser;
import com.exam.model.OnlineAppointment;
import com.exam.model.UserInfo;
@Repository
public class CreateUserDaoImpl implements CommonDao<CreateUser> {

	@Autowired
	SessionFactory sessionFactory;
public CreateUser save(CreateUser entity) {
	try {
		sessionFactory.getCurrentSession().save(entity);
		return entity;
	} catch (Exception e) {
		return null;
	}
 }
@Override
public CreateUser update(CreateUser entity) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public boolean delete(long id) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public CreateUser getById(long id) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public List<CreateUser> getAll() {
	// TODO Auto-generated method stub
	return null;
}
	
	
}
