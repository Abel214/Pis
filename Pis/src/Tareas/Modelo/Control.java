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
    private String tipoTarea;
    private Integer Id;
    private String fechaInicio;
    private String fechaFinal;
    private String Descripcion;
    private String nota;
    private EstadoTarea id_estado;

    public Control(Tarea id_tarea,String  nota, String Descripcion, String tipoTarea, Integer Id, String fechaInicio, String fechaFinal,EstadoTarea id_estado) {
        this.id_tarea = id_tarea;
        this.tipoTarea = tipoTarea;
        this.Id = Id;
        this.Descripcion=Descripcion;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.nota=nota;
        this.id_estado=id_estado;
    }

   
    public Control() {
        this.id_tarea =null;
        this.fechaFinal=null;
        this.fechaInicio=null;
        this.tipoTarea = null;
        this.Id=null;
        this.Descripcion=null;
        this.nota=null;
        this.id_estado=null;
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
 

    public String getTipoTarea() {
        return tipoTarea;
    }

    public void setTipoTarea(String tipoTarea) {
        this.tipoTarea = tipoTarea;
    }

    public EstadoTarea getId_estado() {
        return id_estado;
    }

    public void setId_estado(EstadoTarea id_estado) {
        this.id_estado = id_estado;
    }
    

    @Override
    public String toString() {
        return "Control{" + "id_tarea="+ id_tarea+"id_estado"+id_estado+"nota"+nota+ "descripcion=" +Descripcion+ ", tipoTarea=" + tipoTarea + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + '}';
    }
    
    
    
}
