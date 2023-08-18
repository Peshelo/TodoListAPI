package com.example.demoTodo.Todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    
    @Autowired
    public TodoRepository todoRepository;

    public List<Todo> getAllTodo() {
        List<Todo> todoList = new ArrayList<>();
        todoRepository.findAll().
                forEach(todoList::add);
        return todoList;
    }

    public void addNewTodo(Todo todo) {
        todoRepository.save(todo);
    }

    public Todo getTodo(Long id) {
        return todoRepository.findById(id)
                .orElseThrow();
    }

    public void updateTodo(Long id, Todo todo) {
        if(!todoRepository.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Todo item does not exist");
        }
        todoRepository.save(todo);
    }

    public void deleteTodo(Long id) {
        if(!todoRepository.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"Todo item does not exist");
        }
        todoRepository.deleteById(id);
    }
}
