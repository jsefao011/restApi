package com.liquid.restApi.datos.logica.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Jse on 28/05/2018.
 */
public class ApiRelPersonaDiscapacidadEntityPK implements Serializable {
    private int pTmDiscapacidad;
    private int pTmPersona;

    @Column(name = "p_tm_discapacidad")
    @Id
    public int getpTmDiscapacidad() {
        return pTmDiscapacidad;
    }

    public void setpTmDiscapacidad(int pTmDiscapacidad) {
        this.pTmDiscapacidad = pTmDiscapacidad;
    }

    @Column(name = "p_tm_persona")
    @Id
    public int getpTmPersona() {
        return pTmPersona;
    }

    public void setpTmPersona(int pTmPersona) {
        this.pTmPersona = pTmPersona;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApiRelPersonaDiscapacidadEntityPK that = (ApiRelPersonaDiscapacidadEntityPK) o;

        if (pTmDiscapacidad != that.pTmDiscapacidad) return false;
        if (pTmPersona != that.pTmPersona) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pTmDiscapacidad;
        result = 31 * result + pTmPersona;
        return result;
    }
}
