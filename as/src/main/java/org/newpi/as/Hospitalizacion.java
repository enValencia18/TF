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
class Hospitalizacion {
    private String numero;
    private String servicio;
    private String habitacion;
    private String cama;

    public Hospitalizacion() {
        this("", "", "", "");
    }

    public Hospitalizacion(String numero, String servicio, String habitacion, String cama) {
        this.numero = numero;
        this.servicio = servicio;
        this.habitacion = habitacion;
        this.cama = cama;
    } 
    //Q MAS FALTA?
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(String habitacion) {
        this.habitacion = habitacion;
    }

    public String getCama() {
        return cama;
    }

    public void setCama(String cama) {
        this.cama = cama;
    }
}
