package com.MiRuta.APIRecy.controladores;


import com.MiRuta.APIRecy.modelos.BusModelo;
import com.MiRuta.APIRecy.servicios.BusServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    /*
    @PostMapping("/buses/{placaBus}")
    public ResponseEntity<String> modificarBus(@PathVariable String placaBus, @RequestBody String nuevaPlacaBus) {
        BusServicio.ModificarBus(placaBus, nuevaPlacaBus);
        return ResponseEntity.ok("Bus modificado correctamente");
    }
    */

    @DeleteMapping("/EliminarBus/{placa}")
    public String EliminarBus(@PathVariable("placa")String placaBus){
        return servicio.EliminarBus(placaBus);
    }
}
