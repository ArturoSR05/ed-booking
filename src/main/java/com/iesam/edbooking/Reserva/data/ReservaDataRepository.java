package com.iesam.edbooking.Reserva.data;

import com.iesam.edbooking.Reserva.data.local.ReservaFileLocalDataSource;
import com.iesam.edbooking.Reserva.domain.Reserva;
import com.iesam.edbooking.Reserva.domain.ReservaRepository;

public class ReservaDataRepository implements ReservaRepository {

    private ReservaFileLocalDataSource reservaFileLocalDataSource;

    public ReservaDataRepository(ReservaFileLocalDataSource reservaFileLocalDataSource) {
        this.reservaFileLocalDataSource = reservaFileLocalDataSource;
    }

    @Override
    public void create(Reserva reserva) {
        reservaFileLocalDataSource.save(reserva);
    }
}
