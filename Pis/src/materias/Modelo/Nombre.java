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
   private Integer Id;
   private String identificativo;
   private String Paralelo;
   private String Ciclo;

   public Nombre() {
        this.Id_nombre = null;
        this.Id = null;
        this.Paralelo=null;
        this.Ciclo=null;
        this.identificativo=null;
    }
    
   

    public Nombre(Materia Id_nombre, Integer Id,String Paralelo,String Ciclo,String identificativo) {
        this.Id_nombre = Id_nombre;
        this.Id = Id;
        this.Paralelo=Paralelo;
        this.Ciclo=Ciclo;
        this.identificativo=identificativo;
    }

    public String getIdentificativo() {
        return identificativo;
    }

    public void setIdentificativo(String identificativo) {
        this.identificativo = identificativo;
    }
   
   
    public Materia getId_nombre() {
        return Id_nombre;
    }

    public void setId_nombre(Materia Id_nombre) {
        this.Id_nombre = Id_nombre;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
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
        return "Nombre{" + "Id_nombre=" + Id_nombre +  ", Paralelo=" + Paralelo + ", Ciclo=" + Ciclo + ", Identificativo=" + identificativo + '}';
    }
    

   
   
}
