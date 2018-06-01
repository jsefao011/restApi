package com.liquid.restApi.datos.contrato.model;

import java.util.List;

/**
 * Created by Jse on 13/05/2018.
 */
public interface Persona {
   
    int getId() ;

    void setId(int id);

    String getNombre();

    void setNombre(String nombre);

    String getApMaterno();

    void setApMaterno(String apellidoPaterno);

    String getApPaterno();

    void setApPaterno(String apellidoMaterno);

    String getTelefono();

    void setTelefono(String telefono);

    String getDireccion();

    void setDireccion(String direccion);

    /*Sexo getSexo();

    void setSexo(Sexo sexo);

    Distrito getDistrito();

    void setDistrito(Distrito distrito);

    Religion getReligion();

    void setReligion(Religion religion);

    Documento getDocumento();

    void setDocumento(Documento documento);

    List<Discapacidad> getDiscapacidades();

    void setDiscapacidades(List<Discapacidad> discapacidades);

    NivelAcademico getNivelAcademico();

    void setNivelAcademico(NivelAcademico nivelAcademico);

    EstadoCivil getEstadoCivil();

    void setEstadoCivil(EstadoCivil estadoCivil);

    Discapacidad getDiscapacidad();

    void setDiscapacidad(Discapacidad discapacidad);*/
}
