package com.liquid.restApi.datos.logica.spring.model;

import com.liquid.restApi.datos.contrato.model.*;

import java.util.List;

/**
 * Created by Jse on 13/05/2018.
 */
public class PersonaImpl{
    private String id;
    private String nombre;

    public PersonaImpl(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

}
