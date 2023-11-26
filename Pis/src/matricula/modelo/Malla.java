/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricula.modelo;

/**
 *
 * @author darwin
 */
public class Malla {
    private String nombre;
    private Integer id;
    private Integer numCiclos;

    public Malla(String nombre, Integer id, Integer numCiclos) {
        this.nombre = nombre;
        this.id = id;
        this.numCiclos = numCiclos;
    }

    public Malla() {
        this.nombre = null;
        this.id = null;
        this.numCiclos = null;
    }
    
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumCiclos() {
        return numCiclos;
    }

    public void setNumCiclos(Integer numCiclos) {
        this.numCiclos = numCiclos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
    
    
    
    
}
