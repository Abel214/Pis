/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materias.Modelo;

/**
 *
 * @author ALEJANDRO
 */
public class Materia {
    private Integer id;
    private String nombre_materia;
    private String descripcion;

    public Materia(Integer id, String nombre_materia, String descripcion) {
        this.id = id;
        this.nombre_materia = nombre_materia;
        this.descripcion = descripcion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre_materia() {
        return nombre_materia;
    }

    public void setNombre_materia(String nombre_materia) {
        this.nombre_materia = nombre_materia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Materia{" + "nombre_materia=" + nombre_materia + '}';
    }
    
}
