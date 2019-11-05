package com.exam.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.exam.model.OnlineAppointment;
import com.exam.service.OnlineAppointmentServiceImpl;

@Controller
public class AppointmentController {
	@Autowired
	OnlineAppointmentServiceImpl onlineAppointmentServiceImpl;
	@Autowired
	JavaMailSender javaMailSender;
	
	@PostMapping("/onlineAppoint")
	public ModelAndView onlineAppoint(HttpServletRequest request) {
		
		String name = request.getParameter("pName");
		String email = request.getParameter("pEmail");
		String age = request.getParameter("pAge");
		String gen = request.getParameter("pGender");
		String address = request.getParameter("pAddress");
		String dept = request.getParameter("pDepertment");
		String doctor = request.getParameter("pDoctor");
		
		
		OnlineAppointment onlineAppoint	= new OnlineAppointment(); 
		onlineAppoint.setpName(name);
		onlineAppoint.setpEmail(email);
		onlineAppoint.setpAge(age);
		onlineAppoint.setpGender(gen);
		onlineAppoint.setpAddress(address);
		onlineAppoint.setpDepertment(dept);
		onlineAppoint.setpDoctor(doctor);
		
		
		
		 onlineAppointmentServiceImpl.save(onlineAppoint);
		
		 Map<String, String> map = new HashMap();
		 
		 SimpleMailMessage massage = new SimpleMailMessage();
	        massage.setFrom("rabiul.idb40@gmail.com");
	        massage.setSentDate(new Date());
	        massage.setTo(email);
	        massage.setSubject("Mail");
	        massage.setText("hello wordl");
	        System.out.println(massage);
	        javaMailSender.send(massage);
	        map.put("msg", "Success");
	        return new ModelAndView("onlineAppointment", map);
		
	}
	
}
