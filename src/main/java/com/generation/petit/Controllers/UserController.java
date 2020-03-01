package com.generation.petit.Controllers;

import javax.validation.Valid;

import com.generation.petit.Models.User;
import com.generation.petit.Repositories.UserRepository;

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
public class UserController{

    @Autowired 
    private UserRepository userRepository;

    @GetMapping("/user")
	public ResponseEntity<Iterable<User>> index() {
		return ResponseEntity.ok(userRepository.findAll());
    }
    
    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable(value = "id") int id) {
        return ResponseEntity.ok(userRepository.findById(id).get());
    }
    @PostMapping("/user")
	public ResponseEntity<User> createVet(@Valid @RequestBody User user) {
		return ResponseEntity.ok(userRepository.save(user));
    }
    @PutMapping(value="user/{id}")
	public ResponseEntity<User> updateVet(@PathVariable int id, @RequestBody User user) {
		if (!userRepository.findById(id).isPresent()){
			ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(userRepository.save(user));
    }
    @DeleteMapping("/user/{id}")
	public ResponseEntity deleteVet(@PathVariable int id){
		if (!userRepository.findById(id).isPresent()){
            ResponseEntity.badRequest().build();
            
		}
		userRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}

}