package com.exam.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.exam.model.AddReceiptionist;
import com.exam.model.CreateUser;
import com.exam.model.DoctorRegistration;
import com.exam.model.OnlineAppointment;
import com.exam.model.UserInfo;
@Repository
public class ReceiptionistDaoImpl implements CommonDao<AddReceiptionist> {

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public AddReceiptionist save(AddReceiptionist entity) {
		try {
			sessionFactory.getCurrentSession().save(entity);
			return entity;
		} catch (Exception e) {
			return null;
		}
		
	}

	@Override
	public AddReceiptionist update(AddReceiptionist entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AddReceiptionist getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AddReceiptionist> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
