package com.iesam.edbooking.Usuario.domain;

public class Usuario {

    public final String dni;
    public final String nombre;
    public final String apellidos;
    public final String email;

    public Usuario(String dni, String nombre, String apellidos, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }
}
