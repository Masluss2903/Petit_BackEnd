package com.generation.petit.Repositories;

import java.util.List;

import com.generation.petit.Models.Client;

import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Integer>{
    
    List<Client> findByClientName(String client_name);
}