package com.example.notes_api_spring.note;

import org.springframework.data.jpa.repository.JpaRepository;

// Basic CRUD repository for Note entity
public interface NoteRepository extends JpaRepository<Note, Long> {}
