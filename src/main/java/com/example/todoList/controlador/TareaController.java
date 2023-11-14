
package com.example.todoList.controlador;

import com.example.todoList.model.Tareas;
import com.example.todoList.services.TareasServices;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author Nico Morales
 */


@RequestMapping("/tareas")
@RestController
public class TareaController {
 
    @Autowired
    private TareasServices tareasServis;
   
    @GetMapping("/traer")
    @Operation(summary = "Traer Todas las tareas")
    @ResponseBody
    public ResponseEntity<?> traerTareas(){
        
        return new ResponseEntity(tareasServis.traerTareas(), HttpStatus.ACCEPTED);
    }
    
    @GetMapping("/traer/{id}")
    @Operation(summary = "Traer una tarea por Id")
    @ResponseBody
    public ResponseEntity<?> traerTarea(@PathVariable Long id){
        
        return new ResponseEntity(tareasServis.traerTarea(id), HttpStatus.ACCEPTED);
    }
    
    
    @PostMapping("/crear")
    @Operation(summary = "Crear tareas")
    @ResponseBody
    public ResponseEntity<?> crearTarea(@RequestBody Tareas tarea){
        
        return new ResponseEntity(tareasServis.crearTareas(tarea), HttpStatus.ACCEPTED);
    }
    
    
    @DeleteMapping("/borrar/{id}")
    @Operation(summary = "Borrar tarea por Id")
    @ResponseBody
    public ResponseEntity<?> borroTarea(@PathVariable Long id){
        
        return new ResponseEntity(tareasServis.borrarTarea(id), HttpStatus.ACCEPTED);
    }
    
    @PutMapping("/editar")
    @Operation(summary = "Editar tarea")
    @ResponseBody
    public ResponseEntity<?> modificarTarea(@RequestBody Tareas tarea){
        return new ResponseEntity(tareasServis.editarTarea(tarea), HttpStatus.ACCEPTED);
    }
}
