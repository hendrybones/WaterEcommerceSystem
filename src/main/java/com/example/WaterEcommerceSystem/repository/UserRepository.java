package com.example.WaterEcommerceSystem.repository;

import com.example.WaterEcommerceSystem.module.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,String> {
}
