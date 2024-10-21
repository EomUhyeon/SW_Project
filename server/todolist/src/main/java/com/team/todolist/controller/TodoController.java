package com.team.todolist.controller;

import java.util.List;
import com.team.todolist.model.TodoItem;
import com.team.todolist.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/todos")
@CrossOrigin(origins = "http://localhost:3001")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public List<TodoItem> getAllTodoItems() {
        return todoService.getAllTodoItems();
    }

    @PostMapping
    public TodoItem createTodoItem(@RequestBody TodoItem todoItem) {
        return todoService.saveTodoItem(todoItem);
    }

    @PutMapping("/{id}")
    public TodoItem updateTodoItem(@PathVariable Long id, @RequestBody TodoItem todoItem) {
        return todoService.updateTodoItem(id, todoItem);
    }

    @DeleteMapping("/{id}")
    public void deleteTodoItem(@PathVariable Long id) {
        todoService.deleteTodoItem(id);
    }
}