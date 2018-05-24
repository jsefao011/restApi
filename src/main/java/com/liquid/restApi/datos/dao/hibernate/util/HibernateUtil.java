package com.liquid.restApi.datos.dao.hibernate.util;


public interface HibernateUtil<S> {
    S buildSessionFactory();
    S getSessionFactory();
}
