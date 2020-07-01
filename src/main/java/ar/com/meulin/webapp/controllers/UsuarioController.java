package ar.com.meulin.webapp.controllers;

import ar.com.meulin.webapp.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @GetMapping("/verusuario")
    public String usuario(Model model) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Marcelo");
        usuario.setApellido("Guancarlo");
        usuario.setEmail("guanca@mail.com");

        model.addAttribute("titulo", "Usuario");
        model.addAttribute("usuario", usuario);
        return "usuario/usuario";
    }

    @GetMapping("/verlistausuarios")
    public String listausuarios(Model model) {
        model.addAttribute("titulo", "Lista de usuarios");
        return "usuario/listausuarios";
    }

    @ModelAttribute("usuarios")
    public List<Usuario> cargarUsuario() {
        List<Usuario> usuarios = Arrays.asList(
                new Usuario("Marcelo", "Guancarlo", "mail@email.com"),
                new Usuario("Marcelo1", "Guancarlo1", "mail1@email.com"),
                new Usuario("Marcelo2", "Guancarlo2", null));
        return usuarios;
    }

}