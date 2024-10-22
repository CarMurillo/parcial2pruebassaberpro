package com.example.mongodb.carlos.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.mongodb.carlos.Entity.Coordinador;
import com.example.mongodb.carlos.Entity.Estudiante;
import com.example.mongodb.carlos.Repository.CoordinadorRepository;
import com.example.mongodb.carlos.Repository.EstudianteRepository;

@Controller
public class LoginController {

    @Autowired
    private CoordinadorRepository coordinadorRepository;

    @Autowired
    private EstudianteRepository estudianteRepository;
    

    
    @GetMapping("/")
    public String landingPage() {
        return "Rol"; 
    }
    
    @GetMapping("/login/coordinador")
    public String coordinadorLogin() {
        return "login-coordinador"; 
    }

    @PostMapping("/login/coordinador")
    public String coordinadorAuth(@RequestParam("user") String user, @RequestParam("password") String password, Model model) {
        Coordinador coordinador = coordinadorRepository.findByUser(user);

        if (coordinador != null && coordinador.getPassword().equals(password)) {
            return "redirect:/estudiante/";
        }

        model.addAttribute("error", "Usuario o contraseña incorrecta");
        return "Login-coordinador";
    }

    @GetMapping("/login/estudiante")
    public String estudianteLogin() {
        return "Login-estudiante"; // 
    }

    @PostMapping("/login/estudiante")
    public String estudianteAuth(@RequestParam("user") String user, @RequestParam("password") String password, Model model) {
        Optional<Estudiante> estudianteOpt = estudianteRepository.findByUser(user);

        if (estudianteOpt.isPresent()) { 
            Estudiante estudiante = estudianteOpt.get(); 
            if (estudiante.getPassword().equals(password)) {
                model.addAttribute("estudiante", estudiante); 
                return "resumen-estudiante"; 
            }
        }

        model.addAttribute("error", "Usuario o contraseña incorrecta");
        return "login-estudiante";
    }

}

