/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas.Vista.Util;

import Tareas.Controlador.EstadoTareaControl;
import Tareas.Modelo.EstadoTarea;
import javax.swing.JComboBox;

/**
 *
 * @author ALEJANDRO
 */
public class UtilVistaEstado {
     public static void CargarComboRolesL(JComboBox cbx)throws Exception{
         EstadoTareaControl rc= new EstadoTareaControl();
        cbx.removeAllItems();
         for (int i = 0; i < rc.getEstado().getLength(); i++) {
            cbx.addItem(rc.getEstado().getInfo(i));
        }
    }
    
    public static EstadoTarea ObtenerEstadoTarea(JComboBox cbx){
        return (EstadoTarea)cbx.getSelectedItem();
    }
}
