package com.smith.tomtom.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

import com.smith.tomtom.business.service.TraineeService;

@Path("/trainee")
public class TraineeEndpoint {

	@Inject
	private TraineeService service;
	
	@Path("/getAllTrainees")
	@GET
	public String getAllTrainees() {
		return service.getAllTrainees();
	}
	
	@Path("/createTrainee")
	@POST
	public String createTrainee(String jsonString) {
		return service.createTrainee(jsonString);
	}
	
	@Path("/deleteTrainee")
	@DELETE
	public String deleteTrainee(int id) {
		return service.deleteTrainee(id);
	}
	
	@Path("/updateTrainee")
	@PUT
	public String updateTrainee(int id, String jsonString) {
		return service.updateTrainee(id, jsonString);
	}
	
}
