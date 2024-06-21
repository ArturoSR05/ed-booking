package com.iesam.edbooking.Hotel.Presentation;

import com.iesam.edbooking.Hotel.data.HotelDataRepository;
import com.iesam.edbooking.Hotel.data.local.HotelFileLocalDataSource;
import com.iesam.edbooking.Hotel.domain.Hotel;
import com.iesam.edbooking.Hotel.domain.NewHotelUseCase;

import java.util.Scanner;

public class HotelPresentation {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        createHotel();
    }

    public static void createHotel(){
        System.out.println("Id del hotel: ");
        String idHotel = sc.nextLine();
        System.out.println("Nombre del hotel: ");
        String nombre = sc.nextLine();
        System.out.println("Direccion del hotel: ");
        String direccion = sc.nextLine();
        System.out.println("Poblacion del hotel: ");
        String poblacion = sc.nextLine();
        System.out.println("Habitaciones: ");
        String habitaciones = sc.nextLine();

        Hotel hotel = new Hotel(idHotel, nombre, direccion, poblacion, habitaciones);
        NewHotelUseCase newHotelUseCase = new NewHotelUseCase(new HotelDataRepository(
                new HotelFileLocalDataSource()));
        newHotelUseCase.execute(hotel);
    }
}
