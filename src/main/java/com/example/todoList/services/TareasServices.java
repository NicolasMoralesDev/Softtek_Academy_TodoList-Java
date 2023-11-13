
package com.example.todoList.services;

import com.example.todoList.model.Message;
import com.example.todoList.model.Tareas;
import com.example.todoList.repository.ITareaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Nico Morales
 */

@Service
public class TareasServices  implements ITareasServices{
    
    @Autowired
    private ITareaRepository tareaRepo;

    @Override
    public List <Tareas> traerTareas() {
      
       return tareaRepo.findAll();
    }

    @Override
    public Optional<Tareas> traerTarea(Long id) {
        
        Tareas tarea = new Tareas();
        return tareaRepo.findById(id);
    }

    @Override
    public Message crearTareas(Tareas tarea) {
       
        try {
            
            tareaRepo.save(tarea);
            return new Message("Tarea creada con Exito!!");
            
        } catch (Exception e) {
            
            return new Message("Error, "+e);
        }
    }

    @Override
    public Message borrarTarea(Long id) {
      
        try {
            
            tareaRepo.deleteById(id);
            return new Message("Tarea borrada con Exito!!!");
            
        } catch (Exception e) {
            
            return new Message("Error, "+e);
        }
    }

    @Override
    public Message editarTarea(Tareas tarea) {
        
          try {
            
            tareaRepo.save(tarea);
            return new Message("Tarea modificada con Exito!!");
            
        } catch (Exception e) {
            
            return new Message("Error, "+e);

        }
    }
    
}
