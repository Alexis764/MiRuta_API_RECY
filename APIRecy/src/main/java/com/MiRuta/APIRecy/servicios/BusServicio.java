package com.MiRuta.APIRecy.servicios;

import com.MiRuta.APIRecy.interfaces.BusInterface;
import com.MiRuta.APIRecy.modelos.BusModelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
@Service
public class BusServicio implements BusInterface {

    //Objeto DAO de parada
    @Autowired
    BusInterface repository;

    public ArrayList<BusModelo> ListarBus(){
        return (ArrayList<BusModelo>) repository.findAll();
    }

    public String AgregarBus(BusModelo Bus){
        var respuesta = "{'respuesta':'agregado correctamente'}";
        if (repository.existsById(Bus.getPlacaBus())){
            repository.save(Bus);
        }
        return respuesta;
    }

    public String EliminarBus(String PlacaBus) {
        var respuesta = "{'respuesta' : 'No se pudo eliminar usuario'}";
        if (repository.existsById(PlacaBus)){
            repository.deleteById(PlacaBus);
            return respuesta = "{'respuesta':'Eliminado correctamente'}";
        }
        return respuesta;
    }

    public static void ModificarBus(String nuevaPlacaBus, String placaBus){
        return ;
    }

    @Override
    public <S extends BusModelo> S save(S entity) {
        return null;
    }

    @Override
    public <S extends BusModelo> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<BusModelo> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public Iterable<BusModelo> findAll() {
        return null;
    }

    @Override
    public Iterable<BusModelo> findAllById(Iterable<String> strings) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(BusModelo entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends BusModelo> entities) {

    }

    @Override
    public void deleteAll() {

    }

    /*
    @Override
    public Optional<BusModelo> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<BusModelo> findByPlacaBus(String placaBus) {
        return Optional.empty();
    }
    */
}
