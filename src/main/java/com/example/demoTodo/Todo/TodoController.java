package com.example.demoTodo.Todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin
public class TodoController {

    @Autowired
    public TodoService todoService;

    @GetMapping("/todo")
    public List<Todo> getAllTodo(){
        return todoService.getAllTodo();
    }

    @GetMapping("/todo/{id}")
    public Todo getTodo(@PathVariable Long id){
        return todoService.getTodo(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/todo")
    public void addNewTodo(@RequestBody Todo todo){
        todoService.addNewTodo(todo);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PutMapping("/todo/{id}")
    public void updateTodo(@PathVariable Long id,@RequestBody Todo todo){
        todoService.updateTodo(id,todo);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/todo/{id}")
    public void deleteTodo(@PathVariable Long id){
        todoService.deleteTodo(id);
    }



}
