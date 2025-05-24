package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

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
	
	@ManyToMany
	@JoinTable(
		name= "post_graduate_sessions",
		joinColumns = @JoinColumn(name="post_graduate_id"),
		inverseJoinColumns = @JoinColumn(name="sessions_id")
	)
	private List<Session> sessions;
}
