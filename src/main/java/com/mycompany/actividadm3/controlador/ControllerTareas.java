/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadm3.controlador;

import com.mycompany.actividadm3.controladorPersistencia.ControllerPersis;
import com.mycompany.actividadm3.model.Tareas;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nico Morales
 */
public class ControllerTareas {
    
    
   private ControllerPersis controlPer = new ControllerPersis();
                 
    public ResultSet traerTareas(){
      return  controlPer.traerTareas();
    }
    
    public void crearTarea(String titulo, String descripcion){
       
        
    }
}
