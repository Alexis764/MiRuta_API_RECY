package com.MiRuta.APIRecy.servicios;

import com.MiRuta.APIRecy.interfaces.ParadaInterface;
import com.MiRuta.APIRecy.modelosDAO.ParadaDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ParadaServicio implements ParadaInterface {

    //Objeto DAO de parada
    @Autowired
    ParadaDAO paradaDAO;



    //Metodo listar todas las paradas
    @Override
    public List<Map<String, Object>> listarParadas() {
        return paradaDAO.listarParadas();
    }

}
