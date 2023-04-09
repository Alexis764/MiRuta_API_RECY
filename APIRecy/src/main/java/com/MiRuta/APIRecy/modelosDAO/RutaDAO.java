package com.MiRuta.APIRecy.modelosDAO;

import com.MiRuta.APIRecy.interfaces.RutaInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class RutaDAO implements RutaInterface {

    //Variable para realizar la consulta a la base de datos
    @Autowired
    JdbcTemplate template;



     //Metodo listar todas las rutas
    @Override
    public List<Map<String, Object>> listarRutas() {
        List<Map<String, Object>> rutaList = template.queryForList("SELECT * FROM rutas");
        return rutaList;
    }

}
