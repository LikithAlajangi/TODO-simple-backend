package com.alvn5.todosimple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")
@CrossOrigin(origins = "http://localhost:5173")
public class TaskController {

    @Autowired
    private final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }


   @PostMapping
    public void create(@RequestBody Task task){
       taskService.create(task);
   }


   @GetMapping("/all")
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
   }

   @DeleteMapping("/{id}")
    public void deleteByid(@PathVariable("id") Long id){
        taskService.deleteTask(id);
   }

@PatchMapping("/{id}")
    public Task updateByid(@PathVariable Long id, @RequestBody Task updatedTask){
      Task currTask =   taskService.findById(id).orElseThrow(()->new RuntimeException("Task not found"));
       currTask.setTitle(updatedTask.getTitle());
       currTask.setComplete(updatedTask.isComplete());
       return taskService.create(currTask);
}
    
}
