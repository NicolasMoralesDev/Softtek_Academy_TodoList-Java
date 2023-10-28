
package com.mycompany.actividadm2.model;

/**
 *
 * @author Nico Morales
 */

//modelado de la entidad tareas
public class Tarea {
    
    private String titulo;
    private String descripcion;

    public Tarea() {
    }
    

    public Tarea(String titulo, String descripcion) {
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
