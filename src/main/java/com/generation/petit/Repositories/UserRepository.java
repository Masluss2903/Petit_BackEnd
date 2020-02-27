package com.generation.petit.Repositories;

import com.generation.petit.Models.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    
}