package com.liquid.restApi.datos.model;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Jse on 28/05/2018.
 */
@Entity
@Table(name = "api_tm_estado_civil", schema = "api_tabla_maestras")
public class EstadoCivil implements Serializable {
    private int id;
    private String nombre;
    private String estado;

    @Id
    @Column(name = "p_estado_civil")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Basic
    @Column(name = "no_estado_civil")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Basic
    @Column(name = "es_estado_civil")
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
