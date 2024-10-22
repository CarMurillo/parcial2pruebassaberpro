package com.example.mongodb.carlos.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.mongodb.carlos.Entity.Coordinador;

public interface CoordinadorRepository extends MongoRepository<Coordinador, String>{ 
	Coordinador findByUser(String user);

}
