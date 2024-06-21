package com.iesam.edbooking.Hotel.data;

import com.iesam.edbooking.Hotel.data.local.HotelFileLocalDataSource;
import com.iesam.edbooking.Hotel.domain.Hotel;
import com.iesam.edbooking.Hotel.domain.HotelRepository;

public class HotelDataRepository implements HotelRepository {

    private HotelFileLocalDataSource hotelFileLocalDataSource;

    public HotelDataRepository(HotelFileLocalDataSource hotelFileLocalDataSource) {
        this.hotelFileLocalDataSource = hotelFileLocalDataSource;
    }

    @Override
    public void create(Hotel hotel) {
        hotelFileLocalDataSource.save(hotel);
    }
}
