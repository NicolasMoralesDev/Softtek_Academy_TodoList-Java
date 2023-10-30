/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadm3.controladorPersistencia;

import com.mycompany.actividadm3.database.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Nico Morales
 */
public class ControllerPersis {

    public ResultSet traerTareas() {

        String sql = "SELECT * FROM tareas";
        Conexion con = new Conexion();
        Connection conexion = con.establecerConeccion();

        ResultSet rs = null;

        try {

            //Creamos una declaración para ejecutar la consulta SQL
            Statement st = conexion.createStatement();

            rs = st.executeQuery(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public void crearTarea() {

    }

    public void borrarTarea(int id) {

    }
}
