package com.devsuper.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuper.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
