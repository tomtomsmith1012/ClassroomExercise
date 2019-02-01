package com.smith.tomtom.persistence.repository;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.inject.Alternative;

import com.smith.tomtom.persistence.domain.Classroom;
import com.smith.tomtom.persistence.domain.Trainee;
import com.smith.tomtom.util.JSONUtil;

@Alternative
public class TraineeMap {

	public Map<Long, Trainee> trainees = new HashMap<>();
	
	JSONUtil json = new JSONUtil();

	public String getAllTrainees() {
		String output = "";
		for (long i = 0; i < trainees.size(); i++) {
			output += json.getJSONForObject(trainees.get(i));
		}
		return output;	
	}

	public String createTrainees(String jsonString) {
		Trainee trainee = json.getObjectForJSON(jsonString, Trainee.class);
		trainees.put((long) trainees.size(), trainee);
		return "Trainee created successfully.";
	}

	public String deleteTrainees(int id) {
		trainees.remove(id);
		return "Trainees deleted successfully.";  
	}

	public String updateTrainees(int id, String jsonString) {
		Trainee trainee = json.getObjectForJSON(jsonString, Trainee.class);
		trainees.replace((long) id, trainee);
		return "Trainee updated successfully";
	}
}
