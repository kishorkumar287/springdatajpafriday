package com.cognizant.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
