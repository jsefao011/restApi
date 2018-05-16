package com.liquid.restApi.presentacion.spring.restapi;

import com.liquid.restApi.datos.model.Persona;
import com.liquid.restApi.presentacion.controller.PersonaController;
import com.liquid.restApi.presentacion.spring.util.InjectHibernate;
import com.liquid.restApi.presentacion.spring.util.InjectSpring;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Jse on 12/05/2018.
 */
@Controller
public class PersonaRestApi{
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private PersonaController personaController;
    @GetMapping("/persona")
    @ResponseBody
    public List<Persona> getPersona(@RequestParam(name="id", required=false, defaultValue="0") String id) {
        List<Persona> personas = new ArrayList<>();
        personaController = InjectSpring.injectPersonaControllerSpring();
        personas.add(personaController.getPersona(id));
        personaController = InjectHibernate.injectPersonaControllerHibernate();
        personas.add(personaController.getPersona(id));
        return personas;
    }



}
