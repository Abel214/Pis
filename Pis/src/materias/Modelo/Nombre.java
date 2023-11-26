/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materias.Modelo;

/**
 *
 * @author Elías
 */
public class Nombre {
   private Materia Id_nombre;
   private Integer id;

   public Nombre() {
        this.Id_nombre = null;
        this.id = null;
    }
    
   

    public Nombre(Materia Id_nombre, Integer id) {
        this.Id_nombre = Id_nombre;
        this.id = id;
    }
   
   
    public Materia getId_nombre() {
        return Id_nombre;
    }

    public void setId_nombre(Materia Id_nombre) {
        this.Id_nombre = Id_nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


   
   
}
