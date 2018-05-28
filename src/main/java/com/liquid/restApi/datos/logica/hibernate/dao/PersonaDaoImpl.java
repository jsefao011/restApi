package com.liquid.restApi.datos.logica.hibernate.dao;

import com.liquid.restApi.datos.contrato.dao.PersonaDao;
import com.liquid.restApi.datos.logica.hibernate.dao.base.HibernateBaseImpl;
import com.liquid.restApi.datos.logica.hibernate.model.PersonaImpl;
import com.liquid.restApi.datos.contrato.model.Persona;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class PersonaDaoImpl extends HibernateBaseImpl<Persona>  implements PersonaDao {


    public PersonaDaoImpl(SessionFactory sessionFactry) {
        super(sessionFactry);
    }

    @Override
    protected String getTableClass() {
        return PersonaImpl.class.getSimpleName();
    }


}
