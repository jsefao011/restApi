package com.liquid.restApi.dominio.interactor.logica.base;

import com.liquid.restApi.datos.dao.contrato.base.BaseDao;
import com.liquid.restApi.dominio.interactor.contrato.base.DeleteBaseInteractor;

/**
 * Created by Jse on 03/06/2018.
 */
public class DeleteBaseInteractorImpl<T> implements DeleteBaseInteractor<T> {
    private BaseDao<T> baseDao;

    public DeleteBaseInteractorImpl(BaseDao<T> baseDao) {
        this.baseDao = baseDao;
    }

    @Override
    public void execute(Request<T> request, Response response) {
        try {
            baseDao.delete(request.get());
            response.setSuccess(true);
        }catch (Exception e){
            response.setSuccess(false);
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

    public static class ResponseImpl implements Response{
        private boolean success;

        @Override
        public void setSuccess(boolean success) {
            this.success = success;
        }

        @Override
        public boolean isSuccess() {
            return success;
        }

    }
}
