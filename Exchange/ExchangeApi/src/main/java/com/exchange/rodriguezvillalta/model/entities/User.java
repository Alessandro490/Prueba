package com.exchange.rodriguezvillalta.model.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue; 
import javax.persistence.GenerationType; 
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_USER")
    Integer id;
	
	@Column(name= "NAME")
	String name;
	
	@Column(name = "USERLASTNAME")
	String lastname;
	
	@Column(name = "USERNAME")
	String username;
	
	@Column(name = "EMAIL")
	String email;
	
	@Column(name = "PHONENUMBER")
	Integer phonenumber;
	
	@Column(name = "PASSWORD")
	String password;
	
	@Column(name = "CONFIRMPASSWORD")
	String confirmpassword;

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
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Integer getPhonenumber() {
		return phonenumber;
	}
	
	public void setPhonenumber(Integer phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	
}
