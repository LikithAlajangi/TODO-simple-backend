

 package com.alvn5.todosimple;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;

 import java.util.List;
 import java.util.Optional;

 @Service
public class TaskService {
    @Autowired
    private final TaskRepo taskRepo;

    public TaskService(TaskRepo t){
        taskRepo= t;
    }


   public Task create(Task task){
    return taskRepo.save(task);
   }

   public List<Task> getAllTasks(){
        return taskRepo.findAll();
   }

   public void deleteTask(Long id){
        taskRepo.deleteById(id);
   }

   public Optional<Task> findById(Long id){
        return taskRepo.findById(id);
   }
}