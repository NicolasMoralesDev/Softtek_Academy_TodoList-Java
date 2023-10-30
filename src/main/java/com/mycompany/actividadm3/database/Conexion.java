/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividadm3.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Nico Morales
 */
public class Conexion {
    
     private Connection conectar = null;
    private final String usuario = "root";
    private final String contrasena = "";
    private final String db = "tareas";
    private final String ip = "localhost";
    private final String puerto = "3306";
    private final Statement st = null;
    private final ResultSet rs = null;
    private final String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + db;
 
    public Connection establecerConeccion() {
        try {
            conectar = DriverManager.getConnection(cadena, usuario, contrasena);
//            JOptionPane.showMessageDialog(null, "Se conectó correctamente");
            
            
        } catch (Exception e) {
           // JOptionPane.showMessageDialog(null, "No se pudo conectar" + e.toString());
        }
        return conectar;
    }
 
    
}
