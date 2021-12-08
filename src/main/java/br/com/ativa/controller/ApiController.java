package br.com.ativa.controller;

import br.com.ativa.model.Usuario;
import br.com.ativa.services.UsuarioService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpClient;

@RestController
public class ApiController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping(value = "/")
    public ResponseEntity<String> home(){
        return new ResponseEntity<String>("bem vindo a api",HttpStatus.ACCEPTED);
    }

    @GetMapping(value = "/usuario")
    public ResponseEntity<String> getUsuario(){
        Usuario usuario1 = Usuario.builder().id(1).Nome("Alexandre").build();

        return new ResponseEntity<String>(new Gson().toJson(usuario1), HttpStatus.OK);
    }

    @PostMapping(value = "/usuario")
    public ResponseEntity<String> postUsuario(@RequestBody Usuario usuario){
        return new ResponseEntity<String>(usuarioService.gravarUsuario(), HttpStatus.OK);
    }
}
