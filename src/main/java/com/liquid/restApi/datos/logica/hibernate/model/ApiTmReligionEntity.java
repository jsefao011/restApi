package com.liquid.restApi.datos.logica.hibernate.model;

import javax.persistence.*;

/**
 * Created by Jse on 28/05/2018.
 */
@Entity
@Table(name = "api_tm_religion", schema = "api_tabla_maestras")
public class ApiTmReligionEntity {
    private int pTmReligion;
    private String nomReligion;
    private String esReligion;

    @Id
    @Column(name = "p_tm_religion")
    public int getpTmReligion() {
        return pTmReligion;
    }

    public void setpTmReligion(int pTmReligion) {
        this.pTmReligion = pTmReligion;
    }

    @Basic
    @Column(name = "nom_religion")
    public String getNomReligion() {
        return nomReligion;
    }

    public void setNomReligion(String nomReligion) {
        this.nomReligion = nomReligion;
    }

    @Basic
    @Column(name = "es_religion")
    public String getEsReligion() {
        return esReligion;
    }

    public void setEsReligion(String esReligion) {
        this.esReligion = esReligion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApiTmReligionEntity that = (ApiTmReligionEntity) o;

        if (pTmReligion != that.pTmReligion) return false;
        if (nomReligion != null ? !nomReligion.equals(that.nomReligion) : that.nomReligion != null) return false;
        if (esReligion != null ? !esReligion.equals(that.esReligion) : that.esReligion != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pTmReligion;
        result = 31 * result + (nomReligion != null ? nomReligion.hashCode() : 0);
        result = 31 * result + (esReligion != null ? esReligion.hashCode() : 0);
        return result;
    }
}
