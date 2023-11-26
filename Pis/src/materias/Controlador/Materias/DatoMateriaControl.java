/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materias.Controlador.Materias;

import controlador.dao.DaoImplement;
import controlador.listas.DynamicList;
import materias.Modelo.Nombre;

/**
 *
 * @author Elías
 */
public class DatoMateriaControl extends DaoImplement<Nombre>  {
       private DynamicList<Nombre> nombre;
    private Nombre nombre1;
     public DatoMateriaControl() {
        super(Nombre.class);
    }

    public DynamicList<Nombre> getNombre() {
        nombre=all();
        return nombre;
    }

    public void setTipos(DynamicList<Nombre> nombres) {
        this.nombre = nombre;
    }

    public Nombre getNombre1() {
        if (nombre1 == null) {
            nombre1 = new Nombre();
        }
        return nombre1;
    }

    public void setNombre1(Nombre nombre1) {
        this.nombre1 = nombre1;
    }




    public Boolean persist(){
        nombre1.setId(all().getLength()+ 1);
        return persist(nombre1);
    }
}
