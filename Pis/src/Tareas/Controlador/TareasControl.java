/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas.Controlador;

import Tareas.Modelo.Tarea;
import controlador.listas.DynamicList;

/**
 *
 * @author ALEJANDRO
 */
public class TareasControl {
     private DynamicList<Tarea>tareas;
  
    public TareasControl(){
        tareas=new DynamicList<>();
        tareas.add(new Tarea(1, "Tarea 1","Mapa Conceptual","10"));
        tareas.add(new Tarea(2, "Ensayo 1","En IEEE"," 3"));
        tareas.add(new Tarea(3, "Informe ","Estructura"," 8"));
        tareas.add(new Tarea(4, "Trabajo","Grupal"," 5"));
        tareas.add(new Tarea(5, "Exposición","Lenguaje C"," 0"));
        tareas.add(new Tarea(6, "Proyecto","Pis"," 10"));
        
    }

    public DynamicList<Tarea> getTareas() {
        return tareas;
    }

    public void setTareas(DynamicList<Tarea> tareas) {
        this.tareas = tareas;
    }
}
