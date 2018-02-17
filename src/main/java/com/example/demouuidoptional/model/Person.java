package com.example.demouuidoptional.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Data
@Entity
public class Person {

    @Id
    @GeneratedValue(generator = "inquisitive-uuid")
    @GenericGenerator(name = "inquisitive-uuid", strategy = "com.example.demouuidoptional.utilities.InquisitiveUUIDGenerator")
    private UUID id;
    private String firstName;
    private String lastName;

}
