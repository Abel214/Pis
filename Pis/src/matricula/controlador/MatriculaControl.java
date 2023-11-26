/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricula.controlador;

import controlador.dao.DaoImplement;
import controlador.listas.DynamicList;
import matricula.modelo.Matricula;

/**
 *
 * @author darwi
 */
public class MatriculaControl extends DaoImplement<Matricula>{
    private DynamicList<Matricula> listCasa;
    private Matricula matricula;

    public MatriculaControl() {
        super(Matricula.class);
    }
    

    public DynamicList<Matricula> getListC() {
        listCasa = all();
        return listCasa;
    }

    public void setListC(DynamicList<Matricula> ListC) {
        this.listCasa = ListC;
    }

    public Matricula getCasa() {
        if(matricula ==null){
            matricula = new Matricula();
        }
        return matricula;
    }

    public void setCasa(Matricula matricula) {
        this.matricula = matricula;
    }
    
    public Boolean persist(){
        matricula.setId(all().getLength()+1);
        return persist(matricula);
    }
    
}
