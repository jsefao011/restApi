package com.liquid.restApi.presentacion.spring.util;

import com.liquid.restApi.datos.logica.hibernate.util.HibernateUtil5;

/**
 * Created by Jse on 26/05/2018.
 */
public class Hibernate extends HibernateUtil5{

    @Override
    protected String getResourceName() {
        return "hibernate.cfg.xml";
    }
}
