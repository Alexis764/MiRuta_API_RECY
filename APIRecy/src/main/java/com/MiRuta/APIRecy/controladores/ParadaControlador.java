package com.MiRuta.APIRecy.controladores;

import com.MiRuta.APIRecy.servicios.ParadaServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/parada")
public class ParadaControlador {

    //Objeto para servicio de parada
    @Autowired
    ParadaServicio paradaServicio;



    //Metodo listar todas las paradas
    @GetMapping("/listar")
    public List<Map<String, Object>> listarParadasCon(){
        return paradaServicio.listarParadas();
    }

}
