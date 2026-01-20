package com.alvn5.todosimple;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = (long) id;
    }

    private String title;

    @JsonProperty("isCompleted")//isComplete is used in react(front-end)
    private boolean complete;

    public String getTitle() {
        return title;
    }

    public void setTitle(String task) {
        this.title = task;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean isComplete) {
        this.complete = isComplete;
    }

    public Task(){}
    
    
}
