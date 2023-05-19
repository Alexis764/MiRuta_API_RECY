package com.MiRuta.APIRecy.servicios;

import com.MiRuta.APIRecy.interfaces.UsuarioInterface;
import com.MiRuta.APIRecy.modelos.UsuarioModelo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class UsuarioServicio implements UsuarioInterface {

    UsuarioInterface repository;

    public UsuarioServicio(UsuarioInterface repository) {
        this.repository = repository;
    }

    public ArrayList<UsuarioModelo> Listar(){
        return (ArrayList<UsuarioModelo>) repository.findAll();
    }

    public String AgregarUsuario(UsuarioModelo usuario){
        repository.save(usuario);
        return "Se agrego Usuario";
    }

    public String EliminarUsuario(int idUsu) {
        String mensaje = "Error al Eliminar";
        if (repository.existsById(idUsu)) {
            repository.deleteById(idUsu);
            mensaje = "Se elimino correctamente";
        }
        return mensaje;
    }


    @Override
    public <S extends UsuarioModelo> S save(S entity) {
        return null;
    }

    @Override
    public <S extends UsuarioModelo> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<UsuarioModelo> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public Iterable<UsuarioModelo> findAll() {
        return null;
    }

    @Override
    public Iterable<UsuarioModelo> findAllById(Iterable<Integer> integers) {
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
    public void delete(UsuarioModelo entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends UsuarioModelo> entities) {

    }

    @Override
    public void deleteAll() {
    }
}