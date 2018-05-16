package com.liquid.restApi.dominio.iterador;

import com.liquid.restApi.dominio.iterador.cleanArquitectura.Request;
import com.liquid.restApi.dominio.iterador.cleanArquitectura.Response;
import com.liquid.restApi.dominio.iterador.cleanArquitectura.UseCase;

public interface PersonaIterador extends UseCase<Request, Response> {

    class PersonaIteradorRequest implements Request{

    }

    class PersonaIteradorResponse implements Response{
    }
}
