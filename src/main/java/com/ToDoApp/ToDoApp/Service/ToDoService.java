package com.ToDoApp.ToDoApp.Service;

import com.ToDoApp.ToDoApp.Model.ToDo;
import com.ToDoApp.ToDoApp.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ToDoService {

    @Autowired
    ToDoRepository toDoRepository;

    public ToDo addToDo(ToDo toDo){
        return toDoRepository.save(toDo);
    }

    public String isComplete(Long id){
        ToDo toDo = toDoRepository.getReferenceById(id);
        toDo.setIsCompleted(true);
        toDoRepository.save(toDo);

        return "Success";
    }

}
