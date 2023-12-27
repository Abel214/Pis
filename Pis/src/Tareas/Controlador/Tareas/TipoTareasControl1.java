/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas.Controlador.Tareas;

import Tareas.Modelo.Tarea;
import controlador.dao.DaoImplement;
import controlador.listas.DynamicList;

/**
 *
 * @author ALEJANDRO
 */
public class TipoTareasControl1  extends DaoImplement<Tarea> {
    private DynamicList<Tarea>listR=new DynamicList<>();
     private Tarea tarea;
     
     public TipoTareasControl1(){
         super(Tarea.class);
     }
    public DynamicList<Tarea> getListR() {
        listR=all();
        return listR;
    }

    public void setListR(DynamicList<Tarea> listR) {
        this.listR = listR;
    }

    public Tarea getTarea() {
        if(tarea==null)
            tarea=new Tarea();
            return tarea;
        
        
    }


    public void setTarea(Tarea tarea) {
        this.tarea=tarea;
    }
    public Boolean persit(){
        tarea.setId(all().getLength()+1);
        
        return persist(tarea);
    }
}
