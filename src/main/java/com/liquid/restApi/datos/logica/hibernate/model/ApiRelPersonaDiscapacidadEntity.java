package com.liquid.restApi.datos.logica.hibernate.model;

import javax.persistence.*;

/**
 * Created by Jse on 28/05/2018.
 */
@Entity
@Table(name = "api_rel_persona_discapacidad", schema = "api_tabla_maestras")
@IdClass(ApiRelPersonaDiscapacidadEntityPK.class)
public class ApiRelPersonaDiscapacidadEntity {
    private int pTmDiscapacidad;
    private int pTmPersona;
    private String deDiscapacidad;

    @Id
    @Column(name = "p_tm_discapacidad")
    public int getpTmDiscapacidad() {
        return pTmDiscapacidad;
    }

    public void setpTmDiscapacidad(int pTmDiscapacidad) {
        this.pTmDiscapacidad = pTmDiscapacidad;
    }

    @Id
    @Column(name = "p_tm_persona")
    public int getpTmPersona() {
        return pTmPersona;
    }

    public void setpTmPersona(int pTmPersona) {
        this.pTmPersona = pTmPersona;
    }

    @Basic
    @Column(name = "de_discapacidad")
    public String getDeDiscapacidad() {
        return deDiscapacidad;
    }

    public void setDeDiscapacidad(String deDiscapacidad) {
        this.deDiscapacidad = deDiscapacidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApiRelPersonaDiscapacidadEntity that = (ApiRelPersonaDiscapacidadEntity) o;

        if (pTmDiscapacidad != that.pTmDiscapacidad) return false;
        if (pTmPersona != that.pTmPersona) return false;
        if (deDiscapacidad != null ? !deDiscapacidad.equals(that.deDiscapacidad) : that.deDiscapacidad != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pTmDiscapacidad;
        result = 31 * result + pTmPersona;
        result = 31 * result + (deDiscapacidad != null ? deDiscapacidad.hashCode() : 0);
        return result;
    }
}
