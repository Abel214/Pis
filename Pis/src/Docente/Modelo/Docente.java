/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Docente.Modelo;

/**
 *
 * @author ALEJANDRO
 */
public class Docente {
    private String Nombre; 
    private String Apellido;
    private String edad;
    private Integer id;
    private String Cedula;
    private String Correo;
    private String Especialidad;
    private String Numero;

    public Docente(String Nombre, String Apellido, String edad, Integer id, String Cedula, String Correo, String Especialidad, String Numero) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.edad = edad;
        this.id = id;
        this.Cedula = Cedula;
        this.Correo = Correo;
        this.Especialidad = Especialidad;
        this.Numero = Numero;
    }
    public Docente() {
        this.Nombre = null;
        this.Apellido = null;
        this.edad = null;
        this.id =null;
        this.Cedula = null;
        this.Correo = null;
        this.Especialidad = null;
        this.Numero = null;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    @Override
    public String toString() {
        return "Docente{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", edad=" + edad + ", Cedula=" + Cedula + ", Correo=" + Correo + ", Especialidad=" + Especialidad + ", Numero=" + Numero + '}';
    }
    
    
}
