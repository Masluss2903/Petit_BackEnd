package com.generation.petit.Repositories;

import com.generation.petit.Models.Pet;

import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Integer>{
    

}