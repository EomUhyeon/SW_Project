package com.team.todolist.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TodoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String todoItemContent;
    private boolean finished;

    // 기본 생성자
    public TodoItem() {}

    // 모든 필드를 포함한 생성자
    public TodoItem(Long id, String todoItemContent, boolean finished) {
        this.id = id;
        this.todoItemContent = todoItemContent;
        this.finished = finished;
    }

    // Getter와 Setter 메서드들
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTodoItemContent() {
        return todoItemContent;
    }

    public void setTodoItemContent(String todoItemContent) {
        this.todoItemContent = todoItemContent;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }
}