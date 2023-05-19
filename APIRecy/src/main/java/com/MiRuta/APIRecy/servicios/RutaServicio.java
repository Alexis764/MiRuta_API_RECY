package com.MiRuta.APIRecy.servicios;

import com.MiRuta.APIRecy.interfaces.RutaInterface;
import com.MiRuta.APIRecy.modelos.RutaModelo;
import com.MiRuta.APIRecy.modelosDAO.RutaDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class RutaServicio implements RutaInterface {


    //Objeto DAO de ruta
    @Autowired
    RutaDAO rutaDAO;

    /*
    //Metodo listar todas las rutas
    @Override
    public List<Map<String, Object>> listarRutas(String correoUsuario) {
        return rutaDAO.listarRutas(correoUsuario);
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
