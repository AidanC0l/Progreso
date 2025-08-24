package com.example.progreso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class ProgresoApplication {

    // Aquí defines el porcentaje directamente en el código
    private int porcentaje = 30;

    public static void main(String[] args) {
        SpringApplication.run(ProgresoApplication.class, args);
    }

    @GetMapping("/progreso")
    public String mostrarProgreso(Model model) {
        model.addAttribute("progreso", porcentaje);
        return "index"; // Renderiza templates/index.html
    }
}
