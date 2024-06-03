package com.ToDoApp.ToDoApp.Controller;

import com.ToDoApp.ToDoApp.Model.ToDo;
import com.ToDoApp.ToDoApp.Repository.ToDoRepository;
import com.ToDoApp.ToDoApp.Service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("todo")
public class ToDoController {

    @Autowired
    ToDoService toDoService;

    @PostMapping("add")
    public ToDo addToDo(@RequestBody ToDo toDo){
        return toDoService.addToDo(toDo);
    }

    @GetMapping("get")
    public ToDo getToDo(ToDo toDo){
        return toDoService.addToDo(toDo);
    }

    @GetMapping("getAll")
    public List<ToDo> getAll(){
        return toDoService.getAll();
    }

    @PatchMapping("complete")
    public String isComplete(@RequestParam Long id){
        toDoService.isComplete(id);

        return "Success";
    }

    @DeleteMapping("delete")
    public String toDeleteById(@RequestParam Long id){
        toDoService.toDeleteById(id);

        return "Deletion is Success";
    }
}
