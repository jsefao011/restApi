package com.liquid.restApi.dominio.iterador.contrato;

import com.liquid.restApi.datos.contrato.model.Persona;
import com.liquid.restApi.dominio.cleanArquitectura.Request;
import com.liquid.restApi.dominio.cleanArquitectura.Response;
import com.liquid.restApi.dominio.cleanArquitectura.UseCase;

import java.util.List;

public interface PersonaIterador extends UseCase<PersonaIterador.PersonaRequest, PersonaIterador.PersonaResponse> {

     interface PersonaRequest extends Request {
        String getParametro();
    }

     interface PersonaResponse extends Response{
        void setPersonas(List<Persona> personas);
        List<Persona> getPersonas();
    }


}
