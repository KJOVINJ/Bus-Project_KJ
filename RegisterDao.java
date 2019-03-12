package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.entity.Register;

@Repository
public class RegisterDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public void add(Register register) {
		entityManager.persist(register);
	}
	
	public List<Register> fetchAll() {
		return entityManager.createQuery("select r from Register r").getResultList();
	}
	
}
