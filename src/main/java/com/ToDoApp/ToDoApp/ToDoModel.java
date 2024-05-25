package com.ToDoApp.ToDoApp;

import lombok.Data;

@Data
public class ToDoModel {
    long id;
    String description;
    Boolean isCompleted;
}
