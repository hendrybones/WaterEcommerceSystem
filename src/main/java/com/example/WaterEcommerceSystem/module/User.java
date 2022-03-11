package com.example.WaterEcommerceSystem.module;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
public class User implements Serializable {
    @Id
    private String userName;
    private String firstName;
    private String lastName;
    private String password;
    private String email;

    // many users may have many roles
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name = "USER_ROLE",
            joinColumns = {
            @JoinColumn(name = "USER_ID")
            },
            inverseJoinColumns = {
            @JoinColumn(name = "ROLE_ID" )
            }
    )
    private Set<Role> roles;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
