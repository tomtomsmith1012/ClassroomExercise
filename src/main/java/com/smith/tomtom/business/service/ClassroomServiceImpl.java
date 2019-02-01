package com.smith.tomtom.business.service;

import javax.inject.Inject;

import com.smith.tomtom.persistence.repository.ClassroomRepository;

public class ClassroomServiceImpl implements ClassroomService{

	@Inject
	private ClassroomRepository repo;
	
	public String getAllClassrooms() {
		return repo.getAllClassrooms();
	}

	public String createClassroom(String jsonString) {
		return repo.createClassroom(jsonString);
	}

	public String deleteClassroom(int id) {
		return repo.deleteClassroom(id);
	}

	public String updateClassroom(int id, String jsonString) {
		return repo.updateClassroom(id, jsonString);
	}

}
