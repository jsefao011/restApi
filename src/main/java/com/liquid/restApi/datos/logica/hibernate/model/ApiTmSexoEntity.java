package com.liquid.restApi.datos.logica.hibernate.model;

import javax.persistence.*;

/**
 * Created by Jse on 28/05/2018.
 */
@Entity
@Table(name = "api_tm_sexo", schema = "api_tabla_maestras")
public class ApiTmSexoEntity {
    private int pSexo;
    private String nomSexo;
    private String esSexo;
    private String id;

    @Id
    @Column(name = "p_sexo")
    public int getpSexo() {
        return pSexo;
    }

    public void setpSexo(int pSexo) {
        this.pSexo = pSexo;
    }

    @Basic
    @Column(name = "nom_sexo")
    public String getNomSexo() {
        return nomSexo;
    }

    public void setNomSexo(String nomSexo) {
        this.nomSexo = nomSexo;
    }

    @Basic
    @Column(name = "es_sexo")
    public String getEsSexo() {
        return esSexo;
    }

    public void setEsSexo(String esSexo) {
        this.esSexo = esSexo;
    }

    @Basic
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApiTmSexoEntity that = (ApiTmSexoEntity) o;

        if (pSexo != that.pSexo) return false;
        if (nomSexo != null ? !nomSexo.equals(that.nomSexo) : that.nomSexo != null) return false;
        if (esSexo != null ? !esSexo.equals(that.esSexo) : that.esSexo != null) return false;
        if (id != null ? !id.equals(that.id) : that.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pSexo;
        result = 31 * result + (nomSexo != null ? nomSexo.hashCode() : 0);
        result = 31 * result + (esSexo != null ? esSexo.hashCode() : 0);
        result = 31 * result + (id != null ? id.hashCode() : 0);
        return result;
    }
}
