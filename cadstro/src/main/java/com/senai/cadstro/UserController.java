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

    @PostMapping("/registrar")
    public User CadastroUser(@RequestBody User user){

        users.add(user);
        return users.getLast();

    }

    @PutMapping("/{id}")
    public User UpdateUser(@PathVariable int id, @RequestBody User user){

        User userupdated = users.get(id);

        userupdated.setNome(user.getNome());
        userupdated.setEmail(user.getEmail());
        userupdated.setCpf(user.getCpf());

        return userupdated;

    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id){

        users.remove(id);

    }

}
