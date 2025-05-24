package com.example.demo.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class UnderGraduate {
	@Id
	private String id;
	private String name;
	private String email;
	private String gender;
	private String phone;
	private String degree;
	private String university;
	
	@ManyToMany
	@JoinTable(
		name = "under_graduate_sessions",
		joinColumns = @JoinColumn(name="under_graduate_id"),
		inverseJoinColumns = @JoinColumn(name="session_id")
	)
	private List<Session> sessions;
}
