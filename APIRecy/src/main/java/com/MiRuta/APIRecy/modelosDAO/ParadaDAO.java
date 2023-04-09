package com.MiRuta.APIRecy.modelosDAO;

import com.MiRuta.APIRecy.interfaces.ParadaInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class ParadaDAO implements ParadaInterface {

    //Variable para realizar la consulta a la base de datos
    @Autowired
    JdbcTemplate template;



    //Metodo listar todas las paradas
    @Override
    public List<Map<String, Object>> listarParadas() {
        List<Map<String, Object>> paradaList = template.queryForList("SELECT * FROM paradas");
        return paradaList;
    }

}
