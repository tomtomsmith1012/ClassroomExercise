package com.smith.tomtom.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trainee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int traineeId;
	
	private String traineeName;
	
	public Trainee() {
		
	}
	
	public Trainee(int traineeId, String traineeName) {
		this.traineeId = traineeId;
		this.traineeName = traineeName;
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
