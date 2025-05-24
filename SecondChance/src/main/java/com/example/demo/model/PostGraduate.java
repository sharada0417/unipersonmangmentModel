package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PostGraduate {
	@Id
	private String id;
	private String name;
	private String email;
	private String gender;
	private String phone;
	private String institute;
	private String reserchInterest;
	private String secondDegree;
}
