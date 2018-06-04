package com.liquid.restApi.presentacion.controller.logica;

import com.liquid.restApi.datos.model.Persona;
import com.liquid.restApi.dominio.interactor.contrato.base.*;
import com.liquid.restApi.dominio.interactor.logica.base.*;
import com.liquid.restApi.presentacion.controller.contrato.ConsultarPersonaController;
import com.liquid.restApi.presentacion.controller.logica.base.ConsultarBaseControllerImpl;

import java.util.List;

/**
 * Created by Jse on 13/05/2018.
 */
public class ConsultarPersonaControllerImpl extends ConsultarBaseControllerImpl<Persona> implements ConsultarPersonaController {

    public ConsultarPersonaControllerImpl(GetBaseInteractor<Persona> getBaseInteractor, SaveBaseInteractor<Persona> saveBaseInteractor, UpdateBaseInteractor<Persona> updateBaseInteractor, DeleteBaseInteractor<Persona> deleteBaseInteractor, GetAllBaseInteractor<Persona> getAllBaseInteractor) {
        super(getBaseInteractor, saveBaseInteractor, updateBaseInteractor, deleteBaseInteractor, getAllBaseInteractor);
    }
}
