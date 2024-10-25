package com.example.mongodb.carlos.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.mongodb.carlos.Entity.Estudiante;
import com.example.mongodb.carlos.exception.NotFoundException;
import com.example.mongodb.carlos.Repository.EstudianteRepository;



@RestController
@RequestMapping(value = "/api/estudiante")
public class CoordinadorRestController {
	
	 @Autowired
	    private EstudianteRepository estudianteRepository;
	 
	 @GetMapping("/")
	    public List<Estudiante> getAllEstudiante() {
	        return estudianteRepository.findAll();
	    }

	    @GetMapping("/{id}")
	    public Estudiante getEstudianteById(@PathVariable String id) {
	        return estudianteRepository.findById(id).orElseThrow(() -> new NotFoundException("Estudiante no encontrado"));
	    }

	    @PostMapping("/")
	    public Estudiante saveEstudiante(@RequestBody Map<String, Object> body) {
	        ObjectMapper mapper = new ObjectMapper();
	        Estudiante estudiante = mapper.convertValue(body, Estudiante.class);
	        return estudianteRepository.save(estudiante);
	    }

	    @PutMapping("/{id}")
	    public Estudiante updateEstudiante(@PathVariable String id, @RequestBody Map<String, Object> body) {
	        ObjectMapper mapper = new ObjectMapper();
	        Estudiante estudiante = mapper.convertValue(body, Estudiante.class);
	        estudiante.setId(id);
	        return estudianteRepository.save(estudiante);
	    }

	    @DeleteMapping("/{id}")
	    public Estudiante deleteEstudiante(@PathVariable String id) {
	    	Estudiante estudiante = estudianteRepository.findById(id).orElseThrow(() -> new NotFoundException("Estudiante no encontrado"));
	    	estudianteRepository.deleteById(id);
	        return estudiante;
	    }
	 

}

