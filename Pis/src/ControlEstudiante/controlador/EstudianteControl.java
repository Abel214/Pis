/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlEstudiante.controlador;

import ControlEstudiante.modelo.Estudiante;
import controlador.listas.DynamicList;

/**
 *
 * @author ALEJANDRO
 */
public class EstudianteControl {
    private Estudiante estudiante;
    private DynamicList<Estudiante> estudiantes;
     public EstudianteControl() {
        estudiante = new Estudiante();
        this.estudiantes = new DynamicList<>();
    }


    public Estudiante getEstudiante() {
        if(estudiante==null){
           estudiante=new Estudiante();
        }
            
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public DynamicList<Estudiante> geEstudiantes() {
        return estudiantes;
    }

    public void setVendedores(DynamicList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    

    
    //Mwtodo guardar
    public Boolean guardar(){
        estudiante.setId(generarId());
        estudiantes.add(estudiante);
        return true;
    }
    private Integer generarId(){
        return estudiantes.getLength()+1;
  }
    
   
    
     public void imprimir(){
        System.out.println(estudiantes.toString());
    }
}
