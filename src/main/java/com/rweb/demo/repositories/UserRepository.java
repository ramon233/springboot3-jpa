package com.rweb.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rweb.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
