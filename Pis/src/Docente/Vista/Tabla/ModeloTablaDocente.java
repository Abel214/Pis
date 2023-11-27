/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Docente.Vista.Tabla;

import Docente.Modelo.Docente;
import controlador.listas.DynamicList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ALEJANDRO
 */
public class ModeloTablaDocente extends AbstractTableModel {
    private DynamicList<Docente> docentes;

    public DynamicList<Docente> getDocentes() {
        return docentes;
    }

    public void setDocentes(DynamicList<Docente> docentes) {
        this.docentes = docentes;
    }

    

    
     public ModeloTablaDocente() {
        this.docentes=new DynamicList<>();
    }
    @Override
    public int getRowCount(){
        return docentes.getLength();
        
    }
    @Override
    public int getColumnCount() {
       // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       return 8;
    }
    @Override
    public String getValueAt(int i,int i1){
        // i=fila 1=columna
        try {
            Docente p = docentes.getInfo(i);
        switch(i1){
            case 0: return (p !=null) ? p.getNombre():" ";   //modelos ternarios
            case 1: return (p !=null) ? p.getApellido():" ";
            case 2: return (p !=null) ? p.getEdad():" ";
            case 3: return (p !=null) ? p.getCedula():" ";
            case 4: return (p !=null) ? p.getCorreo():" ";
            case 5: return (p !=null) ? p.getEspecialidad():" ";
            case 6: return (p !=null) ? p.getNumero():" ";
            case 7: return (p !=null) ? p.getDescripcion():" ";
            default:
                return null;
        }
         } catch (Exception e) {
        }
        return null;
    }
    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "Nombre";
            case 1:
                return "Apellido";
            case 2:
                return "Edad";
            case 3:
                return "Cedula";
            case 4:
                return "Correo"; 
             case 5:
                return "Especialidad"; 
              case 6:
                return "Número"; 
              case 7:
                return "Descripción"; 

            default:
                return null;

        }
    }
}
