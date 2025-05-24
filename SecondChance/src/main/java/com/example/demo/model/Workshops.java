package com.example.demo.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Workshops {
	@Id
	private int id;
	private String description;
	private String name;
	private LocalDate startDate;
	private LocalDate endDate;
}
