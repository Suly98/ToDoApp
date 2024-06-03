package com.ToDoApp.ToDoApp.Service;

import com.ToDoApp.ToDoApp.Model.ToDo;
import com.ToDoApp.ToDoApp.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


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

    public List<ToDo> getAll(){
        return toDoRepository.findAll();
    }


    public ToDo update(ToDo toDo, Long id){

    }


    public String toDeleteById(Long id){
        if(toDoRepository.existsById(id)){
            toDoRepository.deleteById(id);
            return "Deletion Success";
        } else {
            return "ToDo id does not exist";
        }
    }

}
