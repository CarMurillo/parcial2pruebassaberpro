package com.example.mongodb.carlos.Controller;

import com.example.mongodb.carlos.Entity.Estudiante;
import com.example.mongodb.carlos.Repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/estudiantes")
public class EstudianteRestController {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @PostMapping("/login")
    public Estudiante loginEstudiante(@RequestParam String user, @RequestParam String password) {
        Optional<Estudiante> estudianteOpt = estudianteRepository.findByUser(user);

        if (estudianteOpt.isPresent() && estudianteOpt.get().getPassword().equals(password)) {
            return estudianteOpt.get();
        } else {
            return null;
        }
    }

    @GetMapping("/{id}")
    public Estudiante obtenerEstudiantePorId(@PathVariable String id) {
        return estudianteRepository.findById(id).orElse(null);
    }
}

