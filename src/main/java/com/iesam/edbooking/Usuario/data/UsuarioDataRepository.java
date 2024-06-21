package com.iesam.edbooking.Usuario.data;

import com.iesam.edbooking.Usuario.data.local.UsuarioFileLocalDataSource;
import com.iesam.edbooking.Usuario.domain.Usuario;
import com.iesam.edbooking.Usuario.domain.UsuarioRepository;

public class UsuarioDataRepository implements UsuarioRepository {

    private UsuarioFileLocalDataSource usuarioFileLocalDataSource;

    public UsuarioDataRepository(UsuarioFileLocalDataSource usuarioFileLocalDataSource) {
        this.usuarioFileLocalDataSource = usuarioFileLocalDataSource;
    }


    @Override
    public Usuario getUsuario(String dni) {
        return usuarioFileLocalDataSource.findById(dni);
    }
}
