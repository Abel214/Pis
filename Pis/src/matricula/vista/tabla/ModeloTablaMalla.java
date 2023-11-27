/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricula.vista.tabla;

import controlador.listas.DynamicList;
import exeption.EmptyException;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import matricula.modelo.Malla;

/**
 *
 * @author darwi
 */
public class ModeloTablaMalla extends AbstractTableModel {
    private DynamicList<Malla> mallas;
    
    @Override
    public int getRowCount() {
        if(mallas == null){
            mallas = new DynamicList<>();
        }
        return mallas.getLength();
    }

    @Override
    public int getColumnCount() { //Agregar columnas
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       
       Malla m;
       try {
           
           m = (Malla)mallas.getInfo(rowIndex);
           switch (columnIndex) {
            case 0:
                return (m != null) ? m.getId(): " ";
            case 1:
                return (m != null) ? m.getNombre(): " ";
            case 2:
                return (m != null) ? m.getId_Carrera(): " ";
            default:
                return null;
        }
       } catch (EmptyException e) {
           JOptionPane.showMessageDialog(null, "Ocurrió un error al obtener la información. Por favor, inténtelo de nuevo o contacte al soporte.", "Error", JOptionPane.ERROR_MESSAGE);
           return null;
       }
        
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Nombre";
            case 2:
                return "CARRERA ID";
            default:
                return null;
        }
    }
    /**
     * @return the personas
     */
    public DynamicList getMallas() {
        return mallas;
    }

    /**
     * @param mallas
     */
    public void setMallas(DynamicList mallas) {
        this.mallas = mallas;
    }
    
}
