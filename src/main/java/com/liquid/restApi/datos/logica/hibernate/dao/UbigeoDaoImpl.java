package com.liquid.restApi.datos.logica.hibernate.dao;

import com.liquid.restApi.datos.contrato.model.Greeting;
import com.liquid.restApi.datos.logica.hibernate.dao.base.HibernateBaseImpl;
import com.liquid.restApi.datos.logica.hibernate.model.GreetingImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 * Created by Jse on 24/05/2018.
 */
public class UbigeoDaoImpl extends HibernateBaseImpl<Greeting> implements com.liquid.restApi.datos.contrato.dao.UbigeoDaoImpl {


    public UbigeoDaoImpl(SessionFactory sessionFactry) {
        super(sessionFactry);
    }

    @Override
    protected String getTableClass() {
        return GreetingImpl.class.getSimpleName();
    }
}
