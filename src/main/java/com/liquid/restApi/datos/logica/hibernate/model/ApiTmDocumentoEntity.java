package com.liquid.restApi.datos.logica.hibernate.model;

import com.liquid.restApi.datos.contrato.model.Documento;

import java.util.Objects;

import javax.persistence.*;

/**
 * Created by Jse on 28/05/2018.
 */
@Entity
@Table(name = "api_tm_documento", schema = "api_tabla_maestras")
public class ApiTmDocumentoEntity implements Documento {
    private int id;
    private String dni;
    private String carnetExtranjeria;
    private String ruc;
    private String pasaporte;
    private String partidaNacimiento;
    private String otroDocumetno;

    @Id
    @Column(name = "tm_documento")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "dni_documento")
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Basic
    @Column(name = "cne_documento")
    public String getCarnetExtranjeria() {
        return carnetExtranjeria;
    }


    public void setCarnetExtranjeria(String carnetExtranjeria) {
        this.carnetExtranjeria = carnetExtranjeria;
    }

    @Basic
    @Column(name = "ruc_documento")
    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    @Basic
    @Column(name = "pst_documento")
    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    @Basic
    @Column(name = "ptn_documento")
    public String getPartidaNacimiento() {
        return partidaNacimiento;
    }

    public void setPartidaNacimiento(String partidaNacimiento) {
        this.partidaNacimiento = partidaNacimiento;
    }

    @Basic
    @Column(name = "ot_documento")
    public String getOtroDocumetno() {
        return otroDocumetno;
    }

    public void setOtroDocumetno(String otroDocumetno) {
        this.otroDocumetno = otroDocumetno;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApiTmDocumentoEntity that = (ApiTmDocumentoEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }
}
