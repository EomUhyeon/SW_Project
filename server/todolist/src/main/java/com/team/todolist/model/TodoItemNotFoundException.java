package com.team.todolist.model;

public class TodoItemNotFoundException extends RuntimeException {
    public TodoItemNotFoundException(String message) {
        super(message);
    }
}