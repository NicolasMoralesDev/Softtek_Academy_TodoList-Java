
package com.example.todoList.controlador;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Nico Morales
 */

@RequestMapping("/tareas")
public class TareaController {
    
    
    @GetMapping("/traer")
    public ResponseEntity<?> traerTareas(){
        return new ResponseEntity("Traigo", HttpStatus.ACCEPTED);
    }
    
    @GetMapping("/traer/{id]")
    public ResponseEntity<?> traerTarea(@PathVariable Long id){
        return new ResponseEntity("Traigo 1", HttpStatus.ACCEPTED);
    }
    
    
    @PostMapping("/creo")
    public ResponseEntity<?> crearTarea(){
        return new ResponseEntity("Creo", HttpStatus.ACCEPTED);
    }
    
    
    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<?> borroTarea(@PathVariable Long id){
        return new ResponseEntity("borro", HttpStatus.ACCEPTED);
    }
}
