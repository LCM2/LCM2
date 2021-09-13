package com.cm.lcm2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cm.lcm2.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
