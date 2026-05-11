package com.example.demo.controller;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.Person;

@Repository
public class PersonDAOPersonImpl implements PersonDAO<Person> {
  @PersistenceContext
  private EntityManager entityManager;

  public PersonDAOPersonImpl() {
  }

  @Override
  public List<Person> getAll() {
    Query query = entityManager.createQuery("from Person");
    @SuppressWarnings("unchecked")
    List<Person> list = query.getResultList();
    entityManager.close();
    return list;
  }

}
