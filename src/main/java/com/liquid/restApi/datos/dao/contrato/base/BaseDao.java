package com.liquid.restApi.datos.dao.contrato.base;

import java.util.List;

public interface BaseDao <T> {
    List<T> all();
    T get(int id);
    T save(T tabla);
    void update(T tabla);
    void delete(T tabla);

}
