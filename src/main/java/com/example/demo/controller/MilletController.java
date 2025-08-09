package com.example.demo.controller;

import com.example.demo.model.Millet;
import com.example.demo.repository.MilletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/millets")
@CrossOrigin(origins = "*")  // Allows frontend (HTML/JS) to access the API
public class MilletController {

    @Autowired
    private MilletRepository milletRepository;

    // GET: Get all millets
    @GetMapping
    public List<Millet> getAllMillets() {
        return milletRepository.findAll();
    }

    // POST: Add a new millet
    @PostMapping
    public Millet addMillet(@RequestBody Millet millet) {
        return milletRepository.save(millet);
    }

    // GET: Get a millet by ID
    @GetMapping("/{id}")
    public Millet getMilletById(@PathVariable String id) {
        return milletRepository.findById(id).orElse(null);
    }

    // DELETE: Delete a millet
    @DeleteMapping("/{id}")
    public void deleteMillet(@PathVariable String id) {
        milletRepository.deleteById(id);
    }

    // PUT: Update a millet
    @PutMapping("/{id}")
    public Millet updateMillet(@PathVariable String id, @RequestBody Millet updatedMillet) {
        Millet existing = milletRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(updatedMillet.getName());
            existing.setDescription(updatedMillet.getDescription());
            existing.setImageUrl(updatedMillet.getImageUrl());
            return milletRepository.save(existing);
        } else {
            return null;
        }
    }
}
