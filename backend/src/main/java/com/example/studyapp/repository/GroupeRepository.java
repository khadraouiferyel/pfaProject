package com.example.studyapp.repository;

import com.example.studyapp.model.Groupe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GroupeRepository extends MongoRepository<Groupe, String> {
    // Vous pouvez ajouter des méthodes personnalisées si nécessaire
}
