
package com.example.todoList.services;

import com.example.todoList.model.Message;
import com.example.todoList.model.Tareas;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Nico Morales
 */
public interface ITareasServices {
    
    public List<Tareas> traerTareas();
    public Optional<Tareas> traerTarea(Long id);
    public Message crearTareas(Tareas tarea);
    public Message borrarTarea(Long id);
    public Message editarTarea(Tareas tarea);
}
