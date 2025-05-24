package com.example.demo.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Session {
	@Id
	private String id;
	private String name;
	private String description;
	private LocalTime time;
	private LocalDate date; 
	
	
	@ManyToOne
	@JoinColumn(name="workshop_id")
	private Workshops workshops;
	
	@ManyToMany(mappedBy = "sessions")
	private List<Presenter> presenters;
	
	@ManyToMany(mappedBy = "sessions")
	private List<UnderGraduate> undergraduates;
}
