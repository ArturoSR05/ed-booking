package com.iesam.edbooking.Hotel;

import com.iesam.edbooking.Hotel.domain.Hotel;
import com.iesam.edbooking.Hotel.domain.HotelRepository;
import com.iesam.edbooking.Hotel.domain.NewHotelUseCase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNull;

@ExtendWith(MockitoExtension.class)
public class NewHotelUseCaseTest {

    @Mock
    HotelRepository hotelRepository;
    NewHotelUseCase newHotelUseCase;

    @BeforeEach
    void setUp() {
        newHotelUseCase = new NewHotelUseCase(hotelRepository);
    }

    @AfterEach
    void tearDown() {
        newHotelUseCase = null;
    }

    @Test
    public void reciboUnHotelValidoYGuardoElHotel(){
        //Given
        Hotel hotel = new Hotel("2", "nombre", "direccion", "poblacion", "habitaciones");

        //When
        newHotelUseCase.execute(hotel);

        //Then
        Mockito.verify(hotelRepository, Mockito.times(1)).create(hotel);
    }

    @Test
    public void reciboUnHotelInvalidoYDevuelvoNulo(){
        //Given
        Hotel hotelNull = null;

        //When
        newHotelUseCase.execute(hotelNull);

        //Then
        Mockito.verify(hotelRepository, Mockito.never()).create(Mockito.any(Hotel.class));
    }
}
