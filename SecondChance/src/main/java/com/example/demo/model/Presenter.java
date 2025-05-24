package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Presenter {
	@Id
	private String id;
	private String name;
	private String email;
	private String gender;
	private String phone;
	private String affilication;
	private String country;
	private String jobTitle;
	
	
}
