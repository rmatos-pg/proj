package com.rodrigo.backend;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PacienteRepository extends MongoRepository<Paciente, String> {
    // Métodos customizados se precisar, por exemplo:
    // Optional<Paciente> findByCpf(String cpf);
}
