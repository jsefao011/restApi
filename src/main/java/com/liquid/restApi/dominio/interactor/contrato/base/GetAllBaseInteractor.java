package com.liquid.restApi.dominio.interactor.contrato.base;

import com.liquid.restApi.dominio.cleanArquitectura.BaseRequest;
import com.liquid.restApi.dominio.cleanArquitectura.BaseResponse;
import com.liquid.restApi.dominio.cleanArquitectura.UseCase;

import java.util.List;

public interface GetAllBaseInteractor<T> extends UseCase<GetAllBaseInteractor.Request, GetAllBaseInteractor.Response<T>> {

     interface Request extends BaseRequest {
    }

     interface Response<T> extends BaseResponse {
        void set(List<T> items);
        List<T> get();
    }


}
