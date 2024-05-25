package com.ToDoApp.ToDoApp;

import lombok.Data;

@Data
public class ToDo {
    Long id;
    String description;
    Boolean isCompleted;
}
