/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas.Controlador;

import Tareas.Modelo.Control;
import controlador.listas.DynamicList;

/**
 *
 * @author ALEJANDRO
 */
public class DatoAdministrarTarea {
    private Control control;
    private DynamicList<Control> controles;
     public DatoAdministrarTarea() {
        control= new Control();
        this.controles = new DynamicList<>();
    }

    public Control getControl() {
       if(control==null){
            control=new Control();
        }
        return control;
    }

    public void setControl(Control control) {
        this.control=control;
    }

    public DynamicList<Control>Controles() {
        return controles;
    }

    public void setControles(DynamicList<Control> controles) {
        this.controles=controles;
    }

   
        

    //Mwtodo guardar
    public Boolean guardar(){
        control.setId(generarId());
        controles.add(control);
        return true;
    }
    private Integer generarId(){
        return controles.getLength()+1;
  }
    
   
    
     public void imprimir(){
        System.out.println(controles.toString());
    }
}
