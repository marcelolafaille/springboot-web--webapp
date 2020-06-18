package ar.com.meulin.webapp.controllers;

import ar.com.meulin.webapp.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/app")
public class AppController {

    @GetMapping("/link01")
    public String index(Model model) {
        model.addAttribute("titulo", "/app/link01");
        return "app";
    }

    @GetMapping("/usuario")
    public String usuario(Model model) {

        Usuario usuario = new Usuario();
        usuario.setNombre("Marcelo");
        usuario.setApellido("Guancarlo");
        usuario.setEmail("guanca@mail.com");

        model.addAttribute("titulo", "Usuario");
        model.addAttribute("usuario", usuario);
        return "usuario";
    }

    @GetMapping("/listausuarios")
    public String listausuarios(Model model) {

        List<Usuario> usuarios = new ArrayList<>();

        usuarios.add(new Usuario("Marcelo", "Guancarlo", "mail@email.com"));
        usuarios.add(new Usuario("Marcelo1", "Guancarlo1", "mail1@email.com"));
        usuarios.add(new Usuario("Marcelo2", "Guancarlo2", null));


        model.addAttribute("titulo", "Lista de usuarios");
        model.addAttribute("usuarios", usuarios);
        return "listausuarios";
    }

}
