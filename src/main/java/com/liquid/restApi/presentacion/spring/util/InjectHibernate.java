package com.liquid.restApi.presentacion.spring.util;

import com.liquid.restApi.datos.dao.hibernate.PersonaDaoImpl;
import com.liquid.restApi.presentacion.controller.PersonaController;
import com.liquid.restApi.presentacion.controller.PersonaControllerImpl;

/**
 * Created by Jse on 13/05/2018.
 */
public class InjectHibernate {
    public static PersonaController injectPersonaControllerHibernate(){
        return new PersonaControllerImpl(new PersonaDaoImpl());
    }

}
