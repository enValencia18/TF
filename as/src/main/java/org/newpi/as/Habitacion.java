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
public class Habitacion {
    private String numero;
    private String supervisor;
    private String servicio;
    private String cama;
    
    public Habitacion()
    {
        this("","","","");
    }
    
    public Habitacion(String numero,String supervisor,String servicio,String cama)
    {
        this.numero=numero;
        this.supervisor=supervisor;
        this.servicio=servicio;
        this.cama=cama;
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getCama() {
        return cama;
    }

    public void setCama(String cama) {
        this.cama = cama;
    }
    
}
