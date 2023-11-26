/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas.Controlador.ControlTareas;

import Tareas.Modelo.Control;
import controlador.dao.DaoImplement;
import controlador.listas.DynamicList;

/**
 *
 * @author ALEJANDRO
 */
public class DatoAdministrarTarea1 extends DaoImplement<Control>  {
      private DynamicList<Control> controles;
    private Control control1;
     public DatoAdministrarTarea1() {
        super(Control.class);
    }

    public DynamicList<Control> getControles() {
        controles=all();
        return controles;
    }

    public void setTipos(DynamicList<Control> controles) {
        this.controles=controles;
    }

    public Control getControl1() {
        if (control1 == null) {
            control1= new Control();
        }
        return control1;
    }

    public void setControl1(Control control1) {
        this.control1 = control1;
    }




    public Boolean persist(){
        control1.setId(all().getLength()+ 1);
        return persist(control1);
    }
}
