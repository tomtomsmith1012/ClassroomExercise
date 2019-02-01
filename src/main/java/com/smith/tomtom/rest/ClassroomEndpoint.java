package com.smith.tomtom.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;

import com.smith.tomtom.business.service.ClassroomService;

@Path("/classroom")
public class ClassroomEndpoint {

	@Inject
	private ClassroomService service;
	
	@Path("/getAllClassrooms")
	@GET
	public String getAllClassrooms() {
		return service.getAllClassrooms();
	}
	
	@Path("/createClassroom")
	@POST
	public String createClassroom(String jsonString) {
		return service.createClassroom(jsonString);
	}
	
	@Path("/deleteClassroom")
	@DELETE
	public String deleteCLassroom(int id) {
		return service.deleteClassroom(id);
	}
	
	@Path("/updateClassroom")
	@PUT
	public String updateClassroom(int id, String jsonString) {
		return service.updateClassroom(id, jsonString);
	}
}
