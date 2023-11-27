/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Docente.Controlador;

import Docente.Modelo.Docente;
import controlador.listas.DynamicList;

/**
 *
 * @author ALEJANDRO
 */
public class DocenteControl {
    private Docente docente;
    private DynamicList<Docente> docentes;
     public DocenteControl() {
        docente = new Docente();
        this.docentes = new DynamicList<>();
    }


    public Docente getDocente() {
        if(docente==null){
            docente=new Docente();
        }
            
        return docente;
    }

    public void setVendedor(Docente docente) {
        this.docente = docente;
    }

    public DynamicList<Docente> getDocentes() {
        return docentes;
    }

    public void setDocentes(DynamicList<Docente> docentes) {
        this.docentes = docentes;
    }

    

    
    //Mwtodo guardar
    public Boolean guardar(){
        docente.setId(generarId());
        docentes.add(docente);
        return true;
    }
    private Integer generarId(){
        return docentes.getLength()+1;
  }
    
   
    
     public void imprimir(){
        System.out.println(docentes.toString());
    }
}
