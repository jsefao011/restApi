package com.liquid.restApi.datos.logica.hibernate.model;

import javax.persistence.*;

/**
 * Created by Jse on 28/05/2018.
 */
@Entity
@Table(name = "api_tm_provincia", schema = "api_tabla_maestras")
public class ApiTmProvinciaEntity {
    private int pTmProvincia;
    private String noProvincia;
    private String esProvincia;

    @Id
    @Column(name = "p_tm_provincia")
    public int getpTmProvincia() {
        return pTmProvincia;
    }

    public void setpTmProvincia(int pTmProvincia) {
        this.pTmProvincia = pTmProvincia;
    }

    @Basic
    @Column(name = "no_provincia")
    public String getNoProvincia() {
        return noProvincia;
    }

    public void setNoProvincia(String noProvincia) {
        this.noProvincia = noProvincia;
    }

    @Basic
    @Column(name = "es_provincia")
    public String getEsProvincia() {
        return esProvincia;
    }

    public void setEsProvincia(String esProvincia) {
        this.esProvincia = esProvincia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApiTmProvinciaEntity that = (ApiTmProvinciaEntity) o;

        if (pTmProvincia != that.pTmProvincia) return false;
        if (noProvincia != null ? !noProvincia.equals(that.noProvincia) : that.noProvincia != null) return false;
        if (esProvincia != null ? !esProvincia.equals(that.esProvincia) : that.esProvincia != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pTmProvincia;
        result = 31 * result + (noProvincia != null ? noProvincia.hashCode() : 0);
        result = 31 * result + (esProvincia != null ? esProvincia.hashCode() : 0);
        return result;
    }
}
