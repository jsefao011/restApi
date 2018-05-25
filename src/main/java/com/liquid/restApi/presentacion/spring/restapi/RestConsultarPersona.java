package com.liquid.restApi.presentacion.spring.restapi;

import com.liquid.restApi.datos.contrato.model.Persona;
import com.liquid.restApi.presentacion.controller.contrato.ConsultarPersonaController;
import com.liquid.restApi.presentacion.spring.util.InjectHibernate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Jse on 12/05/2018.
 */
@Controller
public class RestConsultarPersona {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    private ConsultarPersonaController personaController;

    public RestConsultarPersona() {
        this.personaController = InjectHibernate.injectPersonaControllerHibernate();
        //this.personaController = InjectSpring.injectPersonaControllerSpring();
    }

    @GetMapping("/persona")
    @ResponseBody
    public List<Persona> getPersona(@RequestParam(name="id", required=false, defaultValue="0") String id) {
        return personaController.likePersona(id);
    }



}
