package com.liquid.restApi.datos.logica.hibernate.model;

import javax.persistence.*;

/**
 * Created by Jse on 28/05/2018.
 */
@Entity
@Table(name = "api_tm_nivel_academico", schema = "api_tabla_maestras")
public class ApiTmNivelAcademicoEntity {
    private int pTmNivelAcademico;
    private String noNivelAcademico;
    private String esNivelAcademico;

    @Id
    @Column(name = "p_tm_nivel_academico")
    public int getpTmNivelAcademico() {
        return pTmNivelAcademico;
    }

    public void setpTmNivelAcademico(int pTmNivelAcademico) {
        this.pTmNivelAcademico = pTmNivelAcademico;
    }

    @Basic
    @Column(name = "no_nivel_academico")
    public String getNoNivelAcademico() {
        return noNivelAcademico;
    }

    public void setNoNivelAcademico(String noNivelAcademico) {
        this.noNivelAcademico = noNivelAcademico;
    }

    @Basic
    @Column(name = "es_nivel_academico")
    public String getEsNivelAcademico() {
        return esNivelAcademico;
    }

    public void setEsNivelAcademico(String esNivelAcademico) {
        this.esNivelAcademico = esNivelAcademico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApiTmNivelAcademicoEntity that = (ApiTmNivelAcademicoEntity) o;

        if (pTmNivelAcademico != that.pTmNivelAcademico) return false;
        if (noNivelAcademico != null ? !noNivelAcademico.equals(that.noNivelAcademico) : that.noNivelAcademico != null)
            return false;
        if (esNivelAcademico != null ? !esNivelAcademico.equals(that.esNivelAcademico) : that.esNivelAcademico != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pTmNivelAcademico;
        result = 31 * result + (noNivelAcademico != null ? noNivelAcademico.hashCode() : 0);
        result = 31 * result + (esNivelAcademico != null ? esNivelAcademico.hashCode() : 0);
        return result;
    }
}
