package com.MiRuta.APIRecy.servicios;


import com.MiRuta.APIRecy.interfaces.ParadaInterface;
import com.MiRuta.APIRecy.modelos.ParadaModelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ParadaServicio implements ParadaInterface {

    //Objeto DAO de parada
    @Autowired
    ParadaInterface repository;

    public ArrayList<ParadaModelo> ListarParada(){
        return (ArrayList<ParadaModelo>) repository.findAll();
    }

    public String AgregarParada(ParadaModelo Parada){
        repository.save(Parada);
        return "Se creo una parada exitosamente";
    }

    public String EliminarParada(int idParadas) {
        String mensaje = "Error al Eliminar";
        if (repository.existsById(idParadas)) {
            repository.deleteById(idParadas);
            mensaje = "Parada eliminada correctamente";
        }
        return mensaje;
    }

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
