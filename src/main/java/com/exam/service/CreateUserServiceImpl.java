package com.exam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.CreateUserDaoImpl;
import com.exam.dao.OnlineAppointDaoImpl;
import com.exam.model.CreateUser;
import com.exam.model.OnlineAppointment;

@Service
@Transactional
public class CreateUserServiceImpl implements CommonService<CreateUser> {

	@Autowired
	CreateUserDaoImpl createUserDaoImpl;

	@Override
	public CreateUser save(CreateUser entity) {
		
		return createUserDaoImpl.save(entity);
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
