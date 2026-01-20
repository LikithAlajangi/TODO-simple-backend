package com.alvn5.todosimple;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface TaskRepo extends JpaRepository<Task,Long> {
    
}
