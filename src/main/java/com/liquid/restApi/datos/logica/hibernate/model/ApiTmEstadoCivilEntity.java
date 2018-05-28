package com.liquid.restApi.datos.logica.hibernate.model;

import javax.persistence.*;

/**
 * Created by Jse on 28/05/2018.
 */
@Entity
@Table(name = "api_tm_estado_civil", schema = "api_tabla_maestras")
public class ApiTmEstadoCivilEntity {
    private int pEstadoCivil;
    private String nomEstadoCivil;
    private String esEstadoCivil;

    @Id
    @Column(name = "p_estado_civil")
    public int getpEstadoCivil() {
        return pEstadoCivil;
    }

    public void setpEstadoCivil(int pEstadoCivil) {
        this.pEstadoCivil = pEstadoCivil;
    }

    @Basic
    @Column(name = "nom_estado_civil")
    public String getNomEstadoCivil() {
        return nomEstadoCivil;
    }

    public void setNomEstadoCivil(String nomEstadoCivil) {
        this.nomEstadoCivil = nomEstadoCivil;
    }

    @Basic
    @Column(name = "es_estado_civil")
    public String getEsEstadoCivil() {
        return esEstadoCivil;
    }

    public void setEsEstadoCivil(String esEstadoCivil) {
        this.esEstadoCivil = esEstadoCivil;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApiTmEstadoCivilEntity that = (ApiTmEstadoCivilEntity) o;

        if (pEstadoCivil != that.pEstadoCivil) return false;
        if (nomEstadoCivil != null ? !nomEstadoCivil.equals(that.nomEstadoCivil) : that.nomEstadoCivil != null)
            return false;
        if (esEstadoCivil != null ? !esEstadoCivil.equals(that.esEstadoCivil) : that.esEstadoCivil != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pEstadoCivil;
        result = 31 * result + (nomEstadoCivil != null ? nomEstadoCivil.hashCode() : 0);
        result = 31 * result + (esEstadoCivil != null ? esEstadoCivil.hashCode() : 0);
        return result;
    }
}
