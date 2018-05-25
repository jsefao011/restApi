package com.liquid.restApi.presentacion.controller.logica;

import com.liquid.restApi.datos.contrato.dao.PersonaDao;
import com.liquid.restApi.datos.contrato.model.Persona;
import com.liquid.restApi.presentacion.controller.contrato.ConsultarPersonaController;

import java.util.List;

/**
 * Created by Jse on 13/05/2018.
 */
public class ConsultarPersonaControllerImpl implements ConsultarPersonaController {
    private PersonaDao personaDao;

    public ConsultarPersonaControllerImpl(PersonaDao personaDao) {
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