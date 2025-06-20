package com.rodrigo.backend;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MedicoRepository extends MongoRepository<Medico, String> {
    // Métodos customizados se precisar
}
