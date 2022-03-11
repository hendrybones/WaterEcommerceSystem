package com.example.WaterEcommerceSystem.module;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role {
    @Id
    private String roleName;
    private String roleDescriptionName;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDescriptionName() {
        return roleDescriptionName;
    }

    public void setRoleDescriptionName(String roleDescriptionName) {
        this.roleDescriptionName = roleDescriptionName;
    }
}
