package com.iesam.edbooking.Usuario;

import com.iesam.edbooking.Usuario.domain.GetUsuarioUseCase;
import com.iesam.edbooking.Usuario.domain.Usuario;
import com.iesam.edbooking.Usuario.domain.UsuarioRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class GetUsuarioUseCaseTest {

    @Mock
    UsuarioRepository usuarioRepository;
    GetUsuarioUseCase getUsuarioUseCase;

    @BeforeEach
    void setUp() {
        getUsuarioUseCase = new GetUsuarioUseCase(usuarioRepository);
    }

    @AfterEach
    void tearDown() {
        getUsuarioUseCase = null;
    }

    @Test
    public void siHayUsuarioDevuelvoElUsuario(){
        //Given
        Usuario usuarioEsperado = new Usuario("dni1", "nombre1", "apellidos1", "email1");

        //When
        Usuario usuarioRecibido = getUsuarioUseCase.execute("dni1");

        //Then
        Assertions.assertEquals(usuarioRecibido.dni, "dni1");
        Assertions.assertEquals(usuarioRecibido.nombre, "nombre1");
        Assertions.assertEquals(usuarioRecibido.apellidos, "apellidos1");
        Assertions.assertEquals(usuarioRecibido.email, "email1");
    }
}
