package com.MiRuta.APIRecy.modelosDAO;

import com.MiRuta.APIRecy.interfaces.ParadaInterface;

import com.MiRuta.APIRecy.modelos.ParadaModelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class ParadaDao implements ParadaInterface {

    //Variable para realizar la consulta a la base de datos
    @Autowired
    JdbcTemplate template;

    /*
    //Metodo listar todas las paradas
    @Override
    public List<Map<String, Object>> listarParadas() {
        List<Map<String, Object>> paradaList = template.queryForList("SELECT * FROM paradas");
        return paradaList;
    }
    */

    @Override
    public <S extends ParadaModelo> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ParadaModelo> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ParadaModelo> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<ParadaModelo> findAll() {
        return null;
    }

    @Override
    public Iterable<ParadaModelo> findAllById(Iterable<Integer> integers) {
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
    public void delete(ParadaModelo entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends ParadaModelo> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
