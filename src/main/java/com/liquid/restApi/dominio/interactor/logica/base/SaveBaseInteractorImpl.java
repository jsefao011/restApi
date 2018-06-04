package com.liquid.restApi.dominio.interactor.logica.base;

import com.liquid.restApi.datos.dao.contrato.base.BaseDao;
import com.liquid.restApi.dominio.interactor.contrato.base.SaveBaseInteractor;

/**
 * Created by Jse on 03/06/2018.
 */
public class SaveBaseInteractorImpl<T> implements SaveBaseInteractor<T> {
    private BaseDao<T> baseDao;

    public SaveBaseInteractorImpl(BaseDao<T> baseDao) {
        this.baseDao = baseDao;
    }

    @Override
    public void execute(Request<T> request, Response<T> response) {
        try {
            T item = baseDao.save(request.get());
            response.set(item);
        }catch (Exception e){
            response.set(null);
        }

    }

    public static class RequestImpl<T> implements Request<T>{
        private T item;

        public RequestImpl(T item) {
            this.item = item;
        }

        @Override
        public T get() {
            return item;
        }
    }

    public static class ResponseImpl<T> implements Response<T>{
        private T item;
        @Override
        public void set(T item) {
            this.item = item;
        }

        @Override
        public T get() {
            return item;
        }
    }
}
