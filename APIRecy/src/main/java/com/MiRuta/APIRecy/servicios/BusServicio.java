package com.MiRuta.APIRecy.servicios;

import com.MiRuta.APIRecy.interfaces.BusInterface;
import com.MiRuta.APIRecy.modelos.BusModelo;

import java.util.Optional;

public class BusServicio implements BusInterface {
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
}