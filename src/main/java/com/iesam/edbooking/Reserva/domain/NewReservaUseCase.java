package com.iesam.edbooking.Reserva.domain;

import com.iesam.edbooking.Habitacion.domain.Habitacion;
import com.iesam.edbooking.Habitacion.domain.HabitacionRepository;
import com.iesam.edbooking.Reserva.data.ReservaDataRepository;
import com.iesam.edbooking.Usuario.domain.Usuario;
import com.iesam.edbooking.Usuario.domain.UsuarioRepository;

public class NewReservaUseCase {

    private ReservaRepository reservaRepository;
    private HabitacionRepository habitacionRepository;
    private UsuarioRepository usuarioRepository;

    public NewReservaUseCase(ReservaRepository reservaRepository, HabitacionRepository habitacionRepository, UsuarioRepository usuarioRepository) {
        this.reservaRepository = reservaRepository;
        this.habitacionRepository = habitacionRepository;
        this.usuarioRepository = usuarioRepository;
    }



    public void execute(String idReserva, String dni, String codHab, String fechaIni, String fechaFin, String precio){
        Usuario usuario = usuarioRepository.getUsuario(dni);
        Habitacion habitacion = habitacionRepository.getHabitacion(codHab);
        Reserva reserva = new Reserva(idReserva, usuario, habitacion, fechaIni, fechaFin, precio);
        reservaRepository.create(reserva);
    }
}
