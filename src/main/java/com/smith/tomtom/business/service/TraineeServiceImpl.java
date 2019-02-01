package com.smith.tomtom.business.service;

import javax.inject.Inject;

import com.smith.tomtom.persistence.repository.TraineeRepository;

public class TraineeServiceImpl implements TraineeService{
	
	@Inject
	private TraineeRepository repo;
	
	public String getAllTrainees() {
		return repo.getAllTrainees();
	}

	public String createTrainee(String jsonString) {
		return repo.createTrainee(jsonString);
	}

	public String deleteTrainee(int id) {
		return repo.deleteTrainee(id);
	}

	public String updateTrainee(int id, String jsonString) {
		return repo.updateTrainee(id, jsonString);
	}

}
