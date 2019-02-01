package com.smith.tomtom.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.smith.tomtom.persistence.domain.Classroom;
import com.smith.tomtom.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class ClassroomRepositoryDB implements ClassroomRepository{

	@PersistenceContext(unitName = "primary")
	private EntityManager em;
	
	@Inject
	private JSONUtil json;
	
	public String getAllClassrooms() {
		TypedQuery<Classroom> query = em.createQuery("SELECT a FROM Classroom a", Classroom.class);
		return json.getJSONForObject(query.getResultList());
	}

	@Transactional(REQUIRED)
	public String createClassroom(String jsonString) {
		Classroom classroom = json.getObjectForJSON(jsonString, Classroom.class);
		em.persist(classroom);
		return"{\"message\": \"classroom sucessfully added\"}";
	}

	@Transactional(REQUIRED)
	public String deleteClassroom(int id) {
		TypedQuery<Classroom> query = em.createQuery("DELETE a FROM Classroom a WHERE a.id = " + id, Classroom.class);
		return json.getJSONForObject(query.getResultList());
	}

	@Transactional(REQUIRED)
	public String updateClassroom(int id, String jsonString) {
		Classroom classroom = json.getObjectForJSON(jsonString, Classroom.class);
		TypedQuery<Classroom> query = em.createQuery("DELETE a FROM Classroom a WHERE a.id = " + id, Classroom.class);
		query.getResultList();
		em.persist(classroom);
		return "{\"message\": \"classroom sucessfully updated\"}";
	}

}
