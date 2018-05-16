package com.liquid.restApi.dominio.iterador.cleanArquitectura;


@FunctionalInterface
public interface UseCase<I extends Request, O extends Response> {

  /**
   * Executes a business use case. Request and response object should be given
   * @param request a request for use case
   * @param response a response for use case
   */
  void execute(I request, O response);

}

