/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.todoList.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Nico Morales
 */
@Getter
@Setter
@Entity
public class Tareas {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nombre;
    private String descripcion;

    public Tareas(Long Id, String nombre, String descripcion) {
        this.Id = Id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Tareas() {
    }

}
