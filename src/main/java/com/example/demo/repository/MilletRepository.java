package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Millet;

public interface MilletRepository extends MongoRepository<Millet, String> {
}
