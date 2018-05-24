package com.liquid.restApi.datos.dao.hibernate.model;

import com.liquid.restApi.datos.contrato.model.Persona;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Jse on 13/05/2018.
 */
@Entity
@Table(name = "person")
public class PersonaImpl implements Persona {
    @Id
    @Column(name="id")
    private String id;
    @Column(name="name")
    private String nombre;

    public PersonaImpl() {
    }

    public PersonaImpl(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String getId() {
        return String.valueOf(id);
    }
    @Override
    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
