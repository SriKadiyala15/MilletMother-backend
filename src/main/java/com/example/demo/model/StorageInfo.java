package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "storage_info")
public class StorageInfo {

    @Id
    private String id;
    private String type;
    private String category;
    private String info;

    // Getters
    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getCategory() {
        return category;
    }

    public String getInfo() {
        return info;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
