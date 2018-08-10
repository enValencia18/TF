/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.newpi.as;

/**
 *
 * @author Renzo
 */
public class Doctor {
    
    private String numero;
    private String Especializacion;

    public Doctor() {
        this("", "");
}

 public Doctor(String numero, String Especializacion) {
        this.numero = numero;
        this.Especializacion = Especializacion;                                        
}
     public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getEspecializacion() {
        return Especializacion;
    }

    public void setEspecializacion(String Especializacion) {
        this.Especializacion = Especializacion;
    }
    
}
