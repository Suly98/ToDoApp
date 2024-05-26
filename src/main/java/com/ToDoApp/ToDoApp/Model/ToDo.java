package com.ToDoApp.ToDoApp.Model;


import jakarta.persistence.*;
import lombok.Data;



@Data
@Entity
@Table(name = "todo")
public class ToDo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String description;
    Boolean isCompleted;
}
