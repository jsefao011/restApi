package com.liquid.restApi.datos.model;

import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;
import javax.persistence.*;

/**
 * Created by Jse on 28/05/2018.
 */
@Entity
@Table(name = "api_tm_persona", schema = "api_tabla_maestras")
public class Persona  implements Serializable {
    private int id;
    private String nombre;
    private String apMaterno;
    private String apPaterno;
    private String direccion;
    private String telefono;
    private Timestamp fechaNacimieto;
    private String dniDocumento;
    private String cneDocumento;
    private String rucDocumento;
    private String pstDocumento;
    private String ptnDocumento;
    private String otDocumento;
    private Sexo sexo;
    private Distrito distrito;
    private Religion religion;
    private EstadoCivil estadoCivil;
    private NivelAcademico nivelAcademico;

    public Persona() {
    }

    public Persona(Sexo sexo, Distrito distrito, Religion religion, EstadoCivil estadoCivil, NivelAcademico nivelAcademico) {
        this.sexo = sexo;
        this.distrito = distrito;
        this.religion = religion;
        this.estadoCivil = estadoCivil;
        this.nivelAcademico = nivelAcademico;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona that = (Persona) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Id
    @GenericGenerator(name="kaugen" , strategy="increment")
    @GeneratedValue(generator="kaugen")
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

    @Basic
    @Column(name = "fe_nacimiento_persona")
    public Timestamp getFechaNacimieto() {
        return fechaNacimieto;
    }

    public void setFechaNacimieto(Timestamp fechaNacimieto) {
        this.fechaNacimieto = fechaNacimieto;
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

    @ManyToOne
    @JoinColumn(name = "f_tm_sexo", referencedColumnName = "p_sexo", nullable = false)
    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @ManyToOne
    @JoinColumn(name = "f_tm_distrito", referencedColumnName = "p_tm_distrito")
    public Distrito getDistrito() {
        return distrito;
    }

    public void setDistrito(Distrito distrito) {
        this.distrito = distrito;
    }

    @ManyToOne
    @JoinColumn(name = "f_tm_religion", referencedColumnName = "p_tm_religion")
    public Religion getReligion() {
        return religion;
    }

    public void setReligion(Religion religion) {
        this.religion = religion;
    }

    @ManyToOne
    @JoinColumn(name = "f_tm_estado_civil", referencedColumnName = "p_estado_civil")
    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @ManyToOne
    @JoinColumn(name = "f_tm_nivel_academico", referencedColumnName = "p_tm_nivel_academico")
    public NivelAcademico getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(NivelAcademico nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }
}
