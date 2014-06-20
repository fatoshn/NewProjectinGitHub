package com.otel.rezervasyon.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Personel implements Serializable{
	
	@Id
	@GeneratedValue
	private long Id;
	
	private String name;
	private String surname;
	private String password;
	private String email;
	private String username;
	private Date startWork;
	private Date endWork;
	
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getStartWork() {
		return startWork;
	}
	public void setStartWork(Date startWork) {
		this.startWork = startWork;
	}
	public Date getEndWork() {
		return endWork;
	}
	public void setEndWork(Date endWork) {
		this.endWork = endWork;
	}
	

}
