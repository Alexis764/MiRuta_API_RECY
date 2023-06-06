package com.MiRuta.APIRecy.servicios;


import com.MiRuta.APIRecy.interfaces.RutaInterface;
import com.MiRuta.APIRecy.modelos.RutaModelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class RutaServicio implements RutaInterface {


    //Objeto DAO de ruta
    @Autowired
    RutaInterface repository;

    public ArrayList<RutaModelo> ListarRuta(){
        return (ArrayList<RutaModelo>) repository.findAll();
    }

    public String AgregarRuta(RutaModelo ruta){
        var respuesta = "{'respuesta':'agregado correctamente'}";
        repository.save(ruta);
        return respuesta;
    }

    /*
    public Boolean EliminarBus(String PlacaBus) {
        var respuesta = "{'respuesta':'No se elimino'}";
        if(repository.existsById(PlacaBus)){
            repository.existsById(PlacaBus);
            return respuesta = "{'respuesta':'eliminado correctamente'}";
        }
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
