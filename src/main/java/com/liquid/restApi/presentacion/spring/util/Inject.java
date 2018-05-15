package com.liquid.restApi.presentacion.spring.util;

import com.liquid.restApi.presentacion.controller.PersonaController;
import com.liquid.restApi.presentacion.controller.PersonaControllerImpl;

/**
 * Created by Jse on 13/05/2018.
 */
public class Inject {
    public static PersonaController injectPersonaController(){
        return new PersonaControllerImpl();
    }
}
