package com.iesam.edbooking.Usuario.presentation;

import com.iesam.edbooking.Usuario.data.UsuarioDataRepository;
import com.iesam.edbooking.Usuario.data.local.UsuarioFileLocalDataSource;
import com.iesam.edbooking.Usuario.domain.GetUsuarioUseCase;
import com.iesam.edbooking.Usuario.domain.Usuario;

import java.util.Scanner;

public class UsuarioPresentation {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        getUsuario();
    }

    public static void getUsuario(){
        System.out.println("Dni del usuario: ");
        String dni = sc.nextLine();

        GetUsuarioUseCase getUsuarioUseCase = new GetUsuarioUseCase(new UsuarioDataRepository(
                new UsuarioFileLocalDataSource()));
        getUsuarioUseCase.execute(dni);

        if (dni != null){
            Usuario usuario = getUsuarioUseCase.execute(dni);
            System.out.println(usuario);
        } else {
            System.out.println("El Dni del usuario no existe");
        }
    }
}
