package com.liquid.restApi.dominio.interactor.contrato.base;

import com.liquid.restApi.datos.model.Persona;
import com.liquid.restApi.dominio.cleanArquitectura.BaseRequest;
import com.liquid.restApi.dominio.cleanArquitectura.BaseResponse;
import com.liquid.restApi.dominio.cleanArquitectura.UseCase;

public interface SaveBaseInteractor<T> extends UseCase<SaveBaseInteractor.Request<T>, SaveBaseInteractor.Response<T>> {

     interface Request<T> extends BaseRequest {
        T get();
    }

     interface Response<T> extends BaseResponse {
        void set(T item);
        T get();
    }


}
