/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas.Controlador;

import Tareas.Modelo.EstadoTarea;
import controlador.listas.DynamicList;



/**
 *
 * @author ALEJANDRO
 */
public class EstadoTareaControl {
    public DynamicList<EstadoTarea> estado;
    //creación de esta clase para mandar a un combobox

    public EstadoTareaControl() {
        estado=new DynamicList<>();
        estado.add(new EstadoTarea(1,"Calificada"));
        estado.add(new EstadoTarea(2,"Enviada"));
        estado.add(new EstadoTarea(3,"Retrasada"));
        
        
    }

    public DynamicList<EstadoTarea> getEstado() {
        return estado;
    }

    public void setEstado(DynamicList<EstadoTarea> estado) {
        this.estado = estado;
    }
    
    
}
