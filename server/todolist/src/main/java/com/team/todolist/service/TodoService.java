package com.team.todolist.service;

import com.team.todolist.model.TodoItem;
import com.team.todolist.repository.TodoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.team.todolist.model.TodoItemNotFoundException;

import java.util.List;

@Service
@Transactional
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<TodoItem> getAllTodoItems() {
        return todoRepository.findAll();
    }

    public TodoItem saveTodoItem(TodoItem todoItem) {
        return todoRepository.save(todoItem);
    }

    public TodoItem updateTodoItem(Long id, TodoItem updatedTodoItem) {
        TodoItem existingItem = findTodoItemById(id);
        updateTodoItemFields(existingItem, updatedTodoItem);
        return todoRepository.save(existingItem);
    }

    public void deleteTodoItem(Long id) {
        todoRepository.deleteById(id);
    }

    private TodoItem findTodoItemById(Long id) {
        return todoRepository.findById(id)
                .orElseThrow(() -> new TodoItemNotFoundException("Todo item not found with id: " + id));
    }

    private void updateTodoItemFields(TodoItem existingItem, TodoItem updatedTodoItem) {
        existingItem.setTodoItemContent(updatedTodoItem.getTodoItemContent());
        existingItem.setFinished(updatedTodoItem.isFinished());
    }
}