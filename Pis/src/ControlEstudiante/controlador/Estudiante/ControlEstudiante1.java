/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlEstudiante.controlador.Estudiante;

import ControlEstudiante.modelo.Estudiante;
import controlador.dao.DaoImplement;
import controlador.listas.DynamicList;

/**
 *
 * @author ALEJANDRO
 */
public class ControlEstudiante1 extends DaoImplement<Estudiante>{
     private DynamicList<Estudiante>listR=new DynamicList<>();
     private Estudiante estudiante;
     
     public ControlEstudiante1(){
         super(Estudiante.class);
     }
    public DynamicList<Estudiante> getListR(){
        return listR = all();
    }

    public void setListR(DynamicList<Estudiante> listR) {
        this.listR = listR;
    }


    public Estudiante getEstudiante() {
        if(estudiante==null)
            estudiante=new Estudiante();
            return estudiante;
        
        
    }


    public void setEstudiante (Estudiante estudiante) {
        this.estudiante = estudiante;
    }
    public Boolean persist(){
        estudiante.setId(all().getLength()+1);
        
        return persist(estudiante);
    }
}
