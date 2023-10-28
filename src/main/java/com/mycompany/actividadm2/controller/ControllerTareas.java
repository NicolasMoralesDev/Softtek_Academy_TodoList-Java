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
    
//    atributo de la clase que servira de persistencia de datos
    
    private List <Tarea> lista = new ArrayList<>();
    
//    metodo para traer tareas
    public List<Tarea> traerTareas(){
        return lista;
    }
    
//    metodo para crear tareas
    public void crearTareas(String titulo, String descripcion){
        
        Tarea nuevas = new Tarea();
        nuevas.setTitulo(titulo);
        nuevas.setDescripcion(descripcion);
        
        lista.add(nuevas);
        
    }

//    metodo para borrar tareas
    public void borrarAuto(int index) {
        
        lista.remove(index);
    }
    
}
