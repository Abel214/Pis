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
    private String fechaInicio;
    private String fechaFinal;

    public Control(Tarea id_tarea, String estadoTarea, String tipoTarea, Integer Id, String fechaInicio, String fechaFinal) {
        this.id_tarea = id_tarea;
        this.estadoTarea = estadoTarea;
        this.tipoTarea = tipoTarea;
        this.Id = Id;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

   
    public Control() {
        this.id_tarea =null;
        this.fechaFinal=null;
        this.fechaInicio=null;
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

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(String fechaFinal) {
        this.fechaFinal = fechaFinal;
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

    @Override
    public String toString() {
        return "Control{" + "id_tarea=" + id_tarea + ", estadoTarea=" + estadoTarea + ", tipoTarea=" + tipoTarea + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + '}';
    }
    
    
    
}
