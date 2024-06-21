package com.iesam.edbooking.Habitacion.domain;

public class NewHabitacionUseCase {

    private HabitacionRepository habitacionRepository;

    public NewHabitacionUseCase(HabitacionRepository habitacionRepository) {
        this.habitacionRepository = habitacionRepository;
    }

    public void execute(Habitacion habitacion){
        habitacionRepository.create(habitacion);
    }
}
