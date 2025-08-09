package com.example.demo.controller;

import com.example.demo.model.Tip;
import com.example.demo.repository.TipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tips")
@CrossOrigin(origins = "*")
public class TipController {

    @Autowired
    private TipRepository tipRepository;

    @GetMapping
    public List<Tip> getAllTips() {
        return tipRepository.findAll();
    }

    @PostMapping
    public Tip addTip(@RequestBody Tip tip) {
        return tipRepository.save(tip);
    }

    @GetMapping("/{id}")
    public Tip getTipById(@PathVariable String id) {
        return tipRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteTip(@PathVariable String id) {
        tipRepository.deleteById(id);
    }
}
