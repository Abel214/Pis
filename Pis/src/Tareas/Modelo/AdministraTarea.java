/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas.Modelo;

/**
 *
 * @author ALEJANDRO
 */
public class AdministraTarea {
    private Tarea id_tarea;
    private String estadoTarea;
    private String tipoTarea;

    public AdministraTarea(Tarea id_tarea, String estadoTarea, String tipoTarea) {
        this.id_tarea = id_tarea;
        this.estadoTarea = estadoTarea;
        this.tipoTarea = tipoTarea;
    }
    public AdministraTarea() {
        this.id_tarea =null;
        this.estadoTarea = null;
        this.tipoTarea = null;
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
