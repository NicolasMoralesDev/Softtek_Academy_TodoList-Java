/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.todoList.services;

import com.example.todoList.model.Tareas;
import org.springframework.data.domain.Pageable;

/**
 *
 * @author Nico Morales
 */
public interface ITareasServices {
    
    public Pageable traerTareas();
    public Tareas traerTarea(Long id);
    public String crearTareas(Tareas tarea);
    public String borrarTarea(Long id);
    public String editarTarea(Tareas tarea);
}
