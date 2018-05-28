package com.liquid.restApi.presentacion.controller.logica;

import com.liquid.restApi.datos.contrato.dao.PersonaDao;
import com.liquid.restApi.datos.contrato.model.Persona;
import com.liquid.restApi.dominio.cleanArquitectura.Response;
import com.liquid.restApi.dominio.iterador.contrato.PersonaIterador;
import com.liquid.restApi.dominio.iterador.logica.PersonaIteradorImpl;
import com.liquid.restApi.presentacion.controller.contrato.ConsultarPersonaController;

import java.util.List;

/**
 * Created by Jse on 13/05/2018.
 */
public class ConsultarPersonaControllerImpl implements ConsultarPersonaController {
    private PersonaIterador personaIterador;

    public ConsultarPersonaControllerImpl(PersonaIterador personaIterador) {
        this.personaIterador = personaIterador;
    }

    @Override
    public List<Persona> likePersona(String params) {
        PersonaIteradorImpl.PersonaResponceImpl responce = new PersonaIteradorImpl.PersonaResponceImpl();
        personaIterador.execute(new PersonaIteradorImpl.PersonaRequestImpl(params),responce);
        return responce.getPersonas();
    }

    @Override
    public Persona getPersona(String id) {
        return null;
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
