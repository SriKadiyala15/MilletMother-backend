package com.example.demo.controller;

import com.example.demo.model.Millet;
import com.example.demo.repository.MilletRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/millets")
@CrossOrigin(origins = "*")
public class MilletController {

    private final MilletRepository milletRepository;

    public MilletController(MilletRepository milletRepository) {
        this.milletRepository = milletRepository;
    }

    @GetMapping
    public List<Millet> getAllMillets() {
        return milletRepository.findAll();
    }
}
