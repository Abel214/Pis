/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas.Modelo;

/**
 *
 * @author ALEJANDRO
 */
public class Control {
    private Tarea id_tarea;
    private String estadoTarea;
    private String tipoTarea;
    private Integer Id;

    public Control(Tarea id_tarea, String estadoTarea, String tipoTarea,Integer Id) {
        this.id_tarea = id_tarea;
        this.Id=Id;
        this.estadoTarea = estadoTarea;
        this.tipoTarea = tipoTarea;
    }
    public Control() {
        this.id_tarea =null;
        this.estadoTarea = null;
        this.tipoTarea = null;
        this.Id=null;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    
    
    public Tarea getId_tarea() {
        return id_tarea;
    }

    public void setId_tarea(Tarea id_tarea) {
        this.id_tarea = id_tarea;
    }
   

   
    public String getEstadoTarea() {
        return estadoTarea;
    }

    public void setEstadoTarea(String estadoTarea) {
        this.estadoTarea = estadoTarea;
    }

    public String getTipoTarea() {
        return tipoTarea;
    }

    public void setTipoTarea(String tipoTarea) {
        this.tipoTarea = tipoTarea;
    }
    
    
    
}
