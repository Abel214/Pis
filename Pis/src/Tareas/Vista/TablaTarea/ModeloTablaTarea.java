/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas.Vista.TablaTarea;

import Tareas.Modelo.Control;
import controlador.listas.DynamicList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ALEJANDRO
 */
public class ModeloTablaTarea extends AbstractTableModel {
       private DynamicList<Control> control;

    public DynamicList<Control> getControl() {
        return control;
    }

    public void setControl(DynamicList<Control> control) {
        this.control = control;
    }

        
     public ModeloTablaTarea() {
        this.control=new DynamicList<>();
    }
    @Override
    public int getRowCount(){
        return control.getLength();
        
    }
    @Override
    public int getColumnCount() {
       // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       return 5;
    }
    @Override
    public String getValueAt(int i,int i1){
        // i=fila 1=columna
        try {
            Control p = control.getInfo(i);
            
        switch(i1){
            case 0: return (p !=null) ? p.getId_tarea().getNombre():" ";   //modelos ternarios
            case 1: return (p !=null) ? p.getId_tarea().getDescripcion():" ";
            case 2: return (p !=null) ? p.getTipoTarea():" ";
            case 3: return (p !=null) ?  p.getEstadoTarea():" ";
            case 4: return (p !=null) ? p.getId_tarea().getNota():" ";
            
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
                return "Descripcion";
                case 2:
                return "Tipo tarea";
                case 3:
                    return "Estado tarea";
                case 4:
                    return "Nota";
                    
           
            default:
                return null;

        }
    }
}
