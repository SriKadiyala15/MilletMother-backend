package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tips")
public class Tip {

    @Id
    private String id;
    private String category;
    private String content;

    // Getters
    public String getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getContent() {
        return content;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
