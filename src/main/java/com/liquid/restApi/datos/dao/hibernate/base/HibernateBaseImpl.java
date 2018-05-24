package com.liquid.restApi.datos.dao.hibernate.base;

import com.liquid.restApi.datos.contrato.base.BaseDao;
import com.liquid.restApi.datos.contrato.model.Persona;

import org.hibernate.Session;

import java.util.List;

public class HibernateBaseImpl<T> implements BaseDao<T> {

    protected Session sessionObj;

    @Override
    public List<T> all() {
        return null;
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
