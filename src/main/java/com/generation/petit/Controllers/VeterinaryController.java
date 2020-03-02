package com.generation.petit.Controllers;

import javax.validation.Valid;

import com.generation.petit.Models.Veterinary;
import com.generation.petit.Repositories.VeterinaryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class VeterinaryController {
    @Autowired 
    private VeterinaryRepository veterinaryRepository;

    @GetMapping("/veterinary")
	public ResponseEntity<Iterable<Veterinary>> index() {
		return ResponseEntity.ok(veterinaryRepository.findAll());
    }
    
    @GetMapping("/veterinary/{id}")
    public ResponseEntity<Veterinary> getVeterinary(@PathVariable(value = "id") int id) {
        return ResponseEntity.ok(veterinaryRepository.findById(id).get());
    }
    @PostMapping("/veterinary")
	public ResponseEntity<Veterinary> createVet(@Valid @RequestBody Veterinary veterinary) {
		return ResponseEntity.ok(veterinaryRepository.save(veterinary));
    }
    @PutMapping(value="veterinary/{id}")
	public ResponseEntity<Veterinary> updateVet(@PathVariable int id, @RequestBody Veterinary veterinary) {
		if (!veterinaryRepository.findById(id).isPresent()){
			ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(veterinaryRepository.save(veterinary));
    }
    @DeleteMapping("/veterinary/{id}")
	public ResponseEntity deleteVet(@PathVariable String id){
		if (!veterinaryRepository.findById(Integer.parseInt(id)).isPresent()){
            ResponseEntity.badRequest().build();
            
		}
		veterinaryRepository.deleteById(Integer.parseInt(id));
		return ResponseEntity.ok().build();
	}
}