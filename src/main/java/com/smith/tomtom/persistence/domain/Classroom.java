package com.smith.tomtom.persistence.domain;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
//@Table(name = "Classroom", schema = "ADMIN")
public class Classroom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer classroomId;
	
	private String trainer;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "classroomId", cascade = CascadeType.ALL)
	private Collection<Trainee> trainees = new LinkedHashSet<Trainee>();
	
	
	//@OneToMany
	//@JoinTable(name = "Trainee", joinColumns = @JoinColumn(name = "classroomId"), inverseJoinColumns = @JoinColumn(name = "classroomId"))
	//private List<Trainee> trainees;
	
	public Classroom() {
		
	}
	
	public Classroom(int classroomId, String trainer) {
		this.classroomId = classroomId;
		this.trainer = trainer;
	}

	public int getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(int classroomId) {
		this.classroomId = classroomId;
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}


	
}
