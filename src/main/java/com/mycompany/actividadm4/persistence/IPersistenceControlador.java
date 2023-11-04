/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.actividadm4.persistence;

import com.mycompany.actividadm4.model.Tareas;
import java.util.List;

/**
 *
 * @author Nico Morales
 */
public interface IPersistenceControlador {
    
    public List <Tareas> traerTareas();
    public void crearTarea(Tareas tarea);
    public void eliminarTareas(Long id);
    public void editarTarea(Tareas tarea);
    
}
