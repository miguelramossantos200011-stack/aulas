package com.senai.cadstro;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/User")
public class UserController {

    ArrayList<User> users = new ArrayList<>();

    @GetMapping("/list")
    public ArrayList<User> list(){

        return users;

    }

    @PostMapping("/register")
    public User CadastroUser(@RequestBody User user){

        users.add(user);
        return users.getLast();

    }

}
