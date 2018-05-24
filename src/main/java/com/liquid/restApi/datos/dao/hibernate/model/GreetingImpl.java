package com.liquid.restApi.datos.dao.hibernate.model;

import com.liquid.restApi.datos.contrato.model.Greeting;

import java.util.List;

/**
 * Created by Jse on 12/05/2018.
 */
public class GreetingImpl implements Greeting {
    private final long id;
    private final String content;

    public GreetingImpl(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public String getContentJse() {
        return content;
    }

    @Override
    public List<Greeting> getGreetingList() {
        return null;
    }

}
