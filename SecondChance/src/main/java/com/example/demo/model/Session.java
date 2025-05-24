package com.example.demo.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Session {
	@Id
	private String id;
	private String name;
	private String description;
	private LocalTime time;
	private LocalDate date; 
}
