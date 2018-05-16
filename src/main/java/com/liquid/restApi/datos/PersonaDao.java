package com.liquid.restApi.datos;

import com.liquid.restApi.datos.model.Persona;

import java.util.List;

public interface PersonaDao {
    List<Persona> all();
    Persona get(String id);
    String add(PersonaDao personaDao);
    boolean update(PersonaDao personaDao);
    boolean delete(String id);
}
