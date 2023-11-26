/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlEstudiante.vista.Tabla;

import ControlEstudiante.modelo.Estudiante;
import controlador.listas.DynamicList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ALEJANDRO
 */
public class ModeloTablaEstudiante extends AbstractTableModel{
     private DynamicList<Estudiante> estudiantes;

    public DynamicList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(DynamicList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

     public ModeloTablaEstudiante() {
        this.estudiantes=new DynamicList<>();
    }
    @Override
    public int getRowCount(){
        return estudiantes.getLength();
        
    }
    @Override
    public int getColumnCount() {
       // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       return 4;
    }
    @Override
    public String getValueAt(int i,int i1){
        // i=fila 1=columna
        try {
            Estudiante p = estudiantes.getInfo(i);
        switch(i1){
            case 0: return (p !=null) ? p.getNombre():" ";   //modelos ternarios
            case 1: return (p !=null) ? p.getApellido():" ";
            case 2: return (p !=null) ? p.getEdad():" ";
            case 3: return (p !=null) ? p.getCorreo():" ";
            case 4: return (p !=null) ? p.getCedula():" ";
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
                return "Correo";
              case 4:
                return "Cedula";
                
            default:
                return null;

        }
    }
}
