package com.example.demo.repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entities.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
  @Override
  Optional<Person> findById(Long name);
}
