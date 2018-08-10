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
public class TablaHospitacizacion implements TableModel{
    
    String[] columnas = { "Numero de Paciente",
                          "Codigo de servicio",
                          "Numero de Habitacion",
                          "Numero de cama"};
    
    ArrayList<Hospitalizacion> habitaciones;

    public TablaHospitacizacion() {
        try {
            habitaciones = new Conexion().getAllHospitalizacion();
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public int getRowCount() {
        return habitaciones.size();
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
            case 0: val = habitaciones.get(rowIndex).getNumero(); break;
            case 1: val = habitaciones.get(rowIndex).getServicio(); break;
            case 2: val = habitaciones.get(rowIndex).getHabitacion(); break;
            case 3: val = habitaciones.get(rowIndex).getCama(); break;
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
