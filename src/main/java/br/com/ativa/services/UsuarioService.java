package br.com.ativa.services;

import br.com.ativa.model.Usuario;
import com.google.gson.Gson;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    public String gravarUsuario() {

        return "teste"; //"usuario gravado " + new Gson().toJson(usuario);
    }
}
