package com.smith.tomtom.persistence.repository;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.inject.Alternative;

import com.smith.tomtom.persistence.domain.Classroom;
import com.smith.tomtom.util.JSONUtil;

@Alternative
public class ClassroomMap implements ClassroomRepository{

	public Map<Long, Classroom> classrooms = new HashMap<>();
	
	JSONUtil json = new JSONUtil();

	public String getAllClassrooms() {
		String output = "";
		for (long i = 0; i < classrooms.size(); i++) {
			output += json.getJSONForObject(classrooms.get(i));
		}
		return output;	
	}

	public String createClassroom(String jsonString) {
		Classroom classroom = json.getObjectForJSON(jsonString, Classroom.class);
		classrooms.put((long) classrooms.size(), classroom);
		return "Classroom created successfully.";
	}

	public String deleteClassroom(int id) {
		classrooms.remove(id);
		return "Classroom deleted successfully.";  
	}

	public String updateClassroom(int id, String jsonString) {
		Classroom classroom = json.getObjectForJSON(jsonString, Classroom.class);
		classrooms.replace((long) id, classroom);
		return "Classroom updated successfully";
	}

}
