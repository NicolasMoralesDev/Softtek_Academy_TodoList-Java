package com.mycompany.actividadm4.controlador;

import com.mycompany.actividadm4.database.Conexion;
import com.mycompany.actividadm4.model.Tareas;
import com.mycompany.actividadm4.persistence.PersistenceControlador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Nico Morales
 */
public class ControllerTareas {

    private Conexion conex = new Conexion();
    private PersistenceControlador persisControl = new PersistenceControlador();

    public List<Tareas> traerTareas() {
       
        return persisControl.traerTareas();
    }

    public void crearTarea(Tareas tarea) {

        try {

             persisControl.crearTarea(tarea);
             JOptionPane.showMessageDialog(null, "Tarea creada con Exito!!!", "Tarea", 3);

        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e, "Error", 3);
        }

    }

    public void eliminarTarea(Long id) {

        try {

            Connection conectar = conex.establecerConeccion();
            PreparedStatement eliminar = conectar.prepareStatement("delete from tareas where id = ?");
            eliminar.setLong(1, id);
            eliminar.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
      public void modificarTarea(Long id , String titulo, String descripcion) {
          
         

      try {
          
          Tareas tarea = new Tareas();
          
          tarea.setId(id);
          tarea.setTitulo(titulo);
          tarea.setDescripcion(descripcion);
          
            Connection conectar = conex.establecerConeccion();

            PreparedStatement modificar = conectar.prepareStatement("update tareas set titulo =  ? , descripcion = ? where id = ?");

            modificar.setString(1, tarea.getTitulo());
            modificar.setString(2, tarea.getDescripcion());
            modificar.setLong(3, tarea.getId());
            modificar.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Tarea, Modificada con Exito!!!");


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
