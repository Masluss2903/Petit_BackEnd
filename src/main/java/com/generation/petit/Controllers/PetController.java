package com.generation.petit.Controllers;

import javax.validation.Valid;

import com.generation.petit.Models.Pet;
import com.generation.petit.Repositories.PetRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;


@CrossOrigin
@RestController
public class PetController {
    @Autowired 
	private PetRepository petRepository;
	
	@GetMapping("/pet")
	public ResponseEntity<Iterable<Pet>> index() {
		return ResponseEntity.ok(petRepository.findAll());
	}

	@GetMapping("/pet/{id}")
	public ResponseEntity<Pet> getPet(@PathVariable(value = "id") int id) {
		return ResponseEntity.ok(petRepository.findById(id).get());
	}

	@PostMapping("/pet")
	public ResponseEntity<Pet> createPet(@Valid @RequestBody Pet pet) {
		return ResponseEntity.ok(petRepository.save(pet));
	}
	@PutMapping(value="pet/{id}")
	public ResponseEntity<Pet> updatePet(@PathVariable String id, @RequestBody Pet pet) {
		if (!petRepository.findById(Integer.parseInt(id)).isPresent()){
			ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(petRepository.save(pet));
	}

	@DeleteMapping("/pet/{id}")
	public ResponseEntity deletePet(@PathVariable String id){
		if (!petRepository.findById(Integer.parseInt(id)).isPresent()){
			ResponseEntity.badRequest().build();
		}
		petRepository.deleteById(Integer.parseInt(id));
		return ResponseEntity.ok().build();
	}

	
}