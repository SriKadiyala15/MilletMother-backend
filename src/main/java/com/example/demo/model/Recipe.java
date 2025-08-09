package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "recipes")
public class Recipe {

    @Id
    private String id;
    private String name;
    private String description;
    private String milletName;
    private String link;

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getMilletName() {
        return milletName;
    }

    public String getLink() {
        return link;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMilletName(String milletName) {
        this.milletName = milletName;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
