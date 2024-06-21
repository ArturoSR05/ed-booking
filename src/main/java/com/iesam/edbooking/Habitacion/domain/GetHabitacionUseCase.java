package com.iesam.edbooking.Habitacion.domain;

public class GetHabitacionUseCase {

    private HabitacionRepository habitacionRepository;

    public GetHabitacionUseCase(HabitacionRepository habitacionRepository) {
        this.habitacionRepository = habitacionRepository;
    }

    public Habitacion execute(String codHab){
        return habitacionRepository.getHabitacion(codHab);
    }
}
