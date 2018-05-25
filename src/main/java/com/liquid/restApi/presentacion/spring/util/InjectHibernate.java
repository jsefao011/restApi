package com.liquid.restApi.presentacion.spring.util;

import com.liquid.restApi.datos.dao.hibernate.PersonaDaoImpl;
import com.liquid.restApi.presentacion.controller.ConsultarPersonaController;
import com.liquid.restApi.presentacion.controller.ConsultarPersonaControllerImpl;

/**
 * Created by Jse on 13/05/2018.
 */
public class InjectHibernate {
    public static ConsultarPersonaController injectPersonaControllerHibernate(){
        return new ConsultarPersonaControllerImpl(new PersonaDaoImpl());
    }

}
