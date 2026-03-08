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
    public ResponseEntity<?> getAllMillets() {
        try {
            List<Millet> millets = milletRepository.findAll();
            return ResponseEntity.ok(millets);
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Error fetching millets: " + e.getMessage());
        }
    }
}
