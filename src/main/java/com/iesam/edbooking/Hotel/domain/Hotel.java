package com.iesam.edbooking.Hotel.domain;

import com.iesam.edbooking.Habitacion.domain.Habitacion;

public class Hotel {

    public final String idHotel;
    public final String nombre;
    public final String direccion;
    public final String poblacion;
    public final String habitaciones;

    public Hotel(String idHotel, String nombre, String direccion, String poblacion, String habitaciones) {
        this.idHotel = idHotel;
        this.nombre = nombre;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.habitaciones = habitaciones;
    }

    public String getIdHotel() {
        return idHotel;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public String getHabitaciones() {
        return habitaciones;
    }
}
