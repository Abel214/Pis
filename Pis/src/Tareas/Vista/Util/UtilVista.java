/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas.Vista.Util;

import Tareas.Controlador.TipoTareasControl;
import Tareas.Modelo.Tarea;
import javax.swing.JComboBox;

/**
 *
 * @author ALEJANDRO
 */
public class UtilVista {
     public static void CargarComboRolesL(JComboBox cbx)throws Exception{
        TipoTareasControl rc= new TipoTareasControl();
        cbx.removeAllItems();
         for (int i = 0; i < rc.getTareas().getLength(); i++) {
            cbx.addItem(rc.getTareas().getInfo(i));
        }
    }
    
    public static Tarea ObtenerCasaControladorL(JComboBox cbx){
        return (Tarea)cbx.getSelectedItem();
    }
}
