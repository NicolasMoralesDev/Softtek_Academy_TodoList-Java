package com.mycompany.actividadm4.controlador;

import com.mycompany.actividadm4.model.Tareas;
import com.mycompany.actividadm4.persistence.PersistenceControlador;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Nico Morales
 */
public class ControllerTareas {

   
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

            persisControl.eliminarTareas(id);

        } catch (Exception e) {
              
              JOptionPane.showMessageDialog(null, e, "Error", 3);

        }

    }
    
      public void modificarTarea(Long id , String titulo, String descripcion) {
          
         

      try {
          
          Tareas tarea = new Tareas();
          
          tarea.setId(id);
          tarea.setTitulo(titulo);
          tarea.setDescripcion(descripcion);
          
          persisControl.editarTarea(tarea);
          JOptionPane.showMessageDialog(null,"Tarea, Modificada con Exito!!!");


        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e, "Error", 3);

        }

    }
}
