package com.liquid.restApi.datos.dao.hibernate;

import com.liquid.restApi.datos.PersonaDao;
import com.liquid.restApi.datos.dao.hibernate.model.PersonaImpl;
import com.liquid.restApi.datos.model.Persona;

import java.util.List;

public class PersonaDaoImpl implements PersonaDao {
    @Override
    public List<Persona> all() {
        return null;
    }

    @Override
    public Persona get(String id) {
        return new PersonaImpl("1","PersonaHibernate");
    }

    @Override
    public String add(PersonaDao personaDao) {
        return null;
    }

    @Override
    public boolean update(PersonaDao personaDao) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }
}
