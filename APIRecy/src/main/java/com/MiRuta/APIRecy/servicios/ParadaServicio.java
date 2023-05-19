package com.MiRuta.APIRecy.servicios;

import com.MiRuta.APIRecy.interfaces.ParadaInterface;
import com.MiRuta.APIRecy.modelos.ParadaModelo;
import com.MiRuta.APIRecy.modelosDAO.ParadaDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class ParadaServicio implements ParadaInterface {

    //Objeto DAO de parada
    @Autowired
    ParadaDao paradaDao;

    /*
    //Metodo listar todas las paradas
    @Override
    public List<Map<String, Object>> listarParadas() {
        return paradaDao.listarParadas();
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
