package com.iesam.edbooking.Habitacion.domain;

public class Habitacion {

    public final String codHab;
    public final String numero;
    public final String descripcion;

    public Habitacion(String codHab, String numero, String descripcion) {
        this.codHab = codHab;
        this.numero = numero;
        this.descripcion = descripcion;
    }

    public String getCodHab() {
        return codHab;
    }

    public String getNumero() {
        return numero;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
