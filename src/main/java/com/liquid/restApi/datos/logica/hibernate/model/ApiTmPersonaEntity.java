package com.liquid.restApi.datos.logica.hibernate.model;

import javax.persistence.*;

/**
 * Created by Jse on 28/05/2018.
 */
@Entity
@Table(name = "api_tm_persona", schema = "api_tabla_maestras")
public class ApiTmPersonaEntity {
    private int pTmPersona;
    private String noPersona;
    private String apMatPersona;
    private String apPatPersona;
    private String diPersona;
    private String tlfPersona;

    @Id
    @Column(name = "p_tm_persona")
    public int getpTmPersona() {
        return pTmPersona;
    }

    public void setpTmPersona(int pTmPersona) {
        this.pTmPersona = pTmPersona;
    }

    @Basic
    @Column(name = "no_persona")
    public String getNoPersona() {
        return noPersona;
    }

    public void setNoPersona(String noPersona) {
        this.noPersona = noPersona;
    }

    @Basic
    @Column(name = "ap_mat_persona")
    public String getApMatPersona() {
        return apMatPersona;
    }

    public void setApMatPersona(String apMatPersona) {
        this.apMatPersona = apMatPersona;
    }

    @Basic
    @Column(name = "ap_pat_persona")
    public String getApPatPersona() {
        return apPatPersona;
    }

    public void setApPatPersona(String apPatPersona) {
        this.apPatPersona = apPatPersona;
    }

    @Basic
    @Column(name = "di_persona")
    public String getDiPersona() {
        return diPersona;
    }

    public void setDiPersona(String diPersona) {
        this.diPersona = diPersona;
    }

    @Basic
    @Column(name = "tlf_persona")
    public String getTlfPersona() {
        return tlfPersona;
    }

    public void setTlfPersona(String tlfPersona) {
        this.tlfPersona = tlfPersona;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApiTmPersonaEntity that = (ApiTmPersonaEntity) o;

        if (pTmPersona != that.pTmPersona) return false;
        if (noPersona != null ? !noPersona.equals(that.noPersona) : that.noPersona != null) return false;
        if (apMatPersona != null ? !apMatPersona.equals(that.apMatPersona) : that.apMatPersona != null) return false;
        if (apPatPersona != null ? !apPatPersona.equals(that.apPatPersona) : that.apPatPersona != null) return false;
        if (diPersona != null ? !diPersona.equals(that.diPersona) : that.diPersona != null) return false;
        if (tlfPersona != null ? !tlfPersona.equals(that.tlfPersona) : that.tlfPersona != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pTmPersona;
        result = 31 * result + (noPersona != null ? noPersona.hashCode() : 0);
        result = 31 * result + (apMatPersona != null ? apMatPersona.hashCode() : 0);
        result = 31 * result + (apPatPersona != null ? apPatPersona.hashCode() : 0);
        result = 31 * result + (diPersona != null ? diPersona.hashCode() : 0);
        result = 31 * result + (tlfPersona != null ? tlfPersona.hashCode() : 0);
        return result;
    }
}
