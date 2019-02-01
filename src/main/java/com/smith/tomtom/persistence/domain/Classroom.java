package com.smith.tomtom.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classroom {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int classroomId;
	
	private String trainer;
	
	private Trainee[] trainees;
	
	public Classroom() {
		
	}
	
	public Classroom(int classroomId, String trainer, Trainee[] trainees) {
		this.classroomId = classroomId;
		this.trainer = trainer;
		this.trainees = trainees;
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

	public Trainee[] getTrainees() {
		return trainees;
	}

	public void setTrainees(Trainee[] trainees) {
		this.trainees = trainees;
	}
	
}
