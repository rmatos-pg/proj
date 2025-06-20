package com.rodrigo.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository medicoRepository;

    @GetMapping
    public List<Medico> listar() {
        return medicoRepository.findAll();
    }

    @PostMapping
    public Medico criar(@RequestBody Medico medico) {
        return medicoRepository.save(medico);
    }

    @GetMapping("/{id}")
    public Medico buscarPorId(@PathVariable String id) {
        return medicoRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable String id) {
        medicoRepository.deleteById(id);
    }
}
