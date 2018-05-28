package com.liquid.restApi.dominio.iterador.logica;

import com.liquid.restApi.datos.contrato.dao.PersonaDao;
import com.liquid.restApi.datos.contrato.model.Persona;
import com.liquid.restApi.dominio.cleanArquitectura.Request;
import com.liquid.restApi.dominio.iterador.contrato.PersonaIterador;

import java.util.List;

public class PersonaIteradorImpl implements PersonaIterador {
    private PersonaDao personaDao;

    public PersonaIteradorImpl(PersonaDao personaDao) {
        this.personaDao = personaDao;
    }

    @Override
    public void execute(PersonaRequest request, PersonaResponse response) {
        List<Persona> persona = personaDao.all();
        response.setPersonas(persona);
    }


    public static class PersonaRequestImpl implements PersonaRequest{
       private String parametro;

        public PersonaRequestImpl(String parametros) {
            this.parametro = parametros;
        }

        @Override
        public String getParametro() {
            return parametro;
        }
    }

    public static class PersonaResponceImpl implements PersonaResponse{
        List<Persona> personas;

        public PersonaResponceImpl() {
        }

        @Override
        public void setPersonas(List<Persona> personas) {
            this.personas = personas;
        }

        @Override
        public List<Persona> getPersonas() {
            return personas;
        }
    }

}
