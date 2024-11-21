package com.sedki.pcs.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sedki.pcs.entities.Marque;

@RepositoryRestResource(path = "marques")
public interface MarqueRepository extends JpaRepository<Marque, Long> {

}
