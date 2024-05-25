package com.ToDoApp.ToDoApp.Controller;

import com.ToDoApp.ToDoApp.Model.ToDo;
import com.ToDoApp.ToDoApp.Service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("todo")
public class ToDoController {

    @Autowired
    ToDoService toDoService;

    @PostMapping("add")
    public ToDo addToDo(@RequestBody ToDo toDo){
        return toDoService.addToDo(toDo);
    }
}
