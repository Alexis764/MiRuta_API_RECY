package com.MiRuta.APIRecy.controladores;


import com.MiRuta.APIRecy.modelos.RutaModelo;
import com.MiRuta.APIRecy.servicios.RutaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/Ruta")
@CrossOrigin(origins = "*", maxAge = 360)
public class RutaControlador {

    //Objeto para servicio de ruta
    @Autowired
    RutaServicio servicio;

    @GetMapping("/ListarRuta")
    public ArrayList<RutaModelo> ListarRuta(){
        return servicio.ListarRuta();
    }

    @PostMapping("/AgregarRuta")
    public String AgregarBus(@RequestBody RutaModelo ruta){
        return servicio.AgregarRuta(ruta);
    }

    @DeleteMapping("/EliminarRuta/{id}")
    public String EliminarRuta(@PathVariable("id") int idRuta){
        return servicio.EliminarRuta(idRuta);
    }
    

}
