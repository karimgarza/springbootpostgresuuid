package com.example.demouuidoptional.controllers;

import com.example.demouuidoptional.model.Person;
import com.example.demouuidoptional.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController("/person")
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping
    public String get(){

        Person person = new Person();
        person.setFirstName("Karim");
        person.setLastName("Garza");
        personRepository.save(person);

        Person person2 = new Person();
        person2.setLastName("Rodriguez");
        person2.setFirstName("Luis");
        person2.setId(UUID.randomUUID());
        personRepository.save(person2);

        return "hello";
    }
}
