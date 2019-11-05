package com.exam.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.exam.model.AddReceiptionist;
import com.exam.model.CreateUser;
import com.exam.model.DoctorRegistration;
import com.exam.model.OnlineAppointment;
import com.exam.service.CreateUserServiceImpl;
import com.exam.service.DoctorRegistrationServiceImpl;
import com.exam.service.OnlineAppointmentServiceImpl;
import com.exam.service.ReceiptionistServiceImpl;

@Controller
public class ReceiptionistController {
	@Autowired
	ReceiptionistServiceImpl receiptionistServiceImpl;
	
	
	@PostMapping("/addReceiptionist")
	public ModelAndView addDoctor(HttpServletRequest request) {
		String name = request.getParameter("fullname");
		String username = request.getParameter("username");
		String address = request.getParameter("address");
		String pass = request.getParameter("pass");
		String email = request.getParameter("email");
		String phn = request.getParameter("phnNo");
		String qualification = request.getParameter("Qualification");
		
		
		AddReceiptionist addReceiptionist = new AddReceiptionist(); 
		
		addReceiptionist.setFullname(name);
		addReceiptionist.setUsername(username);
		addReceiptionist.setAddress(address);
		addReceiptionist.setPass(pass);
		addReceiptionist.setEmail(email);
		addReceiptionist.setPhnNo(phn);
		addReceiptionist.setQualification(qualification);
		
		
		
		receiptionistServiceImpl.save(addReceiptionist);
		 return new ModelAndView("addReceiptionist");
	}
	
	
}
