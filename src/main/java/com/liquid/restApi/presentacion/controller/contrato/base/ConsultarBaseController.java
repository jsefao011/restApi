package com.liquid.restApi.presentacion.controller.contrato.base;

import com.liquid.restApi.datos.model.Persona;

import java.util.List;

/**
 * Created by Jse on 13/05/2018.
 */
public interface ConsultarBaseController<T> {
    List<T> allObjeto();
    T getObjeto(int id);
    T save(T objeto);
    boolean updateObjecto(T objeto);
    boolean deleteObjeto(T objeto);
}
