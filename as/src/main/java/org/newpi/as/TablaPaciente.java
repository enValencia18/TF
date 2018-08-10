/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.newpi.as;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author Renzo
 */
public class TablaPaciente implements TableModel{
    
    String[] columnas = { "Número",
                          "Nombre",
                          "Apellido",
                          "Dirección",
                          "Teléfono",
                          "Seguro"};
    
    ArrayList<Paciente> pacientes;

    public TablaPaciente() {
        try {
            pacientes = new Conexion().getAllPaciente();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public int getRowCount() {
        return pacientes.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnas[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String val;
        switch (columnIndex) {
            case 0: val = pacientes.get(rowIndex).getNumero(); break;
            case 1: val = pacientes.get(rowIndex).getNombre(); break;
            case 2: val = pacientes.get(rowIndex).getApellido(); break;
            case 3: val = pacientes.get(rowIndex).getDireccion(); break;
            case 4: val = pacientes.get(rowIndex).getTelefono(); break;
            case 5: val = pacientes.get(rowIndex).getSeguro();break;
            default: val = "";
        }
        return val;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }
    
}
