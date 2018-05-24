package com.liquid.restApi.datos.contrato.model;

import java.util.List;

/**
 * Created by Jse on 12/05/2018.
 */
public interface Greeting {

    long getId();

    String getContentJse();

    List<Greeting> getGreetingList();
}
