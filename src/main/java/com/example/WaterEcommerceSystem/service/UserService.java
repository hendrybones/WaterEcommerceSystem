package com.example.WaterEcommerceSystem.service;

import com.example.WaterEcommerceSystem.module.Role;
import com.example.WaterEcommerceSystem.module.User;
import com.example.WaterEcommerceSystem.repository.RoleRepository;
import com.example.WaterEcommerceSystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.authentication.PasswordEncoderParser;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    public User registerNewUser(User user){
        return userRepository.save(user);
    }
    public void initRoleAndUser(){
        Role adminRole=new Role();
        adminRole.setRoleName("admin");
        adminRole.setRoleDescriptionName("admin role");
        roleRepository.save(adminRole);

        Role userRole=new Role();
        userRole.setRoleName("user");
        userRole.setRoleDescriptionName("default role for newly created user");
        roleRepository.save(userRole);

        User adminUser=new User();
        adminUser.setFirstName("admin");
        adminUser.setLastName("admin");
        adminUser.setUserName("admin123");
        adminUser.setPassword(getEncodedPassword("admin@pass"));
        adminUser.setEmail("hendrymwamburi@gmai.com");
        Set<Role> adminRoles=new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setRoles(adminRoles);
        userRepository.save(adminUser);

        User user=new User();
        user.setFirstName("hendry");
        user.setLastName("mwamburi");
        user.setUserName("hendry123");
        user.setPassword(getEncodedPassword("hendry@pass"));
        user.setEmail("hendrymwamburi@gmai.com");
        Set<Role> userRoles=new HashSet<>();
        adminRoles.add(userRole);
        user.setRoles(userRoles);
        userRepository.save(user);

    }
    public String getEncodedPassword(String password){
        return passwordEncoder.encode(password);

    }
}
