package com.generation.petit.Repositories;

import java.util.List;

import com.generation.petit.Models.Veterinary;

import org.springframework.data.repository.CrudRepository;

public interface VeterinaryRepository extends CrudRepository<Veterinary, Integer> {
    
    List<Veterinary> findByVetName(String vet_name);
}