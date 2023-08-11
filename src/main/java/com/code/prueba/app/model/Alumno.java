package com.code.prueba.app.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name = "alumnos")
public class Alumno {

    @Id
    private String id;
    @NotBlank
    private String nombre;
    @NotBlank
    private String apellido;

    private Estado estado;
    @NotNull
    private int edad;


    public enum Estado{
        ACTIVO,
        INACTIVO
    }

}
