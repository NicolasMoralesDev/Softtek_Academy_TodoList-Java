
package com.example.todoList.repository;

import com.example.todoList.model.Tareas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Nico Morales
 */

@Repository
public interface ITareaRepository extends JpaRepository<Tareas, Long>{
    
}
