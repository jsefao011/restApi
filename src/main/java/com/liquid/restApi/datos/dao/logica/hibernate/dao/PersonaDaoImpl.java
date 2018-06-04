package com.liquid.restApi.datos.dao.logica.hibernate.dao;

import com.liquid.restApi.datos.dao.contrato.PersonaDao;
import com.liquid.restApi.datos.dao.logica.hibernate.dao.base.HibernateBaseImpl;
import com.liquid.restApi.datos.model.Persona;
import org.hibernate.SessionFactory;

public class PersonaDaoImpl extends HibernateBaseImpl<Persona>  implements PersonaDao {


    public PersonaDaoImpl(SessionFactory sessionFactry) {
        super(sessionFactry,Persona.class);
    }

}
