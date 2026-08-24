package com.senai.cadastro;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import jakarta.persistence.Id;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/usuario")
public class UsuarioController {

    final Usuariorepository usuariorepository;

    ArrayList<Usuario> usuarios = new ArrayList<>();

    @GetMapping
    public List<Usuario> listarTodosUsuarios() {
        return usuariorepository.findAll();
    }

    @GetMapping("/{id}")
    public Usuario listarUsuarioPorId(@PathVariable UUID id) {

        Optional<Usuario> usuarioOpt = usuariorepository.findById(id);

        if (usuarioOpt.isPresent()){

            return usuarioOpt.get();

        } else {

            throw new RuntimeException("user não econtrado ou não existe");

        }

    }

    @PostMapping
    public Usuario cadastrarUsuario(@RequestBody Usuario usuario) {
        return usuariorepository.save(usuario);
    }

    @PutMapping("/{id}")
    public Usuario atualizarUsuario(@PathVariable UUID id, @RequestBody Usuario usuario) {

        Usuario usuarioExistente = listarUsuarioPorId();

        usuarioExistente.setNome(usuario.getNome());
        usuarioExistente.setCpf(usuario.getCpf());
        usuarioExistente.setEmail(usuario.getEmail());

        return usuariorepository.save(usuarioExistente);

    }
    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable UUID id) {

        usuariorepository.deleteById();

    }
}
