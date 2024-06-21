package com.iesam.edbooking.Hotel.domain;

import com.iesam.edbooking.Habitacion.domain.Habitacion;
import com.iesam.edbooking.Habitacion.domain.HabitacionRepository;

public class NewHotelUseCase {

    private HotelRepository hotelRepository;

    public NewHotelUseCase(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public void execute(Hotel hotel) {
        hotelRepository.create(hotel);
    }

}
