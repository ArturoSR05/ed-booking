package com.iesam.edbooking.Reserva.domain;

import com.iesam.edbooking.Habitacion.domain.Habitacion;
import com.iesam.edbooking.Usuario.domain.Usuario;

public class Reserva {

    public final Usuario usuario;
    public final Habitacion habitacion;
    public final String fechaIni;
    public final String fechaFin;
    public final String precio;

    public Reserva(Usuario usuario, Habitacion habitacion, String fechaIni, String fechaFin, String precio) {
        this.usuario = usuario;
        this.habitacion = habitacion;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.precio = precio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public String getFechaIni() {
        return fechaIni;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public String getPrecio() {
        return precio;
    }
}
