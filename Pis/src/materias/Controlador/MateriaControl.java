/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materias.Controlador;

import controlador.listas.DynamicList;
import materias.Modelo.Materia;

/**
 *
 * @author ALEJANDRO
 */
public class MateriaControl {
     private DynamicList<Materia>materias;
  
    public MateriaControl(){
        materias=new DynamicList<>();
        materias.add(new Materia(1, "Electricidad","Electricidad"));
        materias.add(new Materia(2, "Algebra","Algebra lineal"));
        materias.add(new Materia(3, "Teoría Programación","Teoria programación"));
        materias.add(new Materia(4, "Matemáticas Discretas","Matemáticas discretas"));
        materias.add(new Materia(5, "Emprendimiento","Emprendimiento"));
        materias.add(new Materia(6, "Progrmación orientado a objetos","POO"));
        materias.add(new Materia(7, "Estructura de datos","Estructura de datos"));
        
    }

    public DynamicList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(DynamicList<Materia> materias) {
        this.materias = materias;
    }

    

}
