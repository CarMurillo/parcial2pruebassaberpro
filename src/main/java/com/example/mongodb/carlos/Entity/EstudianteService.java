package com.example.mongodb.carlos.Entity;

import java.util.List;
import java.util.function.ToDoubleFunction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mongodb.carlos.Repository.EstudianteRepository;


@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository; 

   
    public double calcularPromedioTotal() {
        List<Estudiante> estudiantes = estudianteRepository.findAll();
        double sumaTotal = estudiantes.stream()
                                      .mapToDouble(Estudiante::getPuntajetotal)
                                      .sum();
        return estudiantes.isEmpty() ? 0 : sumaTotal / estudiantes.size();
    }

    public double calcularPromedioPorPrueba(ToDoubleFunction<Estudiante> getter) {
        List<Estudiante> estudiantes = estudianteRepository.findAll();
        double suma = estudiantes.stream()
                                 .mapToDouble(getter)
                                 .sum();
        return estudiantes.isEmpty() ? 0 : suma / estudiantes.size();
    }
}



