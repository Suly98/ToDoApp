package com.ToDoApp.ToDoApp.Repository;

import com.ToDoApp.ToDoApp.Model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo,Long> {

    void deleteById(@Param("ID") Long id);
}
