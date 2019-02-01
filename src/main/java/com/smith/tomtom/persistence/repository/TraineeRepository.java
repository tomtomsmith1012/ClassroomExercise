package com.smith.tomtom.persistence.repository;

public interface TraineeRepository {
	public String getAllTrainees();
	public String createTrainee(String jsonString);
	public String deleteTrainee(int id);
	public String updateTrainee(int id, String jsonString);

}
