package com.liquid.restApi.datos.dao.hibernate.model;

import com.liquid.restApi.datos.model.Persona;

/**
 * Created by Jse on 13/05/2018.
 */
public class PersonaImpl implements Persona {
    private String id;
    private String nombre;

    public PersonaImpl(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String getId() {
        return id;
    }
    @Override
    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
