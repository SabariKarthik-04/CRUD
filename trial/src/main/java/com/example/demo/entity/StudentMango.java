package com.example.demo.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Document(collection = "Students")
public class StudentMango {

	@Id
	private int rollNo;
	private String name;
	private String Address;
	public StudentMango() {}
	public StudentMango(int rollNo, String name, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		Address = address;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "StudentMango [rollNo=" + rollNo + ", name=" + name + ", Address=" + Address + "]";
	}

	 
	
}
