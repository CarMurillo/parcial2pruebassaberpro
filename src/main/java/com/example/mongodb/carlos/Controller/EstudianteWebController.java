package com.example.mongodb.carlos.Controller;

import com.example.mongodb.carlos.Entity.Estudiante;

import jakarta.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class EstudianteWebController {

    @GetMapping("/estudiante/resumen")
    public String mostrarResumen(HttpSession session, Model model) {
        Estudiante estudiante = (Estudiante) session.getAttribute("estudiante");

        if (estudiante != null) {
            model.addAttribute("estudiante", estudiante);
            return "resumen-estudiante"; 
        } else {
            return "redirect:/login/estudiante"; 
        }
    }
}


