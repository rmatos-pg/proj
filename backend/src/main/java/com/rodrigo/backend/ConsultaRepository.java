package com.rodrigo.backend;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ConsultaRepository extends MongoRepository<Consulta, String> {
    // Métodos customizados se precisar
}
