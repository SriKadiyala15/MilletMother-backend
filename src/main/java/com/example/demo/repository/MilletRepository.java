package com.example.demo.repository;

import com.example.demo.model.Millet;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MilletRepository extends MongoRepository<Millet, String> {
}
