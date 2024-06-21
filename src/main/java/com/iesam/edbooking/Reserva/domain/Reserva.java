package com.iesam.edbooking.Reserva.domain;

import com.iesam.edbooking.Habitacion.domain.Habitacion;
import com.iesam.edbooking.Usuario.domain.Usuario;

public class Reserva {
    public final String idReserva;

    public final Usuario usuario;
    public final Habitacion habitacion;
    public final String fechaIni;
    public final String fechaFin;
    public final String precio;

    public Reserva(String idReserva, Usuario usuario, Habitacion habitacion, String fechaIni, String fechaFin, String precio) {
        this.idReserva=idReserva;
        this.usuario = usuario;
        this.habitacion = habitacion;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.precio = precio;
    }

    public String getIdReserva(){
        return idReserva;
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
