package com.liquid.restApi.dominio.interactor.logica.base;

import com.liquid.restApi.datos.dao.contrato.base.BaseDao;
import com.liquid.restApi.dominio.interactor.contrato.base.GetBaseInteractor;

public class GetBaseInteractorImpl<T> implements GetBaseInteractor<T> {

    private BaseDao<T> baseDao;

    public GetBaseInteractorImpl(BaseDao<T> baseDao) {
        this.baseDao = baseDao;
    }

    @Override
    public void execute(Request request, Response<T> response) {
        T item = baseDao.get(request.getId());
        response.set(item);
    }

    public static class RequestImpl implements Request{
       private int id;

        public RequestImpl(int id) {
            this.id = id;
        }

        @Override
        public int getId() {
            return id;
        }
    }

    public static class ResponseImpl<T> implements Response<T>{
        private T item;

        @Override
        public void set(T item) {
            this.item = item;
        }

        @Override
        public T getPersona() {
            return item;
        }
    }

}
