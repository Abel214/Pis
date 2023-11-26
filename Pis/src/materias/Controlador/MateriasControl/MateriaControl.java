/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materias.Controlador.MateriasControl;

import controlador.dao.DaoImplement;
import controlador.listas.DynamicList;
import materias.Modelo.Materia;

/**
 *
 * @author Elías
 */
public class MateriaControl extends DaoImplement<Materia>{
     private DynamicList<Materia>listR=new DynamicList<>();
     private Materia materia;
     
     public MateriaControl(){
         super(Materia.class);
     }
    public DynamicList<Materia> getListR() {
        listR=all();
        return listR;
    }

    public void setListR(DynamicList<Materia> listR) {
        this.listR = listR;
    }

    public Materia getMateria() {
        if(materia==null)
            materia=new Materia();
            return materia;
        
        
    }


    public void setMateria(Materia materia) {
        this.materia = materia;
    }
    public Boolean persit(){
        materia.setId(all().getLength()+1);
        
        return persist(materia);
    }
}
