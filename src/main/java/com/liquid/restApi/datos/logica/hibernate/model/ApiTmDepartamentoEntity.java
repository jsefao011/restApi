package com.liquid.restApi.datos.logica.hibernate.model;

import javax.persistence.*;

/**
 * Created by Jse on 28/05/2018.
 */
@Entity
@Table(name = "api_tm_departamento", schema = "api_tabla_maestras")
public class ApiTmDepartamentoEntity {
    private int pTmDepartamento;
    private String noDepartamento;
    private String esDepartamento;

    @Id
    @Column(name = "p_tm_departamento")
    public int getpTmDepartamento() {
        return pTmDepartamento;
    }

    public void setpTmDepartamento(int pTmDepartamento) {
        this.pTmDepartamento = pTmDepartamento;
    }

    @Basic
    @Column(name = "no_departamento")
    public String getNoDepartamento() {
        return noDepartamento;
    }

    public void setNoDepartamento(String noDepartamento) {
        this.noDepartamento = noDepartamento;
    }

    @Basic
    @Column(name = "es_departamento")
    public String getEsDepartamento() {
        return esDepartamento;
    }

    public void setEsDepartamento(String esDepartamento) {
        this.esDepartamento = esDepartamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApiTmDepartamentoEntity that = (ApiTmDepartamentoEntity) o;

        if (pTmDepartamento != that.pTmDepartamento) return false;
        if (noDepartamento != null ? !noDepartamento.equals(that.noDepartamento) : that.noDepartamento != null)
            return false;
        if (esDepartamento != null ? !esDepartamento.equals(that.esDepartamento) : that.esDepartamento != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pTmDepartamento;
        result = 31 * result + (noDepartamento != null ? noDepartamento.hashCode() : 0);
        result = 31 * result + (esDepartamento != null ? esDepartamento.hashCode() : 0);
        return result;
    }
}
