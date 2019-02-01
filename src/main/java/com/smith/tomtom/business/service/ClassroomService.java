package com.smith.tomtom.business.service;

public interface ClassroomService {
	String getAllClassrooms();
	String createClassroom(String jsonString);
	String deleteClassroom(int id);
	String updateClassroom(int id, String jsonString);
}
