package com.liquid.restApi.presentacion.controller;

import com.liquid.restApi.datos.dao.hibernate.model.PersonaImpl;
import com.liquid.restApi.datos.model.Persona;

/**
 * Created by Jse on 13/05/2018.
 */
public class PersonaControllerImpl implements PersonaController {
    @Override
    public Persona likePersona(String params) {
        return null;
    }

    @Override
    public Persona getPersona(String id) {
        return new PersonaImpl(id,"Hello Persona");
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
