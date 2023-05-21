package com.geekster.Food.delivery.platform.controller;

import com.geekster.Food.delivery.platform.model.Role;
import com.geekster.Food.delivery.platform.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    RoleService roleService;

    @PostMapping("/{email}")
    public String addRole(@PathVariable String email, @RequestBody Role role){
        return roleService.addRole(email,role);
    }
}
