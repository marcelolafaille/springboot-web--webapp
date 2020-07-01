package ar.com.meulin.webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class AppController {

    @GetMapping("/link01")
    public String index(Model model) {
        model.addAttribute("titulo", "/app/link01");
        return "app";
    }


}
