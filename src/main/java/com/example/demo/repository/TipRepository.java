package com.example.demo.repository;

import com.example.demo.model.Tip;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TipRepository extends MongoRepository<Tip, String> {}
