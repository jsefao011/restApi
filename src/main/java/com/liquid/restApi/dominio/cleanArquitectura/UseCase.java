package com.liquid.restApi.dominio.cleanArquitectura;


@FunctionalInterface
public interface UseCase<I extends BaseRequest, O extends BaseResponse> {

  /**
   * Executes a business use case. Request and response object should be given
   * @param request a request for use case
   * @param response a response for use case
   */
  void execute(I request, O response);

}

