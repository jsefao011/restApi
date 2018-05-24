package com.liquid.restApi.datos.dao.hibernate;

import com.liquid.restApi.datos.contrato.PersonaDao;
import com.liquid.restApi.datos.dao.hibernate.base.HibernateBaseImpl;
import com.liquid.restApi.datos.dao.hibernate.model.PersonaImpl;
import com.liquid.restApi.datos.dao.hibernate.util.HibernateUtil5;
import com.liquid.restApi.datos.contrato.model.Persona;

import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class PersonaDaoImpl  implements PersonaDao {


    @Override
    public List<Persona> all() {

        List<Persona> personalist = new ArrayList<>();
        /*personalist.add(new PersonaImpl("0","Sin definir"));
        try {
            // Getting Session Object From SessionFactory
            sessionObj = HibernateUtil5.getSessionFactory().openSession();
            // Getting Transaction Object From Session Object
            sessionObj.beginTransaction();

            personalist = sessionObj.createQuery("FROM PersonaImpl").list();
        } catch(Exception sqlException) {
            if(null != sessionObj.getTransaction()) {
                sessionObj.getTransaction().rollback();
            }
            sqlException.printStackTrace();
        } finally {
            if(sessionObj != null) {
                sessionObj.close();
            }
        }*/
        return personalist;
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
