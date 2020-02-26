package com.generation.petit.Controllers;

import javax.validation.Valid;

import com.generation.petit.Models.Client;
import com.generation.petit.Repositories.ClientRepository;

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
public class ClientController {
    @Autowired 
    private ClientRepository clientRepository;

	@GetMapping("/client")
	public ResponseEntity<Iterable<Client>> index() {
		return ResponseEntity.ok(clientRepository.findAll());
	}

    @GetMapping("/client/{id}")
    public ResponseEntity<Client> getClient(@PathVariable(value = "id") int id) {
        return ResponseEntity.ok(clientRepository.findById(id).get());
    }
    
    @PostMapping("/client")
	public ResponseEntity<Client> createClient(@Valid @RequestBody Client client) {
		return ResponseEntity.ok(clientRepository.save(client));
    }
    
    @PutMapping(value="client/{id}")
	public ResponseEntity<Client> updateClient(@PathVariable String id, @RequestBody Client client) {
		if (!clientRepository.findById(Integer.parseInt(id)).isPresent()){
			ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(clientRepository.save(client));
    }
    
    @DeleteMapping("/client/{id}")
	public ResponseEntity deletePet(@PathVariable int id){
		if (!clientRepository.findById(id).isPresent()){
			ResponseEntity.badRequest().build();
		}
		clientRepository.deleteById(id);
		return ResponseEntity.ok().build();
	}

}