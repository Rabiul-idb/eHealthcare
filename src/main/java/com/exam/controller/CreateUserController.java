package com.exam.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.exam.model.CreateUser;
import com.exam.model.OnlineAppointment;
import com.exam.service.CreateUserServiceImpl;
import com.exam.service.OnlineAppointmentServiceImpl;

@Controller
public class CreateUserController {
	@Autowired
	CreateUserServiceImpl createUserServiceImpl;
	
	
	@PostMapping("/createUser")
	public ModelAndView createUser(HttpServletRequest request) {
		String name = request.getParameter("Uname");
		String email = request.getParameter("Uemail");
		String age = request.getParameter("Uage");
		String gen = request.getParameter("Ugender");
		String contact = request.getParameter("Ucontact");
		String password = request.getParameter("Upassword");
		String address = request.getParameter("Uaddress");
		
		CreateUser createUser = new CreateUser(); 
		createUser.setUname(name);
		createUser.setUemail(email);
		createUser.setUage(age);
		createUser.setUgender(gen);
		createUser.setUcontact(contact);
		createUser.setUpassword(password);
		createUser.setUaddress(address);
		
		
		 createUserServiceImpl.save(createUser);
		 return new ModelAndView("loginPage");
	}
}
