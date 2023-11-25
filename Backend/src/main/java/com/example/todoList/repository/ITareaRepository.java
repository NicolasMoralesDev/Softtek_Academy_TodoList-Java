
package com.example.todoList.repository;

import com.example.todoList.model.Tareas;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import org.springframework.stereotype.Repository;

/**
 *
 * @author Nico Morales
 */

@Repository
public interface ITareaRepository extends JpaRepository<Tareas, Long>{
    
     /**
      * 
      * @param titulo.
      * @return Retorna una tarea cuyo titulo coincida con el parametro.
      */
    
    @Query("SELECT t FROM Tareas t WHERE t.titulo = :titulo")
    List<Tareas> findByTitle(@Param("titulo") String titulo);
}
