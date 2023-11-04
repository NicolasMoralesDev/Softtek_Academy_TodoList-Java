/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadm4.persistence;

import com.mycompany.actividadm4.model.Tareas;
import com.mycompany.actividadm4.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nico Morales
 */
public class PersistenceControlador implements IPersistenceControlador{
    
   private  TareasJpaController controlJpa = new TareasJpaController();

    @Override
    public List<Tareas> traerTareas() {
        
        return controlJpa.findTareasEntities();
    }

    @Override
    public void crearTarea(Tareas tarea) {
        
        controlJpa.create(tarea);
    }

    @Override
    public void eliminarTareas(Long id) {
        
       try {
           controlJpa.destroy(id);
       } catch (NonexistentEntityException ex) {
           Logger.getLogger(PersistenceControlador.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    @Override
    public void editarTarea(Tareas tarea) {
        
       try {
           controlJpa.edit(tarea);
       } catch (Exception ex) {
           Logger.getLogger(PersistenceControlador.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
   
    
}
