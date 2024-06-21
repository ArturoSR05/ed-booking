package com.iesam.edbooking.Habitacion.domain;

public interface HabitacionRepository {

    void create(Habitacion habitacion);
    Habitacion getHabitacion(String codHab);
}
