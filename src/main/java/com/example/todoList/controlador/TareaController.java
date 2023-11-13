
package com.example.todoList.controlador;

import com.example.todoList.model.Tareas;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nico Morales
 */

@RestController
@RequestMapping("/tareas")
public class TareaController {
    
    
    @GetMapping("/traer")
    public ResponseEntity<?> traerTareas(){
        return new ResponseEntity("Traigo", HttpStatus.ACCEPTED);
    }
    
    @GetMapping("/traer/{id}")
    public ResponseEntity<?> traerTarea(@PathVariable Long id){
        return new ResponseEntity("Traigo 1", HttpStatus.ACCEPTED);
    }
    
    
    @PostMapping("/creo")
    public ResponseEntity<?> crearTarea(@RequestBody Tareas tarea){
        return new ResponseEntity("Creo", HttpStatus.ACCEPTED);
    }
    
    
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> borroTarea(@PathVariable Long id){
        return new ResponseEntity("borro", HttpStatus.ACCEPTED);
    }
}
