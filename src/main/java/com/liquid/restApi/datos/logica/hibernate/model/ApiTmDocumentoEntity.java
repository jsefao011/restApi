package com.liquid.restApi.datos.logica.hibernate.model;

import javax.persistence.*;

/**
 * Created by Jse on 28/05/2018.
 */
@Entity
@Table(name = "api_tm_documento", schema = "api_tabla_maestras")
public class ApiTmDocumentoEntity {
    private int tmDocumento;
    private String dniDocumento;
    private String cneDocumento;
    private String rucDocumento;
    private String pstDocumento;
    private String ptnDocumento;
    private String otDocumento;

    @Id
    @Column(name = "tm_documento")
    public int getTmDocumento() {
        return tmDocumento;
    }

    public void setTmDocumento(int tmDocumento) {
        this.tmDocumento = tmDocumento;
    }

    @Basic
    @Column(name = "dni_documento")
    public String getDniDocumento() {
        return dniDocumento;
    }

    public void setDniDocumento(String dniDocumento) {
        this.dniDocumento = dniDocumento;
    }

    @Basic
    @Column(name = "cne_documento")
    public String getCneDocumento() {
        return cneDocumento;
    }

    public void setCneDocumento(String cneDocumento) {
        this.cneDocumento = cneDocumento;
    }

    @Basic
    @Column(name = "ruc_documento")
    public String getRucDocumento() {
        return rucDocumento;
    }

    public void setRucDocumento(String rucDocumento) {
        this.rucDocumento = rucDocumento;
    }

    @Basic
    @Column(name = "pst_documento")
    public String getPstDocumento() {
        return pstDocumento;
    }

    public void setPstDocumento(String pstDocumento) {
        this.pstDocumento = pstDocumento;
    }

    @Basic
    @Column(name = "ptn_documento")
    public String getPtnDocumento() {
        return ptnDocumento;
    }

    public void setPtnDocumento(String ptnDocumento) {
        this.ptnDocumento = ptnDocumento;
    }

    @Basic
    @Column(name = "ot_documento")
    public String getOtDocumento() {
        return otDocumento;
    }

    public void setOtDocumento(String otDocumento) {
        this.otDocumento = otDocumento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApiTmDocumentoEntity that = (ApiTmDocumentoEntity) o;

        if (tmDocumento != that.tmDocumento) return false;
        if (dniDocumento != null ? !dniDocumento.equals(that.dniDocumento) : that.dniDocumento != null) return false;
        if (cneDocumento != null ? !cneDocumento.equals(that.cneDocumento) : that.cneDocumento != null) return false;
        if (rucDocumento != null ? !rucDocumento.equals(that.rucDocumento) : that.rucDocumento != null) return false;
        if (pstDocumento != null ? !pstDocumento.equals(that.pstDocumento) : that.pstDocumento != null) return false;
        if (ptnDocumento != null ? !ptnDocumento.equals(that.ptnDocumento) : that.ptnDocumento != null) return false;
        if (otDocumento != null ? !otDocumento.equals(that.otDocumento) : that.otDocumento != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tmDocumento;
        result = 31 * result + (dniDocumento != null ? dniDocumento.hashCode() : 0);
        result = 31 * result + (cneDocumento != null ? cneDocumento.hashCode() : 0);
        result = 31 * result + (rucDocumento != null ? rucDocumento.hashCode() : 0);
        result = 31 * result + (pstDocumento != null ? pstDocumento.hashCode() : 0);
        result = 31 * result + (ptnDocumento != null ? ptnDocumento.hashCode() : 0);
        result = 31 * result + (otDocumento != null ? otDocumento.hashCode() : 0);
        return result;
    }
}
