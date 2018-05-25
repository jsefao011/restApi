package com.liquid.restApi.datos.logica.hibernate.dao.base;

import com.liquid.restApi.datos.contrato.dao.base.BaseDao;
import com.liquid.restApi.datos.contrato.model.Persona;
import com.liquid.restApi.datos.logica.hibernate.util.HibernateUtil5;

import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public abstract class HibernateBaseImpl<T> implements BaseDao<T> {

    protected Session sessionObj;
    private String tClass = getTableClass();

    protected abstract String getTableClass();


    @Override
    public List<T> all() {

        List<T> item = new ArrayList<>();
        try {
            // Getting Session Object From SessionFactory
            sessionObj = HibernateUtil5.getSessionFactory().openSession();
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
    public Persona get(String id) {
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
