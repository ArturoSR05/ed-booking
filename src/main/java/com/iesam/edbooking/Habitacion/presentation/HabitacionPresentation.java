package com.iesam.edbooking.Habitacion.presentation;

import com.iesam.edbooking.Habitacion.data.HabitacionDataRepository;
import com.iesam.edbooking.Habitacion.data.local.HabitacionFileLocalDataSource;
import com.iesam.edbooking.Habitacion.domain.GetHabitacionUseCase;
import com.iesam.edbooking.Habitacion.domain.Habitacion;
import com.iesam.edbooking.Habitacion.domain.NewHabitacionUseCase;

import java.util.Scanner;

public class HabitacionPresentation {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //createHabitacion();
        getHabitacion();
    }

    public static void createHabitacion(){
        System.out.println("Codigo de la habitacion: ");
        String codHab = sc.nextLine();
        System.out.println("Numero de la habitacion: ");
        String numero = sc.nextLine();
        System.out.println("Descripcion de la habitacion: ");
        String descripcion = sc.nextLine();

        Habitacion habitacion = new Habitacion(codHab, numero, descripcion);
        NewHabitacionUseCase newHabitacionUseCase = new NewHabitacionUseCase(new HabitacionDataRepository(
                new HabitacionFileLocalDataSource()));
        newHabitacionUseCase.execute(habitacion);
    }

    public static void getHabitacion(){
        System.out.println("Codigo de la habitacion: ");
        String codHab = sc.nextLine();

        GetHabitacionUseCase getHabitacionUseCase = new GetHabitacionUseCase(new HabitacionDataRepository(
                new HabitacionFileLocalDataSource()));
        getHabitacionUseCase.execute(codHab);

        if (codHab != null){
            Habitacion habitacion = getHabitacionUseCase.execute(codHab);
            System.out.println(habitacion);
        } else{
            System.out.println("Codigo de la habitacion no existe");
        }
    }
}
