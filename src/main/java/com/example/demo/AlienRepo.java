package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.ResponseBody;

//@RepositoryRestResource(collectionResourceRel = "aliens",path = "aliens")   // http://localhost:8080/aliens
public interface AlienRepo extends JpaRepository<Alien, Integer> {

}
