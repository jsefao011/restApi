package com.liquid.restApi.datos.dao.hibernate;

import com.liquid.restApi.datos.contrato.PersonaDao;
import com.liquid.restApi.datos.dao.hibernate.base.HibernateBaseImpl;
import com.liquid.restApi.datos.dao.hibernate.model.PersonaImpl;
import com.liquid.restApi.datos.dao.hibernate.util.HibernateUtil5;
import com.liquid.restApi.datos.contrato.model.Persona;

import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class PersonaDaoImpl extends HibernateBaseImpl<Persona>  implements PersonaDao {


    @Override
    protected String getTableClass() {
        return PersonaImpl.class.getSimpleName();
    }

    @Override
    public Persona get(String id) {
            /*PersonaImpl person = new PersonaImpl();
            person.setId("125");
            person.setNombre("Jose Arias Orezano");
            Session session = HibernateUtil5.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(person);
            session.getTransaction().commit();
            session.close();
            System.out.println("Done");*/

        return new PersonaImpl("1","PersonaHibernate");
    }

    @Override
    public String add(Persona tabla) {
        return null;
    }

    @Override
    public boolean update(String id, Persona tabla) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }
}
