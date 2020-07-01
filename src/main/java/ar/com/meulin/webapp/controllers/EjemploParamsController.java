package ar.com.meulin.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class EjemploParamsController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("titulo", "Enviar parámetros del request HTTP GET - URL");

        return "params/index";
    }


    @GetMapping("/string")
    public String param(@RequestParam(defaultValue = "ValorPorDefecto") String texto, Model model) {
        model.addAttribute("titulo", "Recibir parámetros del request HTTP GET");
        model.addAttribute("resultado", "El texto enviado es : " + texto);

        return "params/ver";
    }
}
