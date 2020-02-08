package com.generation.petit;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class PetController {
    @Autowired 
    private PetRepository petRepository;

	@GetMapping("/pet/{id}")
	public Optional<Pet> getPet(@PathVariable(value = "id") int id) {
		return petRepository.findById(id);
	}

	@GetMapping("/pet")
	public Iterable<Pet> getPet() {
		return petRepository.findAll();
	}
}