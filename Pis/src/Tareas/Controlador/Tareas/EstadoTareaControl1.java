/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas.Controlador.Tareas;

import Tareas.Modelo.EstadoTarea;
import controlador.dao.DaoImplement;
import controlador.listas.DynamicList;

/**
 *
 * @author ALEJANDRO
 */
public class EstadoTareaControl1 extends DaoImplement<EstadoTarea> {
     private DynamicList<EstadoTarea>listR=new DynamicList<>();
     private EstadoTarea estado;
     
     public EstadoTareaControl1(){
         super(EstadoTarea.class);
     }
    public DynamicList<EstadoTarea> getListR() {
        listR=all();
        return listR;
    }

    public void setListR(DynamicList<EstadoTarea> listR) {
        this.listR = listR;
    }

    public EstadoTarea getEstado() {
        if(estado==null)
            estado=new EstadoTarea();
            return estado;
        
        
    }


    public void setEstado(EstadoTarea estado) {
        this.estado=estado;
    }
    public Boolean persit(){
        estado.setId(all().getLength()+1);
        
        return persist(estado);
    }
}
