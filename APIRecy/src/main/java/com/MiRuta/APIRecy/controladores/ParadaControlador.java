package com.MiRuta.APIRecy.controladores;

import com.MiRuta.APIRecy.modelos.ParadaModelo;
import com.MiRuta.APIRecy.servicios.ParadaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/Parada")
@CrossOrigin(origins = "*", maxAge = 360)
public class ParadaControlador {

    @Autowired
    ParadaServicio servicio;

    @GetMapping("/ListarParada")
    public ArrayList<ParadaModelo> ListarParada(){
        return servicio.ListarParada();
    }

    @PostMapping("/AgregarParada")
    public String AgregarParada(@RequestBody ParadaModelo Parada){
        return servicio.AgregarParada(Parada);
    }

    //@PostMapping("/EditarUsuario")


    @DeleteMapping("/EliminarParada/{id}")
    public String EliminarParada(@PathVariable("id")int idParadas){
        return servicio.EliminarParada(idParadas);
    }
}
