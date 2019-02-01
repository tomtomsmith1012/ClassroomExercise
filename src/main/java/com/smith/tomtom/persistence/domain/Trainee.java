package com.smith.tomtom.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "Trainee", schema = "ADMIN")
public class Trainee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer traineeId;
	
	private String traineeName;
	
	private Integer classroomId;
	
	public Trainee() {
		
	}
	
	public Trainee(int traineeId, String traineeName, int classroomId) {
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.classroomId = classroomId;
	}

	public Integer getClassroomId() {
		return classroomId;
	}

	public void setClassroomId(Integer classroomId) {
		this.classroomId = classroomId;
	}

	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	
	public String toString() {
		return "Trainee ID: " + traineeId + ", Trainee Name: " + traineeName + ".";
	}
}
