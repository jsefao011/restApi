package com.liquid.restApi.datos.logica.hibernate.model;

import com.liquid.restApi.datos.contrato.model.Persona;

import java.util.Objects;

import javax.persistence.*;

/**
 * Created by Jse on 28/05/2018.
 */
@Entity
@Table(name = "api_tm_persona", schema = "api_tabla_maestras")
public class PersonaImpl implements Persona{
    private int id;
    private String nombre;
    private String apMaterno;
    private String apPaterno;
    private String direccion;
    private String telefono;
    private SexoImpl sexo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonaImpl that = (PersonaImpl) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    @Id
    @Column(name = "p_tm_persona")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "no_persona")
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Basic
    @Column(name = "ap_mat_persona")
    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    @Basic
    @Column(name = "ap_pat_persona")
    public String getApPaterno() {
        return apPaterno;
    }

    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    @Basic
    @Column(name = "di_persona")
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Basic
    @Column(name = "tlf_persona")
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @ManyToOne
    @JoinColumn(name = "f_tm_sexo", referencedColumnName = "p_sexo", nullable = false)
    public SexoImpl getSexo() {
        return sexo;
    }

    public void setSexo(SexoImpl sexo) {
        this.sexo = sexo;
    }


}
