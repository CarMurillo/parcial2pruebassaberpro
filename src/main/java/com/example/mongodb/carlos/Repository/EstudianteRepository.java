package com.example.mongodb.carlos.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.mongodb.carlos.Entity.Estudiante;

public interface EstudianteRepository extends MongoRepository<Estudiante, String>{ 
	Optional<Estudiante> findByUser(String user);

}
