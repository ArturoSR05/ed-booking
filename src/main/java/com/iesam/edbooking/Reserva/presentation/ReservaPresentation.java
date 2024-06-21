package com.iesam.edbooking.Reserva.presentation;

import com.iesam.edbooking.Habitacion.data.HabitacionDataRepository;
import com.iesam.edbooking.Habitacion.data.local.HabitacionFileLocalDataSource;
import com.iesam.edbooking.Habitacion.domain.Habitacion;
import com.iesam.edbooking.Habitacion.domain.HabitacionRepository;
import com.iesam.edbooking.Reserva.data.ReservaDataRepository;
import com.iesam.edbooking.Reserva.data.local.ReservaFileLocalDataSource;
import com.iesam.edbooking.Reserva.domain.NewReservaUseCase;
import com.iesam.edbooking.Reserva.domain.Reserva;
import com.iesam.edbooking.Reserva.domain.ReservaRepository;
import com.iesam.edbooking.Usuario.data.UsuarioDataRepository;
import com.iesam.edbooking.Usuario.data.local.UsuarioFileLocalDataSource;
import com.iesam.edbooking.Usuario.domain.Usuario;
import com.iesam.edbooking.Usuario.domain.UsuarioRepository;

import java.util.Scanner;

public class ReservaPresentation {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        createReserva();
    }

    public static void createReserva(){
        System.out.println("Id de la reserva: ");
        String idReserva = sc.nextLine();
        System.out.println("Dni del Usuario: ");
        String dni = sc.nextLine();
        UsuarioRepository usuarioRepository = new UsuarioDataRepository(new UsuarioFileLocalDataSource());
        System.out.println("Codigo de la habitacion: ");
        String codHab = sc.nextLine();
        HabitacionRepository habitacionRepository = new HabitacionDataRepository(new HabitacionFileLocalDataSource());
        System.out.println("Fecha de inicio de la reserva: ");
        String fechaIni = sc.nextLine();
        System.out.println("Fecha de fin de la reserva: ");
        String fechaFin = sc.nextLine();
        System.out.println("Precio de la reserva: ");
        String precio = sc.nextLine();

        ReservaRepository reservaRepository = new ReservaDataRepository(new ReservaFileLocalDataSource());
        Usuario usuario = usuarioRepository.getUsuario(dni);
        Habitacion habitacion = habitacionRepository.getHabitacion(codHab);
        Reserva reserva = new Reserva(idReserva, usuario, habitacion, fechaIni, fechaFin, precio);

        NewReservaUseCase newReservaUseCase = new NewReservaUseCase(reservaRepository, habitacionRepository, usuarioRepository);
        newReservaUseCase.execute(idReserva, dni, codHab, fechaIni, fechaFin, precio);
    }
}
