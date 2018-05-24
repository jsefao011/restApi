package com.liquid.restApi.presentacion.controller;

import com.liquid.restApi.datos.contrato.model.Persona;

import java.util.List;

/**
 * Created by Jse on 13/05/2018.
 */
public interface PersonaController {
    List<Persona> likePersona(String params);
    Persona getPersona(String id);
    boolean updatePeronsa(Persona persona);
    boolean deletePeronsa(Persona persona);
}
