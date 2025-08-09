package com.example.notes_api_spring.note;

import jakarta.validation.constraints.NotBlank;
import jakarta.persistence.*;

@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Title is required")
    private String title;

    @Column(length = 4000)
    private String content;

    // Getters / Setters
    public Long getId(){ return id; }
    public void setId(Long id){ this.id = id; }
    public String getTitle(){ return title; }
    public void setTitle(String title){ this.title = title; }
    public String getContent(){ return content; }
    public void setContent(String content){ this.content = content; }
}
