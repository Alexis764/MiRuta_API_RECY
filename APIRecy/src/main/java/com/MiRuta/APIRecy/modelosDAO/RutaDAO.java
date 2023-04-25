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
    public List<Map<String, Object>> listarRutas(String correoUsuario) {
        String sql = "SELECT r.*, " +
                "CASE WHEN uhr.Usuario_Correo_Usu IS NULL THEN 'false' ELSE 'true' END AS es_favorita " +
                "FROM Rutas r LEFT JOIN Usuario_has_Rutas uhr ON r.idRuta = uhr.Rutas_idRuta AND uhr.Usuario_Correo_Usu = ?";
        List<Map<String, Object>> rutaList = template.queryForList(sql, correoUsuario);
        return rutaList;
    }

}
