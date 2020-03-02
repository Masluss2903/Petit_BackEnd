package com.generation.petit.Controllers;

import javax.validation.Valid;

import com.generation.petit.Models.Vaccines;
import com.generation.petit.Repositories.VaccinesRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@CrossOrigin
@RestController
public class VaccinesController {
    @Autowired 
    private VaccinesRepository vaccinesRepository;

    @GetMapping("/vaccines")
	public ResponseEntity<Iterable<Vaccines>> index() {
		return ResponseEntity.ok(vaccinesRepository.findAll());
    }
    
    @GetMapping("/vaccines/{id}")
    public ResponseEntity<Vaccines> getVaccines(@PathVariable(value = "id") int id) {
        return ResponseEntity.ok(vaccinesRepository.findById(id).get());
    }
    @PostMapping("/vaccines")
	public ResponseEntity<Vaccines> createVaccines(@Valid @RequestBody Vaccines vaccines) {
		return ResponseEntity.ok(vaccinesRepository.save(vaccines));
    }
    @PutMapping(value="/vaccines/{id}")
	public ResponseEntity<Vaccines> updateVaccines(@PathVariable int id, @RequestBody Vaccines vaccines) {
		if (!vaccinesRepository.findById(id).isPresent()){
			ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(vaccinesRepository.save(vaccines));
    }
    @DeleteMapping("/vaccines/{id}")
	public ResponseEntity deleteVaccines(@PathVariable int id){
		if (!vaccinesRepository.findById(id).isPresent()){
            ResponseEntity.badRequest().build();
            
		}
		vaccinesRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}


}