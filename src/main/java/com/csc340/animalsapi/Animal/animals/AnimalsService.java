package com.csc340.animalsapi.Animal.animals;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalsService {


    @Autowired
    private AnimalRepository animalRepository;

    /**
     * Fetch all Animals.
     * @return a list of all Animals.
     */
    public List<Animals> getAllAnimals(){
        return animalRepository.findAll();

    }

    /**
     * Fetch one Animal.
     * @param animalId
     * @return one Animal.
     */
    public Animals getAnimalById(int animalId){
        return animalRepository.findById(animalId).orElse(null);
    }

    /**
     * Add a new Animal.
     * @param animal
     */
    public void addNewAnimal(Animals animal){
         animalRepository.save(animal);
    }

    /**
     * Update an existing Animal.
     * @param animalId
     * @param animal
     */
    public void updateAnimal(int animalId, Animals animal){
        Animals existing = getAnimalById(animalId);
        existing.setName(animal.getName());
        existing.setScientificName(animal.getScientificName());
        existing.setSpecies(animal.getSpecies());
        existing.setHabitat(animal.getHabitat());
        existing.setDescription(animal.getDescription());
        animalRepository.save(existing);
    }

    /**
     * Delete a unique Animal.
     * @param animalId
     */
    public void deleteAnimalById(int animalId){
        Animals animal = getAnimalById(animalId);
        if (animal != null){
            animalRepository.deleteById(animalId);
        } else {
            throw new RuntimeException(animalId + "not found");
        }
    }

    /**
     * Get all Animals by specie.
     * @param species
     * @return a list of Animals
     */
    public List<Animals> getAllAnimalsBySpecies(String species){
        return animalRepository.findBySpecies(species);
    }

    /**
     * Get all Animal have the same name.
     * @param name
     * @return a list of Animals.
     */
    public List<Animals> searchAnimalsByName(String name){
        return animalRepository.findByNameContaining(name);
    }

}
