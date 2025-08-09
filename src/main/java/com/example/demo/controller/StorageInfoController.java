package com.example.demo.controller;

import com.example.demo.model.StorageInfo;
import com.example.demo.repository.StorageInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/storage")
@CrossOrigin(origins = "*")
public class StorageInfoController {

    @Autowired
    private StorageInfoRepository storageInfoRepository;

    @GetMapping
    public List<StorageInfo> getAllStorageInfo() {
        return storageInfoRepository.findAll();
    }

    @PostMapping
    public StorageInfo addStorageInfo(@RequestBody StorageInfo info) {
        return storageInfoRepository.save(info);
    }

    @GetMapping("/{id}")
    public StorageInfo getStorageInfoById(@PathVariable String id) {
        return storageInfoRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteStorageInfo(@PathVariable String id) {
        storageInfoRepository.deleteById(id);
    }
}
