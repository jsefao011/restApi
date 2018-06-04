package com.liquid.restApi.dominio.interactor.logica.base;

import com.liquid.restApi.datos.dao.contrato.base.BaseDao;
import com.liquid.restApi.dominio.interactor.contrato.base.GetAllBaseInteractor;

import java.util.List;

/**
 * Created by Jse on 03/06/2018.
 */
public class GetAllBaseInteractorImpl<T> implements GetAllBaseInteractor<T> {
    private BaseDao<T> baseDao;

    public GetAllBaseInteractorImpl(BaseDao<T> baseDao) {
        this.baseDao = baseDao;
    }

    @Override
    public void execute(Request request, Response<T> response) {
        try {
            List<T> item = baseDao.all();
            response.set(item);
        }catch (Exception e){
            response.set(null);
        }

    }

    public static class RequestImpl implements Request{
    }

    public static class ResponseImpl<T> implements Response<T>{
        private List<T> items;
        @Override
        public void set(List<T> items) {
            this.items = items;
        }

        @Override
        public List<T> get() {
            return items;
        }
    }
}
