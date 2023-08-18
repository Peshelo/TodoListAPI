package com.example.demoTodo.Todo;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table
public class Todo {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
    )
    private Long id;
    private String title;
    private String description;
    private LocalDateTime dateTime;


    public Todo() {
    }
    public Todo(Long id, String title, String description, LocalDateTime dateTime) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dateTime = dateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
