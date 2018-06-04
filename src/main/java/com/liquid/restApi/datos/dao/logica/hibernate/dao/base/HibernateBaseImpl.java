package com.liquid.restApi.datos.dao.logica.hibernate.dao.base;

import com.liquid.restApi.datos.dao.contrato.base.BaseDao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class HibernateBaseImpl<T> implements BaseDao<T> {

    private SessionFactory sessionFactory;

    protected Class<T> tClass;

    public HibernateBaseImpl(SessionFactory sessionFactory, Class<T> tClass) {
        this.sessionFactory = sessionFactory;
        this.tClass = tClass;
        if (sessionFactory == null)
            throw new RuntimeException("Session factory is null!!!");
    }

    @Override
    public List<T> all() {

        List<T> item = new ArrayList<>();
        Session sessionObj = sessionFactory.openSession();
        try {
            // Getting Session Object From SessionFactory
            // Getting Transaction Object From Session Object
            sessionObj.beginTransaction();
            item = sessionObj.createQuery("FROM " + tClass.getSimpleName(),tClass).list();
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
    public T get(int id) {
        Session sessionObj = sessionFactory.openSession();
        T obj = null;
        try {
            sessionObj.beginTransaction();
            obj = sessionObj.get(tClass,id);
            sessionObj.getTransaction().commit();
        } catch (HibernateException e) {
            if (sessionObj != null) {
                sessionObj.getTransaction().rollback();
            }
            obj = null;
            throw new HibernateException(e);
        } finally {
            if (sessionObj != null) {
                sessionObj.close();
            }
        }
        return obj;
    }

    @Override
    public T save(T tabla){
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(tabla);
        session.getTransaction().commit();
        return tabla;
    }

    @Override
    public void update(T tabla) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(tabla);
        session.getTransaction().commit();
    }

    @Override
    public void delete(T tabla) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.delete(tabla);
        session.getTransaction().commit();
    }


}
