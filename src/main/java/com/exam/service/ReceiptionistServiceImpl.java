package com.exam.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.dao.CreateUserDaoImpl;
import com.exam.dao.DoctorRegistrationDaoImpl;
import com.exam.dao.OnlineAppointDaoImpl;
import com.exam.dao.ReceiptionistDaoImpl;
import com.exam.model.AddReceiptionist;
import com.exam.model.CreateUser;
import com.exam.model.DoctorRegistration;
import com.exam.model.OnlineAppointment;

@Service
@Transactional
public class ReceiptionistServiceImpl implements CommonService<AddReceiptionist> {

	@Autowired
	ReceiptionistDaoImpl receiptionistDaoImpl;

	@Override
	public AddReceiptionist save(AddReceiptionist entity) {
		// TODO Auto-generated method stub
		return receiptionistDaoImpl.save(entity);
	}

	@Override
	public AddReceiptionist update(AddReceiptionist entity) {
		return receiptionistDaoImpl.update(entity);
	}

	@Override
	public boolean delete(long id) {
		// TODO Auto-generated method stub
		return receiptionistDaoImpl.delete(id);
	}

	@Override
	public AddReceiptionist getById(long id) {
		// TODO Auto-generated method stub
		return receiptionistDaoImpl.getById(id);
	}

	@Override
	public List<AddReceiptionist> getAll() {
		// TODO Auto-generated method stub
		return receiptionistDaoImpl.getAll();
	}

	
}
