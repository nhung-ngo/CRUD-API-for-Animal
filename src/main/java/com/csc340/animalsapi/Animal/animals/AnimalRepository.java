package com.csc340.animalsapi.Animal.animals;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animals, Integer> {
    List<Animals> findBySpecies(String species);

    List<Animals> findByNameContaining(String name);
}
