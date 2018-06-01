package com.liquid.restApi.presentacion.spring.util;

import com.liquid.restApi.datos.logica.spring.dao.PersonaDaoImpl;
import com.liquid.restApi.dominio.iterador.logica.PersonaIteradorImpl;
import com.liquid.restApi.presentacion.controller.contrato.ConsultarPersonaController;
import com.liquid.restApi.presentacion.controller.logica.ConsultarPersonaControllerImpl;

/**
 * Created by Jse on 13/05/2018.
 */
public class InjectSpring {

    public static ConsultarPersonaController injectPersonaControllerSpring(){
        return new ConsultarPersonaControllerImpl(new PersonaIteradorImpl(new PersonaDaoImpl()));
    }
}
