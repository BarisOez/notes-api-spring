package com.example.notes_api_spring.note;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.util.List;

// Simple REST controller for notes CRUD
@RestController
@RequestMapping("/api/notes")
@CrossOrigin // allow local frontend later
public class NoteController {

    private final NoteRepository repo;

    public NoteController(NoteRepository repo){
        this.repo = repo;
    }

    @GetMapping
    public List<Note> all(){
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Note byId(@PathVariable Long id){
        return repo.findById(id).orElseThrow(() -> new RuntimeException("Note not found"));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Note create(@Valid @RequestBody Note note){
        return repo.save(note);
    }

    @PutMapping("/{id}")
    public Note update(@PathVariable Long id, @Valid @RequestBody Note input){
        Note n = repo.findById(id).orElseThrow(() -> new RuntimeException("Note not found"));
        n.setTitle(input.getTitle());
        n.setContent(input.getContent());
        return repo.save(n);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        repo.deleteById(id);
    }
}
