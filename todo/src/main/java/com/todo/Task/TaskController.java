package com.todo.Task;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/tasks")
public class TaskController {
    @Autowired
    private  TaskRepository taskRepository;
    @PostMapping("/add")
    public  TaskItem addTask(@Valid @RequestBody TaskItem taskItem){
        return  taskRepository.save(taskItem);
    }

    @GetMapping
    public List<TaskItem> getTasks(){
        return  taskRepository.findAll();
    }

    @PostMapping("/update/{id}")
    public ResponseEntity updateTask(@PathVariable Long id){
        boolean exist= taskRepository.existsById(id);
        if(exist){
            TaskItem task = taskRepository.getById(id);
            boolean done = task.isDone();
            task.setDone(!done);
            taskRepository.save(task);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteTask(@PathVariable Long id){
        boolean exist = taskRepository.existsById(id);
        if(exist){
            taskRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }
}
