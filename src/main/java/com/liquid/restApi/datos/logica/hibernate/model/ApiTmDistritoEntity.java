package com.liquid.restApi.datos.logica.hibernate.model;

import javax.persistence.*;

/**
 * Created by Jse on 28/05/2018.
 */
@Entity
@Table(name = "api_tm_distrito", schema = "api_tabla_maestras")
public class ApiTmDistritoEntity {
    private int pTmDistrito;
    private String noDistrito;
    private String esDistrito;

    @Id
    @Column(name = "p_tm_distrito")
    public int getpTmDistrito() {
        return pTmDistrito;
    }

    public void setpTmDistrito(int pTmDistrito) {
        this.pTmDistrito = pTmDistrito;
    }

    @Basic
    @Column(name = "no_distrito")
    public String getNoDistrito() {
        return noDistrito;
    }

    public void setNoDistrito(String noDistrito) {
        this.noDistrito = noDistrito;
    }

    @Basic
    @Column(name = "es_distrito")
    public String getEsDistrito() {
        return esDistrito;
    }

    public void setEsDistrito(String esDistrito) {
        this.esDistrito = esDistrito;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApiTmDistritoEntity that = (ApiTmDistritoEntity) o;

        if (pTmDistrito != that.pTmDistrito) return false;
        if (noDistrito != null ? !noDistrito.equals(that.noDistrito) : that.noDistrito != null) return false;
        if (esDistrito != null ? !esDistrito.equals(that.esDistrito) : that.esDistrito != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pTmDistrito;
        result = 31 * result + (noDistrito != null ? noDistrito.hashCode() : 0);
        result = 31 * result + (esDistrito != null ? esDistrito.hashCode() : 0);
        return result;
    }
}
