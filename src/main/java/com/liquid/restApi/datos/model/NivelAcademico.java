package com.liquid.restApi.datos.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Jse on 28/05/2018.
 */
@Entity
@Table(name = "api_tm_nivel_academico", schema = "api_tabla_maestras")
public class NivelAcademico implements Serializable {
    private int id;
    private String nombre;
    private String estado;

    @Id
    @GenericGenerator(name="kaugen" , strategy="increment")
    @GeneratedValue(generator="kaugen")
    @Column(name = "p_tm_nivel_academico")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Basic
    @Column(name = "no_nivel_academico")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Basic
    @Column(name = "es_nivel_academico")
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NivelAcademico that = (NivelAcademico) o;

        return id == that.id;
    }

    public int hashCode() {
        return id;
    }
}
