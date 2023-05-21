package com.geekster.Food.delivery.platform.controller;

import com.geekster.Food.delivery.platform.dao.SignInInput;
import com.geekster.Food.delivery.platform.dao.SignInOutput;
import com.geekster.Food.delivery.platform.dao.SignUpInput;
import com.geekster.Food.delivery.platform.dao.SignUpOutput;
import com.geekster.Food.delivery.platform.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public SignUpOutput signUp(@RequestBody SignUpInput signUpDto){
        return userService.signUp(signUpDto);
    }

    @PostMapping("/signin")
    public SignInOutput signIn(@RequestBody SignInInput signInDto){
        return userService.signIn(signInDto);
    }
}
