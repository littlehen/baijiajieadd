package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class UserOne {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Float getZhima() {
		return zhima;
	}

	public void setZhima(Float zhima) {
		this.zhima = zhima;
	}

	public String getWxnumber() {
		return wxnumber;
	}

	public void setWxnumber(String wxnumber) {
		this.wxnumber = wxnumber;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public Float getMoney() {
		return money;
	}

	public void setMoney(Float money) {
		this.money = money;
	}

	private String name;
	
	private String idcard;
	
	private String phone;
	
	private Float zhima;
	
	private String wxnumber;
	
	private String qq;
	
	private Float money;
	
}
