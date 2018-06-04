package com.liquid.restApi.dominio.interactor.contrato.base;

import com.liquid.restApi.dominio.cleanArquitectura.BaseRequest;
import com.liquid.restApi.dominio.cleanArquitectura.BaseResponse;
import com.liquid.restApi.dominio.cleanArquitectura.UseCase;

public interface DeleteBaseInteractor<T> extends UseCase<DeleteBaseInteractor.Request<T>, DeleteBaseInteractor.Response> {

     interface Request<T> extends BaseRequest {
        T get();
    }

     interface Response extends BaseResponse {
         void setSuccess(boolean success);
        boolean isSuccess();
    }


}
