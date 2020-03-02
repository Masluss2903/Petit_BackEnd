package com.generation.petit.Controllers;

import java.util.Optional;

import javax.validation.Valid;

import com.generation.petit.Models.Pet;
import com.generation.petit.Models.PetVaccines;
import com.generation.petit.Models.VaccineAssign;
import com.generation.petit.Models.Vaccines;
import com.generation.petit.Repositories.PetRepository;
import com.generation.petit.Repositories.VaccinesRepository;

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
	@Autowired
	private VaccinesRepository vaccineRepository;

	@GetMapping("/pet")
	public ResponseEntity<Iterable<Pet>> index() {
		return ResponseEntity.ok(petRepository.findAll());
	}

	@GetMapping("/pet/{id}")
	public ResponseEntity<Pet> getPet(@PathVariable(value = "id") String id) {
		return ResponseEntity.ok(petRepository.findById(Integer.parseInt(id)).get());
	}

	@PostMapping("/pet")
	public ResponseEntity<Pet> createPet(@Valid @RequestBody Pet pet) {
		return ResponseEntity.ok(petRepository.save(pet));
	}

	@PutMapping(value = "pet/{id}")
	public ResponseEntity<Pet> updatePet(@PathVariable String id, @RequestBody Pet pet) {
		if (!petRepository.findById(Integer.parseInt(id)).isPresent()) {
			ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(petRepository.save(pet));
	}

	@DeleteMapping("/pet/{id}")
	public ResponseEntity deletePet(@PathVariable Integer id) {
		if (!petRepository.findById(id).isPresent()) {
			ResponseEntity.badRequest().build();
		}
		petRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
	@PostMapping("/pet/{id}/vaccines")
	public ResponseEntity<Pet> addVaccine(@PathVariable Integer id, @Valid @RequestBody VaccineAssign vaccineAssign) {
		Optional<Pet> optionalPet = petRepository.findById(id);
		if (!optionalPet.isPresent()) {
			ResponseEntity.badRequest().build();
		}
		Pet pet = optionalPet.get();
		Optional<Vaccines> v = vaccineRepository.findById(vaccineAssign.getVaccineId());
		pet.addPetVaccine(new PetVaccines(v.get(), vaccineAssign.getDate()));
		
		return ResponseEntity.ok(petRepository.save(pet));
	}
}