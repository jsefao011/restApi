package com.liquid.restApi.datos.logica.hibernate.dao.base;

import com.liquid.restApi.datos.contrato.dao.base.BaseDao;
import com.liquid.restApi.datos.logica.hibernate.util.HibernateUtil5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class HibernateBaseImpl<T> implements BaseDao<T> {

    private String tClass = getTableClass();
    private SessionFactory sessionFactry;

    protected abstract String getTableClass();

    public HibernateBaseImpl(SessionFactory sessionFactry) {
        this.sessionFactry = sessionFactry;
    }

    @Override
    public List<T> all() {

        List<T> item = new ArrayList<>();
        Session sessionObj = sessionFactry.openSession();
        try {
            // Getting Session Object From SessionFactory
            sessionObj = sessionFactry.openSession();
            // Getting Transaction Object From Session Object
            sessionObj.beginTransaction();

            item = sessionObj.createQuery("FROM " + tClass).list();
        } catch(Exception sqlException) {
            if(null != sessionObj.getTransaction()) {
                sessionObj.getTransaction().rollback();
            }
            sqlException.printStackTrace();
        } finally {
            if(sessionObj != null) {
                sessionObj.close();
            }
        }
        return item;
    }

    @Override
    public T get(String id) {
           /*PersonaImpl person = new PersonaImpl();
            person.setId("125");
            person.setNombre("Jose Arias Orezano");
            Session session = HibernateUtil5.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(person);
            session.getTransaction().commit();
            session.close();
            System.out.println("Done");*/

        return null;
    }

    @Override
    public String add(T tabla) {
        return null;
    }

    @Override
    public boolean update(String id, T tabla) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }
}
