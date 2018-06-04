package com.liquid.restApi.datos.dao.logica.hibernate.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public abstract class HibernateUtil5 {

    private SessionFactory sessionFactory;

    public HibernateUtil5() {
        this.sessionFactory = buildSessionFactory();
    }

    //"hibernate.cfg.xml"
    public SessionFactory buildSessionFactory() {
        try {
            StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                    .configure(getResourceName()).build();
            Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
            return metadata.getSessionFactoryBuilder().build();

        } catch (HibernateException he) {
            System.out.println("Session Factory creation failure");
            throw he;
        }
    }

    protected   SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    protected abstract String getResourceName();

}

