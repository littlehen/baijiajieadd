package com.example.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserOneService;


@RestController
public class  UserOneController {

	@Autowired
	UserOneService useroneService;
	
	
	@RequestMapping("/Laiqian")
	public Map<String,Object> Laiqian(String name,String IdCard,String money,String phone,String qq,String 	wxnumber,String zhima){
		
		return useroneService.Laiqian(name, IdCard, money, phone, qq, wxnumber, zhima);
	}
	
	@RequestMapping("/yanzheng")
	public Map<String,Object> yanzheng(String mobile){
		return useroneService.yanzhengma(mobile);
	}
}
