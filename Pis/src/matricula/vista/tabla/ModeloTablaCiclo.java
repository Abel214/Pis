/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricula.vista.tabla;

import controlador.listas.DynamicList;
import exeption.EmptyException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import matricula.modelo.Ciclo;

/**
 *
 * @author darwi
 */
public class ModeloTablaCiclo extends AbstractTableModel{
    private DynamicList<Ciclo> ciclos;
    
    @Override
    public int getRowCount() {
        if(ciclos == null){
            ciclos = new DynamicList<>();
        }
        return ciclos.getLength();
    }

    @Override
    public int getColumnCount() { //Agregar columnas
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
       
       Ciclo c;
       try {
           
           c = (Ciclo)ciclos.getInfo(rowIndex);
          String fechaInicio= formatoFecha.format(c.getFechaInicio());
           String fechaFin= formatoFecha.format(c.getFechaFin());
           switch (columnIndex) {
            case 0:
                return (c != null) ? c.getId(): " ";
            case 1:
                return (c != null) ? c.getNumCiclo(): " ";
            case 2:
                return (c != null) ? fechaInicio: " ";
            case 3:
                return (c != null) ? fechaFin: " ";
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
                return "Numero";
            case 2:
                return "FECHA INICIO";
            case 3:
                return "FECHA FIN";
            default:
                return null;
        }
    }
    /**
     * @return the personas
     */
    public DynamicList getCiclos() {
        return ciclos;
    }

    /**
     * @param ciclos
     */
    public void setCiclos(DynamicList ciclos) {
        this.ciclos = ciclos;
    }
    
}
