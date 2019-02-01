package com.smith.tomtom.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED; 
import static javax.transaction.Transactional.TxType.SUPPORTS;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.smith.tomtom.persistence.domain.Trainee;
import com.smith.tomtom.util.JSONUtil;

@Transactional(SUPPORTS)
@Default
public class TraineeRepositoryDB implements TraineeRepository{

	@PersistenceContext(unitName = "primary")
	private EntityManager em;
	
	@Inject
	private JSONUtil json;

	public String getAllTrainees() {
		TypedQuery<Trainee> query = em.createQuery("SELECT a FROM Trainee a", Trainee.class);
		return json.getJSONForObject(query.getResultList());
	}

	@Transactional(REQUIRED)
	public String createTrainee(String jsonString) {
		Trainee trainee = json.getObjectForJSON(jsonString, Trainee.class);
		em.persist(trainee);
		return"{\"message\": \"trainee sucessfully added\"}";
	}

	@Transactional(REQUIRED)
	public String deleteTrainee(int id) {
		TypedQuery<Trainee> query = em.createQuery("DELETE a FROM Trainee a WHERE a.id = " + id, Trainee.class);
		return json.getJSONForObject(query.getResultList());
	}

	public String updateTrainee(int id, String jsonString) {
		Trainee trainee = json.getObjectForJSON(jsonString, Trainee.class);
		TypedQuery<Trainee> query = em.createQuery("DELETE a FROM Trainee a WHERE a.id = " + id, Trainee.class);
		query.getResultList();
		em.persist(trainee);
		return "{\"message\": \"account sucessfully updated\"}";
	}
	


}
