package com.jsp.RailwayTicketBooking.entity;

import org.springframework.stereotype.Component;

import com.jsp.RailwayTicketBooking.util.Gender;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

@Entity
@Component
@Valid
public class Passenger {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	private int id;
	@NotNull
	private String name;
	private int age;
	private Gender gender;
	private long phone;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
	

}
