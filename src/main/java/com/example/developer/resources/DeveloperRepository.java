package com.example.developer.resources;

import com.example.developer.domain.Developer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource( path = "developers")
public interface DeveloperRepository extends CrudRepository<Developer, Long> {

    //List<Developer> findByNombresCompletos(@Param("nombresCompletos") String nombresCompletos);
  

  }