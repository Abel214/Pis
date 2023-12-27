/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas.Modelo;

/**
 *
 * @author ALEJANDRO
 */
public class EstadoTarea {
    private String estado;
    private Integer Id;

    public EstadoTarea(Integer Id,String estado) {
        this.estado = estado;

        this.Id = Id;
    }
    public EstadoTarea(){
        
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    @Override
    public String toString() {
        return estado;
    }
    

   
    
}
