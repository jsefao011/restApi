package com.liquid.restApi.presentacion.controller;

import com.liquid.restApi.datos.contrato.PersonaDao;
import com.liquid.restApi.datos.contrato.model.Persona;

import java.util.List;

/**
 * Created by Jse on 13/05/2018.
 */
public class PersonaControllerImpl implements PersonaController {
    private PersonaDao personaDao;

    public PersonaControllerImpl(PersonaDao personaDao) {
        this.personaDao = personaDao;
    }

    @Override
    public List<Persona> likePersona(String params) {
        return personaDao.all();
    }

    @Override
    public Persona getPersona(String id) {
        return personaDao.get(id);
    }

    @Override
    public boolean updatePeronsa(Persona persona) {
        return false;
    }

    @Override
    public boolean deletePeronsa(Persona persona) {
        return false;
    }
}
