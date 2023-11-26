/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materias.Controlador;

import controlador.listas.DynamicList;
import materias.Modelo.Nombre;

/**
 *
 * @author Elías
 */
public class DatoMateriaControl {
    private Nombre nombre;
    private DynamicList<Nombre> nombres;
     public DatoMateriaControl() {
        nombre = new Nombre();
        this.nombres = new DynamicList<>();
    }

    public Nombre getNombre() {
       if(nombre==null){
            nombre=new Nombre();
        }
        return nombre;
    }

    public void setNombre(Nombre nombre) {
        this.nombre = nombre;
    }

    public DynamicList<Nombre>Nombres() {
        return nombres;
    }

    public void setNombres(DynamicList<Nombre> nombres) {
        this.nombres = nombres;
    }

   
        

    //Mwtodo guardar
    public Boolean guardar(){
        nombre.setId(generarId());
        nombres.add(nombre);
        return true;
    }
    private Integer generarId(){
        return nombres.getLength()+1;
  }
    
   
    
     public void imprimir(){
        System.out.println(nombres.toString());
    }
}
