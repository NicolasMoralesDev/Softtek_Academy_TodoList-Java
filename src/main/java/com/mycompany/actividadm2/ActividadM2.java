/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividadm2;

import com.mycompany.actividadm2.vista.VentanaPrincipal;

/**
 *
 * @author Nico Morales
 */
public class ActividadM2 {

    
//    Metodo principal
    public static void main(String[] args) {
      
//        Creamos una instancia de la ventana
        VentanaPrincipal ventana = new VentanaPrincipal();
//        Hacemos que sea visible
        ventana.setVisible(true);
//        Configuramos que su ubicacion sea nula (centro de la pantalla) al ejecutarse
        ventana.setLocationRelativeTo(null);

    }
}
