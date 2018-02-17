package com.example.demouuidoptional.repositories;

import com.example.demouuidoptional.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonRepository extends JpaRepository<Person, UUID>{

}
