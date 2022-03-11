package com.example.WaterEcommerceSystem.repository;

import com.example.WaterEcommerceSystem.module.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, String> {
}
