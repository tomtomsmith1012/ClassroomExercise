package com.smith.tomtom.business.service;

public interface TraineeService {
	String getAllTrainees();
	String createTrainee(String jsonString);
	String deleteTrainee(int id);
	String updateTrainee(int id, String jsonString);
}
