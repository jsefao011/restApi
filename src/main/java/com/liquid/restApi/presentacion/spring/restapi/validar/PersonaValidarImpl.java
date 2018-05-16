package com.liquid.restApi.presentacion.spring.restapi.validar;

import com.liquid.restApi.presentacion.validator.PersonaValidar;

public class PersonaValidarImpl implements PersonaValidar {

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getPersonaId() {
        return null;
    }
}
