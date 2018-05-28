package com.liquid.restApi.datos.logica.hibernate.model;

import javax.persistence.*;

/**
 * Created by Jse on 28/05/2018.
 */
@Entity
@Table(name = "api_tm_discapacidad", schema = "api_tabla_maestras")
public class ApiTmDiscapacidadEntity {
    private int pTmDiscapacidad;
    private String noDiscapacidad;
    private String esDiscapacidad;

    @Id
    @Column(name = "p_tm_discapacidad")
    public int getpTmDiscapacidad() {
        return pTmDiscapacidad;
    }

    public void setpTmDiscapacidad(int pTmDiscapacidad) {
        this.pTmDiscapacidad = pTmDiscapacidad;
    }

    @Basic
    @Column(name = "no_discapacidad")
    public String getNoDiscapacidad() {
        return noDiscapacidad;
    }

    public void setNoDiscapacidad(String noDiscapacidad) {
        this.noDiscapacidad = noDiscapacidad;
    }

    @Basic
    @Column(name = "es_discapacidad")
    public String getEsDiscapacidad() {
        return esDiscapacidad;
    }

    public void setEsDiscapacidad(String esDiscapacidad) {
        this.esDiscapacidad = esDiscapacidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApiTmDiscapacidadEntity that = (ApiTmDiscapacidadEntity) o;

        if (pTmDiscapacidad != that.pTmDiscapacidad) return false;
        if (noDiscapacidad != null ? !noDiscapacidad.equals(that.noDiscapacidad) : that.noDiscapacidad != null)
            return false;
        if (esDiscapacidad != null ? !esDiscapacidad.equals(that.esDiscapacidad) : that.esDiscapacidad != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pTmDiscapacidad;
        result = 31 * result + (noDiscapacidad != null ? noDiscapacidad.hashCode() : 0);
        result = 31 * result + (esDiscapacidad != null ? esDiscapacidad.hashCode() : 0);
        return result;
    }
}
