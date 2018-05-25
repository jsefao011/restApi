package com.liquid.restApi.datos.contrato.dao.base;

import com.liquid.restApi.datos.contrato.model.Persona;

import java.util.List;

public interface BaseDao <T> {
    List<T> all();
    Persona get(String id);
    String add(T tabla);
    boolean update(String id, T tabla);
    boolean delete(String id);
}
