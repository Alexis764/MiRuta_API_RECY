package com.MiRuta.APIRecy.controladores;

import com.MiRuta.APIRecy.modelos.ParadaModelo;
import com.MiRuta.APIRecy.servicios.ParadaServicio;

import com.MiRuta.APIRecy.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
//@RequestMapping("/parada")}
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

    @DeleteMapping("/EliminarParada/{id}")
    public String EliminarParada(@PathVariable("id")int idParada){
        return servicio.EliminarParada(idParada);
    }














    //Objeto para servicio de parada
    @Autowired
    ParadaServicio paradaServicio;



    /*
    //Metodo listar todas las paradas
    @GetMapping("/listar")
    public List<Map<String, Object>> listarParadasCon(){
        return paradaServicio.listarParadas();
    }
     */

}
