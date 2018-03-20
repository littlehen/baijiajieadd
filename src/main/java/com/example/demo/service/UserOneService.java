package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserOneDao;
import com.example.demo.model.UserOne;
import com.example.demo.other.Api;


@Service
public class UserOneService {

	@Autowired
	UserOneDao useroneDao;
	
	public Map<String,Object> Laiqian(String name,String IdCard,String money,String phone,String qq,String 	wxnumber,String zhima){
		UserOne  userOne = new UserOne();
		Map<String,Object> map = new HashMap<>();
		userOne.setIdcard(IdCard);
		userOne.setPhone(phone);
		userOne.setMoney(Float.parseFloat(money));
		userOne.setQq(qq);
		userOne.setWxnumber(wxnumber);
		userOne.setZhima(Float.parseFloat(zhima));
		userOne.setName(name);
		useroneDao.save(userOne);
		map.put("guo", 123);
		return map;
		
	}
	
	public Map<String,Object> yanzhengma(String mobile){
		Map<String,Object> map = new HashMap<>();
		int random=(int)(Math.random()*10000);
		String a = Api.Sendinfo(mobile, random);
		System.out.println(a);
		map.put("mama", random);
		return map;
		
	}

}
