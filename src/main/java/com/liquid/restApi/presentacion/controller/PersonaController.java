package com.liquid.restApi.presentacion.controller;

import com.liquid.restApi.datos.model.Persona;

/**
 * Created by Jse on 13/05/2018.
 */
public interface PersonaController {
    Persona likePersona(String params);
    Persona getPersona(String id);
    boolean updatePeronsa(Persona persona);
    boolean deletePeronsa(Persona persona);
}
