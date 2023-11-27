/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Docente.Vista.Util;

import Docente.Controlador.Docente.DocenteControl1;
import Docente.Controlador.DocenteControl;
import Docente.Modelo.Docente;
import javax.swing.JComboBox;

/**
 *
 * @author ALEJANDRO
 */
public class UtilVista {
     public static void cargarcomboRolesL(JComboBox cbx) throws Exception {
      DocenteControl1 rc= new DocenteControl1();
        cbx.removeAllItems();
         for (int i = 0; i < rc.getListR().getLength(); i++) {
            cbx.addItem(rc.getListR().getInfo(i).getApellido());
        }
    }
 
    public static String  obtenerRolControl(JComboBox cbx) {
        return (String) cbx.getSelectedItem();
    }
}
