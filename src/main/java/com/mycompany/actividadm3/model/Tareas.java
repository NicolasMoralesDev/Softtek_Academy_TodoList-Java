
package com.mycompany.actividadm3.model;

/**
 *
 * @author Nico Morales
 * 
 */
public class Tareas {
    
    private String titulo;
    private String descripcion;

    public Tareas() {
    }

    public Tareas(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
