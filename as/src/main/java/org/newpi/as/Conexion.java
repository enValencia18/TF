
package org.newpi.as;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Conexion {
    
    Connection conn;
    Statement stmt;

    public Conexion() throws ClassNotFoundException, SQLException 
    {
        String urlDatabase = "jdbc:mysql://localhost/hopital";
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(urlDatabase, "root", "");
        stmt = conn.createStatement();
    }

    void exec(String string) throws SQLException {
        stmt.execute(string);
    }
    
    void execQueri(String strinf) throws SQLException
    {
        stmt.executeQuery(strinf);
    }
    
    
    //EMPLEADOS
    ArrayList<Empleado> getAllEmployees() throws SQLException {
        String query = "Select numero, nom, prenom, adresse, tel from employe";
        ResultSet rs = stmt.executeQuery(query);
        ArrayList<Empleado> resultado = new ArrayList<>();
        while (rs.next()) {
            resultado.add(new Empleado(
                    "" + rs.getInt("numero"),
                    rs.getString("nom"),
                    rs.getString("prenom"),
                    rs.getString("adresse"),
                    rs.getString("tel")
            ));
        }       
        return resultado;
    }
    
    //DOCTOR
    ArrayList<Doctor> getAllDoctores() throws SQLException{
        String query = "Select numero, specialite from docteur";
        ResultSet rs = stmt.executeQuery(query);
        ArrayList<Doctor> resultado = new ArrayList<>();
        while(rs.next()){
            resultado.add(new Doctor("" + rs.getInt("numero"), rs.getString("specialite")));
        }
        return resultado;
    }
    //HOSPITA
    ArrayList<Hospitalizacion> getAllHospitalizacion() throws SQLException{
        String query = "Select no_malade, code_service, no_chambre, lit from hospitalisation"; 
        ResultSet rs = stmt.executeQuery(query);
        ArrayList<Hospitalizacion> resultado = new ArrayList<>();
        while(rs.next()){
            resultado.add(new Hospitalizacion(""+rs.getInt("no_malade"), rs.getString("code_service"), 
            ""+rs.getInt("no_chambre"),""+ rs.getInt("lit")));
        }
        return resultado;
    }
    
    //Habitacion
    
    ArrayList<Habitacion> getAllHabitacion() throws SQLException{
        String query = "Select code_service, no_chambre, surveillant, nb_lits from chambre"; 
        ResultSet rs = stmt.executeQuery(query);
        ArrayList<Habitacion> resultado = new ArrayList<>();
        while(rs.next()){
            resultado.add(new Habitacion(rs.getString("code_service"),""+ rs.getInt("no_chambre"), 
            ""+rs.getInt("surveillant"),""+ rs.getInt("nb_lits")));
        }
        return resultado;
    }
    
    //Paciente FALTA
    
    ArrayList<Paciente> getAllPaciente() throws SQLException {
        String query = "Select numero, nom, prenom, adresse, tel, mutuelle from malade";
        ResultSet rs = stmt.executeQuery(query);
        ArrayList<Paciente> resultado = new ArrayList<>();
        while (rs.next()) {
            resultado.add(new Paciente("" + rs.getInt("numero"),
                    rs.getString("nom"),
                    rs.getString("prenom"),
                    rs.getString("adresse"),
                    rs.getString("tel"),
                    rs.getString("mutuelle")
            ));
        }       
        return resultado;
    }

    void execQueri(String string, String num, String nom, String ape, String dir, String tel, String cad1, String cad2, String cad3, String cad4, String cad5) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}