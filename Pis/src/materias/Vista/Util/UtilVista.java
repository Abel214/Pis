/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materias.Vista.Util;

import javax.swing.JComboBox;
import materias.Modelo.Materia;

/**
 *
 * @author Elías
 */
public class UtilVista {
     public static void CargarComboRolesL(JComboBox cbx)throws Exception{
        materias.Controlador.MateriaControl rc= new materias.Controlador.MateriaControl();
        cbx.removeAllItems();
         for (int i = 0; i < rc.getMaterias().getLength(); i++) {
            cbx.addItem(rc.getMaterias().getInfo(i));
        }
    }
    
    public static Materia ObtenerCasaControladorL(JComboBox cbx){
        return (Materia)cbx.getSelectedItem();
    }
}
