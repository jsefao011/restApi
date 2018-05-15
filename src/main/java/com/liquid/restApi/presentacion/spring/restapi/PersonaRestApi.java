package com.liquid.restApi.presentacion.spring.restapi;

import com.liquid.restApi.datos.model.Persona;
import com.liquid.restApi.presentacion.controller.PersonaController;
import com.liquid.restApi.presentacion.spring.util.Inject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Jse on 12/05/2018.
 */
@Controller
public class PersonaRestApi{
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private PersonaController personaController;
    @GetMapping("/perosona")
    @ResponseBody
    public Persona getPersona(@RequestParam(name="id", required=false, defaultValue="0") String id) {
        personaController = Inject.injectPersonaController();
        return personaController.getPersona(id);
    }

}
