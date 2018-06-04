package com.liquid.restApi.dominio.interactor.contrato.base;

import com.liquid.restApi.datos.model.Persona;
import com.liquid.restApi.dominio.cleanArquitectura.BaseRequest;
import com.liquid.restApi.dominio.cleanArquitectura.BaseResponse;
import com.liquid.restApi.dominio.cleanArquitectura.UseCase;

public interface GetBaseInteractor<T> extends UseCase<GetBaseInteractor.Request, GetBaseInteractor.Response<T>> {

     interface Request extends BaseRequest {
        int getId();
    }

     interface Response<T> extends BaseResponse {
        void set(T item);
        T getPersona();
    }


}
