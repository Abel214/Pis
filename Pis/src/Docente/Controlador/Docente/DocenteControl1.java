/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Docente.Controlador.Docente;

import Docente.Modelo.Docente;
import controlador.dao.DaoImplement;
import controlador.listas.DynamicList;

/**
 *
 * @author ALEJANDRO
 */
public class DocenteControl1 extends DaoImplement<Docente> {
     private DynamicList<Docente>listR=new DynamicList<>();
     private Docente docente;
     
     public DocenteControl1(){
         super(Docente.class);
     }
    public DynamicList<Docente> getListR() {
        return listR = all();
    }

    public void setListR(DynamicList<Docente> listR) {
        this.listR = listR;
    }

    public Docente getDocente() {
        if(docente==null)
            docente=new Docente();
            return docente;
        
        
    }


    public void setDocente (Docente docente) {
        this.docente= docente;
    }
    public Boolean persit(){
        docente.setId(all().getLength()+1);
        
        return persist(docente);
    }
}
