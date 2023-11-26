/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package materias.Vista.Tabla;

import controlador.listas.DynamicList;
import javax.swing.table.AbstractTableModel;
import materias.Modelo.Nombre;

/**
 *
 * @author Elías
 */
public class ModeloTablaMateria extends AbstractTableModel {
    private DynamicList<Nombre> nombre;

    public DynamicList<Nombre> geNombre() {
        return nombre;
    }

    public void setNombre(DynamicList<Nombre> nombre) {
        this.nombre = nombre;
    }
     public ModeloTablaMateria() {
        this.nombre=new DynamicList<>();
    }
    @Override
    public int getRowCount(){
        return nombre.getLength();
        
    }
    @Override
    public int getColumnCount() {
       // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       return 3;
    }
    @Override
    public String getValueAt(int i,int i1){
        // i=fila 1=columna
        try {
            Nombre p = nombre.getInfo(i);
            
        switch(i1){
            case 0: return (p !=null) ? p.getCiclo():" ";   //modelos ternarios
            case 1: return (p !=null) ? p.getParalelo():" ";
            case 2: return (p !=null) ? p.getId_nombre().getNombre_materia():" ";
 
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
                return "Ciclo";
                 case 1:
                return "Paralelo";
                case 2:
                return "Nombre materia";
               
           
            default:
                return null;

        }
    }
    
}
