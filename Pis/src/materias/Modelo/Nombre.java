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
   private String Paralelo;
   private String Ciclo;

   public Nombre() {
        this.Id_nombre = null;
        this.id = null;
        this.Paralelo=null;
        this.Ciclo=null;
    }
    
   

    public Nombre(Materia Id_nombre, Integer id,String Paralelo,String Ciclo) {
        this.Id_nombre = Id_nombre;
        this.id = id;
        this.Paralelo=Paralelo;
        this.Ciclo=Ciclo;
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

    public String getParalelo() {
        return Paralelo;
    }

    public void setParalelo(String Paralelo) {
        this.Paralelo = Paralelo;
    }

    public String getCiclo() {
        return Ciclo;
    }

    public void setCiclo(String Ciclo) {
        this.Ciclo = Ciclo;
    }

    @Override
    public String toString() {
        return "Nombre{" + "Id_nombre=" + Id_nombre + ", id=" + id + ", Paralelo=" + Paralelo + ", Ciclo=" + Ciclo + '}';
    }
    

   
   
}
