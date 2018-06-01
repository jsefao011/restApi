package com.liquid.restApi.datos.contrato.model;

/**
 * Created by Jse on 27/05/2018.
 */
public interface Documento {

    int getId();

   void setId(int id);

    String getDni();

    void setDni(String dni);

    String getCarnetExtranjeria();

    void setCarnetExtranjeria(String carnetExtranjeria);

    String getRuc();

    void setRuc(String ruc);

    String getPasaporte();

    void setPasaporte(String pasaporte);

    String getPartidaNacimiento();

    void setPartidaNacimiento(String partidaNacimiento);

    String getOtroDocumetno();

    void setOtroDocumetno(String otroDocumetno);
}
