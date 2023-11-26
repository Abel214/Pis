/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Docente.Controlador.ContrlDocente;

import Docente.Modelo.Docente;
import controlador.dao.DaoImplement;
import controlador.listas.DynamicList;

/**
 *
 * @author ALEJANDRO
 */
public class DatoDocenteControl extends DaoImplement<Docente> {
       private DynamicList<Docente> docente;
    private Docente docente1;
     public DatoDocenteControl() {
         super(Docente.class);
    }

    public DynamicList<Docente> getDocente() {
        docente=all();
        return docente;
    }

    public void setDocente(DynamicList<Docente> docente) {
        this.docente= docente;
    }

    public Docente getDocente1() {
        if (docente1 == null) {
            docente1 = new Docente();
        }
        return docente1;
    }

    public void setDocente1(Docente docente1) {
        this.docente1 = docente1;
    }




    public Boolean persist(){
       docente1.setId(all().getLength()+ 1);
        return persist(docente1);
    }
}
