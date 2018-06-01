package com.liquid.restApi.datos.logica.hibernate.model;

import com.liquid.restApi.datos.contrato.model.Sexo;

import javax.persistence.*;

/**
 * Created by Jse on 28/05/2018.
 */
@Entity
@Table(name = "api_tm_sexo", schema = "api_tabla_maestras")
public class SexoImpl implements Sexo {
    private int id;
    private String nombre;
    private String estado;

    @Id
    @Column(name = "p_sexo")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nom_sexo")
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "es_sexo")
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
