package com.example.demo.repository;

import com.example.demo.model.StorageInfo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StorageInfoRepository extends MongoRepository<StorageInfo, String> {}
