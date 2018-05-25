package com.liquid.restApi.dominio.iterador.logica;

import com.liquid.restApi.datos.contrato.dao.PersonaDao;
import com.liquid.restApi.datos.contrato.model.Persona;
import com.liquid.restApi.dominio.iterador.contrato.PersonaUseCase;

public class PersonaUseCaseImpl implements PersonaUseCase {
    private PersonaDao personaDao;

    public PersonaUseCaseImpl(PersonaDao personaDao) {
        this.personaDao = personaDao;
    }

    @Override
    public void execute(PersonaRequest request, PersonaResponse response) {
        Persona persona = personaDao.get(request.getPersonaId());
        response.setPersona(persona);
    }


    class PersonaResponceImpl implements PersonaResponse{
        Persona persona;

        public PersonaResponceImpl() {
        }

        @Override
        public void setPersona(Persona persona) {
            this.persona = persona;
        }

        @Override
        public Persona getPersona() {
            return persona;
        }
    }

}
