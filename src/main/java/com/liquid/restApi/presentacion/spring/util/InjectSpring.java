package com.liquid.restApi.presentacion.spring.util;

import com.liquid.restApi.datos.dao.spring.PersonaDaoImpl;
import com.liquid.restApi.presentacion.controller.ConsultarPersonaController;
import com.liquid.restApi.presentacion.controller.ConsultarPersonaControllerImpl;

/**
 * Created by Jse on 13/05/2018.
 */
public class InjectSpring {

    public static ConsultarPersonaController injectPersonaControllerSpring(){
        return new ConsultarPersonaControllerImpl(new PersonaDaoImpl());
    }

}
