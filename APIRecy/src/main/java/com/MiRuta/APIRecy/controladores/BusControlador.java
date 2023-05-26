package com.MiRuta.APIRecy.controladores;


import com.MiRuta.APIRecy.modelos.BusModelo;
import com.MiRuta.APIRecy.servicios.BusServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin(origins = "*", maxAge = 360)
@RequestMapping("/Bus")
public class BusControlador {
    @Autowired
    BusServicio servicio;

    @GetMapping("/ListarBus")
    public ArrayList<BusModelo> ListarBus(){
        return servicio.ListarBus();
    }

    @PostMapping("/AgregarBus")
    public String AgregarBus(@RequestBody BusModelo Bus){
        return servicio.AgregarBus(Bus);
    }

    //@PostMapping("/EditarBus")


    @DeleteMapping("/EliminarBus/{placa}")
    public boolean EliminarBus(@PathVariable("placa")String placaBus){
        return servicio.EliminarBus(placaBus);
    }
}
