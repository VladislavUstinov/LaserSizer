package com.lasersizer.repository;


import com.lasersizer.model.Role;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


public interface RoleRepository extends CrudRepository<Role, Long> {
}