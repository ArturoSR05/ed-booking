package com.iesam.edbooking.Habitacion.data;

import com.iesam.edbooking.Habitacion.data.local.HabitacionFileLocalDataSource;
import com.iesam.edbooking.Habitacion.domain.Habitacion;
import com.iesam.edbooking.Habitacion.domain.HabitacionRepository;

public class HabitacionDataRepository implements HabitacionRepository {

    private HabitacionFileLocalDataSource habitacionFileLocalDataSource;

    public HabitacionDataRepository(HabitacionFileLocalDataSource habitacionFileLocalDataSource) {
        this.habitacionFileLocalDataSource = habitacionFileLocalDataSource;
    }

    @Override
    public void create(Habitacion habitacion) {
        habitacionFileLocalDataSource.save(habitacion);
    }

    @Override
    public Habitacion getHabitacion(String codHab) {
        return habitacionFileLocalDataSource.findById(codHab);
    }


}
