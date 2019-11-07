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
		sessionFactory.getCurrentSession().saveOrUpdate(entity);

		return entity;
	}

	@Override
	public boolean delete(long id) {
		try {
			AddReceiptionist addReceiptionist = sessionFactory.getCurrentSession().get(AddReceiptionist.class,
					id);
			sessionFactory.getCurrentSession().delete(addReceiptionist);
			return true;
		} catch (HibernateException e) {
			return true;
		}
	}

	@Override
	public AddReceiptionist getById(long id) {
		try {
			AddReceiptionist entity = sessionFactory.getCurrentSession().get(AddReceiptionist.class, id);
			return entity;
		} catch (HibernateException e) {
			return null;
		}
	}

	@Override
	public List<AddReceiptionist> getAll() {
		return sessionFactory.getCurrentSession().createQuery("FROM AddReceiptionist").list();
	}

	
}
