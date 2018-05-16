package com.liquid.restApi.dominio.iterador.contrato;

import com.liquid.restApi.datos.model.Persona;
import com.liquid.restApi.dominio.cleanArquitectura.Request;
import com.liquid.restApi.dominio.cleanArquitectura.Response;
import com.liquid.restApi.dominio.cleanArquitectura.UseCase;

public interface PersonaUseCase extends UseCase<PersonaUseCase.PersonaRequest, PersonaUseCase.PersonaResponse> {

    interface PersonaRequest extends Request {
        String getPersonaId();
    }

    interface PersonaResponse extends Response{
        void setPersona(Persona persona);
        Persona getPersona();
    }

}
