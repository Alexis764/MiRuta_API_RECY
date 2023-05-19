package com.MiRuta.APIRecy.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "parada")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ParadaModelo {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, length = 3)
    private int idParadas;

    @Column(nullable = false, length = 70)
    private String nombrePara;

    @Column(nullable = false, length = 200)
    private String direccionPara;

    @Column(nullable = false, length = 200)
    private float longitud;

    @Column(nullable = false, length = 200)
    private float latitud;

    @Column(nullable = false, length = 500)
    private String imgParada;
}
