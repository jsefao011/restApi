package com.liquid.restApi.datos.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Jse on 28/05/2018.
 */
@Entity
@Table(name = "api_tm_provincia", schema = "api_tabla_maestras")
public class Provincia implements Serializable {
    private int id;
    private String nombre;
    private String estado;
    private Departamento departamento;

    @Id
    @GenericGenerator(name="kaugen" , strategy="increment")
    @GeneratedValue(generator="kaugen")
    @Column(name = "p_tm_provincia")
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "no_provincia")
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "es_provincia")
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @ManyToOne
    @JoinColumn(name = "f_tm_departamento", referencedColumnName = "p_tm_departamento", nullable = false)
    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Provincia that = (Provincia) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
