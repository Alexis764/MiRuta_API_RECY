package com.MiRuta.APIRecy.modelosDAO;

import com.MiRuta.APIRecy.interfaces.RutaInterface;

import com.MiRuta.APIRecy.modelos.RutaModelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class RutaDAO implements RutaInterface {

    //Variable para realizar la consulta a la base de datos
    @Autowired
    JdbcTemplate template;

    /*
    //Metodo listar todas las rutas
    @Override
    public List<Map<String, Object>> listarRutas(String correoUsuario) {
        String sql = "SELECT r.*, " +
                "CASE WHEN uhr.Usuario_Correo_Usu IS NULL THEN 'false' ELSE 'true' END AS es_favorita " +
                "FROM Rutas r LEFT JOIN Usuario_has_Rutas uhr ON r.idRuta = uhr.Rutas_idRuta AND uhr.Usuario_Correo_Usu = ?";
        List<Map<String, Object>> rutaList = template.queryForList(sql, correoUsuario);
        return rutaList;
    }
    */

    @Override
    public <S extends RutaModelo> S save(S entity) {
        return null;
    }

    @Override
    public <S extends RutaModelo> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<RutaModelo> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<RutaModelo> findAll() {
        return null;
    }

    @Override
    public Iterable<RutaModelo> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(RutaModelo entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends RutaModelo> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
