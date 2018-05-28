package com.liquid.restApi.presentacion.spring.util;

import com.liquid.restApi.datos.logica.hibernate.dao.PersonaDaoImpl;
import com.liquid.restApi.dominio.iterador.logica.PersonaIteradorImpl;
import com.liquid.restApi.presentacion.controller.contrato.ConsultarPersonaController;
import com.liquid.restApi.presentacion.controller.logica.ConsultarPersonaControllerImpl;

/**
 * Created by Jse on 13/05/2018.
 */
public class InjectHibernate {
    public static ConsultarPersonaController injectPersonaControllerHibernate(){
        return new ConsultarPersonaControllerImpl(new PersonaIteradorImpl(new PersonaDaoImpl(new Hibernate().buildSessionFactory())));
    }

}
