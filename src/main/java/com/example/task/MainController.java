package com.example.task;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path="/api")
public class MainController {

    @Autowired //gets the bean called taskRepository
    private TaskRepository taskRepository;

    @PostMapping(path="/add") //handles only POST requests, adds a new tsk to database
    public @ResponseBody String addNewTask (@RequestBody Task n){

        //System.out.println(n.toString());
        taskRepository.save(n);

        return ("Task saved");
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable <Task> getAllTasks(){
        //taskRepository.findAll().forEach(task -> System.out.println(task.getAssignedTo()));

        return taskRepository.findAll();
        //returns a JSON or XML with all tasks

    }

    //delete task
    @GetMapping(path="/remove/{id}")
    public String deleteTask (@PathVariable Integer id){
        taskRepository.deleteById(id);
        //System.out.println("task by id: " + id + " was deleted");
        return("Task was deleted");

    }
    //edit task

}
