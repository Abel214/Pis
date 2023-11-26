/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas.Modelo;

/**
 *
 * @author ALEJANDRO
 */
public class Tarea {
    private String nombre;
    private Integer Id;

    public Tarea(Integer Id,String nombre) {
        this.nombre = nombre;

        this.Id = Id;
    }
    public Tarea(){
        
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    


    
    
}
