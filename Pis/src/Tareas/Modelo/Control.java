/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas.Modelo;

import java.util.Date;

/**
 *
 * @author ALEJANDRO
 */
public class Control {
    private Tarea id_tarea;
    private String estadoTarea;
    private String tipoTarea;
    private Integer Id;
    private Date fechaInicio;
    private Date fechaFinal;
    private String Descripcion;
    private String nota;

    public Control(Tarea id_tarea, String estadoTarea, String tipoTarea, Integer Id, Date fechaInicio, Date fechaFinal, String Descripcion, String nota) {
        this.id_tarea = id_tarea;
        this.estadoTarea = estadoTarea;
        this.tipoTarea = tipoTarea;
        this.Id = Id;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.Descripcion = Descripcion;
        this.nota = nota;
    }

    

   
    public Control() {
        this.id_tarea =null;
        this.fechaFinal=null;
        this.fechaInicio=null;
        this.estadoTarea = null;
        this.tipoTarea = null;
        this.Id=null;
        this.Descripcion=null;
        this.nota=null;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    
    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
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
        return "Control{" + "id_tarea="+ id_tarea+"nota"+nota+ "descripcion=" +Descripcion + ", estadoTarea=" + estadoTarea + ", tipoTarea=" + tipoTarea + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + '}';
    }
    
    
    
}
