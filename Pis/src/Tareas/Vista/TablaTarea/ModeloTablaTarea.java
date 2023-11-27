/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tareas.Vista.TablaTarea;

import Tareas.Modelo.Control;
import controlador.listas.DynamicList;
import java.text.SimpleDateFormat;
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
       return 7;
    }
    @Override
    public String getValueAt(int i,int i1){
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Control p = control.getInfo(i);
             String fechaInicio= formatoFecha.format(p.getFechaInicio());
           String fechaFin= formatoFecha.format(p.getFechaFinal());
        switch(i1){
            case 0: return (p !=null) ? p.getId_tarea().getNombre():" ";   //modelos ternarios
            case 1: return (p !=null) ? p.getDescripcion():" ";
            case 2: return (p !=null) ? p.getTipoTarea():" ";
            case 3:return (p !=null) ? fechaInicio:" ";
            case 4:return (p !=null) ? fechaFin:" ";
            case 5: return (p !=null) ?  p.getEstadoTarea():" ";
             case 6: return (p !=null) ? p.getNota():" ";
            
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
                    return "Fecha Inicio";
                case 4:
                    return "Fecha Final";
                case 5:
                    return "Estado tarea";
                case 6:
                    return "Nota";
                    
           
            default:
                return null;

        }
    }
}
