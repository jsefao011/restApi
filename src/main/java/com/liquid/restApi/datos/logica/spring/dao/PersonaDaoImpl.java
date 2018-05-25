package com.liquid.restApi.datos.logica.spring.dao;

import com.liquid.restApi.datos.contrato.dao.PersonaDao;
import com.liquid.restApi.datos.contrato.model.Persona;
import com.liquid.restApi.datos.logica.spring.model.PersonaImpl;

import java.util.ArrayList;
import java.util.List;

public class PersonaDaoImpl implements PersonaDao {
    @Override
    public List<Persona> all() {
        List<Persona> personaList = new ArrayList<>();
        personaList.add(new PersonaImpl("0","all Spring"));
        return personaList;
    }

    @Override
    public Persona get(String id) {
        return new PersonaImpl("2","PersonaSpring");
    }

    @Override
    public String add(Persona tabla) {
        return null;
    }

    @Override
    public boolean update(String id, Persona tabla) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }
}
