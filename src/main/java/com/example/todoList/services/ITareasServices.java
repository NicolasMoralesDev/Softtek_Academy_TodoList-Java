package com.example.todoList.services;

import com.example.todoList.model.Message;
import com.example.todoList.model.Tareas;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author Nico Morales
 */
public interface ITareasServices {

    /**
     * Todas las tareas existentes.
     *
     * @return Todas las tareas que se encuentren en la BD.
     */
    public List<Tareas> traerTareas();

    /**
     * Trae una tarea por ID.
     *
     * @param id Id de la Materia a buscar.
     * @return Una tarea cuyo id sea igual al del parametro.
     */
    public Optional<Tareas> traerTarea(Long id);

    /**
     * Crea una tarea.
     *
     * @param tarea Objeto de tipo Tareas.
     * @return El resultado de la operacion.
     */
    public Message crearTareas(Tareas tarea);

    /**
     * Borra tarea por id.
     *
     * @param id Id de la Materia a borrar.
     * @return El resultado de la operacion.
     */
    public Message borrarTarea(Long id);

    /**
     * Edita una tarea.
     *
     * @param tarea Objeto de tipo Tareas.
     * @return El resultado de la operacion.
     */
    public Message editarTarea(Tareas tarea);
}
