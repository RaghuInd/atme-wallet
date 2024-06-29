package com.atme.wallet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class UserWallet {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String name;
	private String email;
	private String password;
	private Double balace;
	public UserWallet() {
		super();
	}
	public UserWallet(Integer id, String name, String email, String password, Double balace) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.balace = balace;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Double getBalace() {
		return balace;
	}
	public void setBalace(Double balace) {
		this.balace = balace;
	}
	

}
