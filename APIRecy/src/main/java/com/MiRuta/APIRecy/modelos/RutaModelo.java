package com.MiRuta.APIRecy.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;
import java.util.*;


@Entity
@Table(name = "ruta")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RutaModelo {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, length = 3)
    private int idRuta;

    @Column(nullable = false, length = 45)
    private String lugarInicio;

    @Column(nullable = false, length = 45)
    private String lugarFinal;

    @Column(nullable = false)
    @Temporal(TemporalType.TIME)
    private Time horaInicio;

    @Column(nullable = false)
    @Temporal(TemporalType.TIME)
    private Time horaFinal;
}
