package com.liquid.restApi.datos.logica.hibernate.model;

import com.liquid.restApi.datos.contrato.model.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

/**
 * Created by Jse on 13/05/2018.
 */
@Entity
@Table(name = "person")
public class PersonaImpl implements Persona {
    @Id
    @Column(name="id")
    private String id;
    @Column(name="name")
    private String nombre;

    public PersonaImpl() {
    }

    public PersonaImpl(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String getId() {
        return String.valueOf(id);
    }
    @Override
    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellidoPaterno() {
        return null;
    }

    @Override
    public void setApellidoPaterno(String apellidoPaterno) {

    }

    @Override
    public String getApellidoMaterno() {
        return null;
    }

    @Override
    public void setApellidoMaterno(String apellidoMaterno) {

    }

    @Override
    public String getTelefono() {
        return null;
    }

    @Override
    public void setTelefono(String telefono) {

    }

    @Override
    public String getDireccion() {
        return null;
    }

    @Override
    public void setDireccion(String direccion) {

    }

    @Override
    public Sexo getSexo() {
        return null;
    }

    @Override
    public void setSexo(Sexo sexo) {

    }

    @Override
    public Distrito getDistrito() {
        return null;
    }

    @Override
    public void setDistrito(Distrito distrito) {

    }

    @Override
    public Religion getReligion() {
        return null;
    }

    @Override
    public void setReligion(Religion religion) {

    }

    @Override
    public Documento getDocumento() {
        return null;
    }

    @Override
    public void setDocumento(Documento documento) {

    }

    @Override
    public List<Discapacidad> getDiscapacidades() {
        return null;
    }

    @Override
    public void setDiscapacidades(List<Discapacidad> discapacidades) {

    }

    @Override
    public NivelAcademico getNivelAcademico() {
        return null;
    }

    @Override
    public void setNivelAcademico(NivelAcademico nivelAcademico) {

    }

    @Override
    public EstadoCivil getEstadoCivil() {
        return null;
    }

    @Override
    public void setEstadoCivil(EstadoCivil estadoCivil) {

    }

    @Override
    public Discapacidad getDiscapacidad() {
        return null;
    }

    @Override
    public void setDiscapacidad(Discapacidad discapacidad) {

    }
}
