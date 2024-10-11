package com.csc340.animalsapi.Animal.animals;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/animals")
public class AnimalsController {


    @Autowired
    private AnimalsService service;

    /**
     * Get a list of Animals.
     * @return a list of Animals.
     */
    @GetMapping("/all")
    public List<Animals> getAllAnimals(){
        return service.getAllAnimals();
    }

    /**
     * Get one Animal by Id
     * @param animalID
     * @return one Animal.
     */
    @GetMapping("{animalID}")
    public Animals getOneAnimal(@PathVariable int animalID){

        return service.getAnimalById(animalID);
    }

    /**
     * Create a new Animal
     * @param animal
     * @return the updated list of Animals.
     */
    @PostMapping("/new")
    public List<Animals> addNewAnimal(@RequestBody Animals animal){
        service.addNewAnimal(animal);
        return service.getAllAnimals();
    }

    /**
     * Update an existing Animal.
     * @param animalId
     * @param animal
     * @return the updated Animal.
     */
    @PutMapping("/update/{animalId}")
    public Animals updateAnimal(@PathVariable int animalId, @RequestBody Animals animal){
        service.updateAnimal(animalId, animal);
        return service.getAnimalById(animalId);
    }

    /**
     * Delete a Animal.
     * @param animalId
     * @return the updated list of Animals.
     */
    @DeleteMapping("/delete/{animalId}")
    public List<Animals> deleteAnimalById(@PathVariable int animalId){
        try {
            service.deleteAnimalById(animalId);
            return service.getAllAnimals();
        } catch (RuntimeException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,animalId + "not found", e);
        }
    }

    /**
     * Get all Animal have the same specie.
     * @param species
     * @return a list of Animals.
     */
    @GetMapping("/species/{species}")
    public List<Animals> getAllAnimalsBySpecies(@PathVariable String species){

        return service.getAllAnimalsBySpecies(species);
    }

    /**
     * Get all Animal have the same name.
     * @param name
     * @return a list of Animals.
     */
    @GetMapping("/search")
    public List<Animals> searchAnimalsByName(@RequestParam String name){

        return service.searchAnimalsByName(name);
    }
}
