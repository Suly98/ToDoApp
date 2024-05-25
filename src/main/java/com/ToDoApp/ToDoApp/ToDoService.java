package com.ToDoApp.ToDoApp;

import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {

    @Autowired
    ToDoRepository toDoRepository;

    public ToDo addToDo(ToDo toDo){
        return toDoRepository.save(toDo);
    }
}
