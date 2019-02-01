package com.smith.tomtom.persistence.repository;

public interface ClassroomRepository {
	public String getAllClassrooms();
	public String createClassroom(String jsonString);
	public String deleteClassroom(int id);
	public String updateClassroom(int id, String jsonString);
}
