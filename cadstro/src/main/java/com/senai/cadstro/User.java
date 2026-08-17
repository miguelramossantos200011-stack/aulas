package com.senai.cadstro;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User{

    private String cpf;
    private String nome;
    private String telefone;
    private String email;

}
