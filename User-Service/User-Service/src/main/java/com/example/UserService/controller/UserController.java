package com.example.UserService.controller;

import com.example.UserService.entity.User;
import com.example.UserService.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/user")
public class UserController {

    private UserService userService;

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User user){
        User user1 = userService.login(user.getUsername(), user.getPassword());

        if(user1 != null){
            return new ResponseEntity<>(user1, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }
    }



    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody User user){
        try{
            userService.register(user);
            return new ResponseEntity<>("User Registered Successfully" , HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>("Registration Failed" , HttpStatus.BAD_REQUEST);
        }
    }




}
