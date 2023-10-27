/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadm2.controller;

import com.mycompany.actividadm2.model.Tarea;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nico Morales
 */
public class ControllerTareas {
    
    List <Tarea> lista = new ArrayList<>();

  
    
    public List<Tarea> traerTareas(){
        return lista;
    }
    
    public void crearTareas(String titulo, String descripcion){
        
        Tarea nuevas = new Tarea();
        nuevas.setTitulo(titulo);
        nuevas.setDescripcion(descripcion);
        
        lista.add(nuevas);
        
    }

    public void borrarAuto(int par1) {
        
        lista.remove(par1);
    }
    
}
