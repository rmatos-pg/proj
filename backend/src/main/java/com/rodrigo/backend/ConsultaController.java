package com.rodrigo.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    @Autowired
    private ConsultaRepository consultaRepository;

    @GetMapping
    public List<Consulta> listar() {
        return consultaRepository.findAll();
    }

    @PostMapping
    public Consulta criar(@RequestBody Consulta consulta) {
        return consultaRepository.save(consulta);
    }

    @GetMapping("/{id}")
    public Consulta buscarPorId(@PathVariable String id) {
        return consultaRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable String id) {
        consultaRepository.deleteById(id);
    }
}
