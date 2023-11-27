/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Docente.Vista.Util;

import Docente.Controlador.DocenteControl;
import javax.swing.JComboBox;

/**
 *
 * @author ALEJANDRO
 */
public class UtilVista {
     public static void cargarcomboRolesL(JComboBox cbx) throws Exception {
       Docente.Controlador.DocenteControl rc= new Docente.Controlador.DocenteControl();
        cbx.removeAllItems();
         for (int i = 0; i < rc.getDocentes().getLength(); i++) {
            cbx.addItem(rc.getDocentes().getInfo(i).getApellido());
        }
    }
 
    public static String  obtenerRolControl(JComboBox cbx) {
        return (String) cbx.getSelectedItem();
    }
}
