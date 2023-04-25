package com.MiRuta.APIRecy.modelosDAO;

import com.MiRuta.APIRecy.interfaces.Usuario_has_rutasInterface;
import com.MiRuta.APIRecy.modelos.Usuario_has_rutasModelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class Usuario_has_rutasDAO implements Usuario_has_rutasInterface {

    //Variable para realizar la consulta a la base de datos
    @Autowired
    JdbcTemplate template;



    //Metodo listar rutas favoritas para un usuario
    @Override
    public List<Map<String, Object>> listarRutasFavoritas(String correoUsuario) {
        String sql = "SELECT rutas.*, 'true' as es_favorita from rutas inner join usuario_has_rutas on (idRuta = Rutas_idRuta) where Usuario_Correo_Usu = ?";
        List<Map<String, Object>> rutaList = template.queryForList(sql, correoUsuario);
        return rutaList;
    }



    //Metodo agregar rutas favoritas para un usuario
    @Override
    public int agregarRutaFavorita(Usuario_has_rutasModelo ruta) {
        String sql = "insert into usuario_has_rutas (Usuario_Correo_Usu, Rutas_idRuta) values (?, ?)";
        return template.update(sql, ruta.getCorreoUsuario(), ruta.getIdRuta());
    }



    //Metodo eliminar rutas favoritas para un usuario
    @Override
    public String eliminarRutaFavorita(Usuario_has_rutasModelo ruta) {
        return null;
    }
}
