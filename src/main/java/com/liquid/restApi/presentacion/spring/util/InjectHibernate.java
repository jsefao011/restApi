package com.liquid.restApi.presentacion.spring.util;

import com.liquid.restApi.datos.dao.logica.hibernate.dao.PersonaDaoImpl;
import com.liquid.restApi.datos.dao.logica.hibernate.dao.base.HibernateBaseImpl;
import com.liquid.restApi.datos.model.*;
import com.liquid.restApi.dominio.interactor.logica.base.*;
import com.liquid.restApi.presentacion.controller.contrato.ConsultarPersonaController;
import com.liquid.restApi.presentacion.controller.contrato.base.ConsultarBaseController;
import com.liquid.restApi.presentacion.controller.logica.ConsultarPersonaControllerImpl;
import com.liquid.restApi.presentacion.controller.logica.base.ConsultarBaseControllerImpl;
import org.hibernate.SessionFactory;

/**
 * Created by Jse on 13/05/2018.
 */
public class InjectHibernate {
    public static ConsultarPersonaController injectPersonaControllerHibernate(){
        SessionFactory factory = new Hibernate().buildSessionFactory();
        return new ConsultarPersonaControllerImpl(
                new GetBaseInteractorImpl<>(new PersonaDaoImpl(factory)),
                new SaveBaseInteractorImpl<>(new PersonaDaoImpl(factory)),
                new UpdateBaseInteractorImpl<>(new PersonaDaoImpl(factory)),
                new DeleteBaseInteractorImpl<>(new PersonaDaoImpl(factory)),
                new GetAllBaseInteractorImpl<>(new PersonaDaoImpl(factory)));
    }

    public static ConsultarBaseController<Sexo> injectSexoControllerHibernate(){
        SessionFactory factory = new Hibernate().buildSessionFactory();
        return new ConsultarBaseControllerImpl<>(
                new GetBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,Sexo.class)),
                new SaveBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,Sexo.class)),
                new UpdateBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,Sexo.class)),
                new DeleteBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,Sexo.class)),
                new GetAllBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,Sexo.class)));
    }

    public static ConsultarBaseController<Religion> injectReligionControllerHibernate(){
        SessionFactory factory = new Hibernate().buildSessionFactory();
        return new ConsultarBaseControllerImpl<>(
                new GetBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,Religion.class)),
                new SaveBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,Religion.class)),
                new UpdateBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,Religion.class)),
                new DeleteBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,Religion.class)),
                new GetAllBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,Religion.class)));
    }

    public static ConsultarBaseController<Provincia> injectProvinciaControllerHibernate(){
        SessionFactory factory = new Hibernate().buildSessionFactory();
        return new ConsultarBaseControllerImpl<>(
                new GetBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,Provincia.class)),
                new SaveBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,Provincia.class)),
                new UpdateBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,Provincia.class)),
                new DeleteBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,Provincia.class)),
                new GetAllBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,Provincia.class)));
    }

    public static ConsultarBaseController<NivelAcademico> injectNivelAcademicoControllerHibernate(){
        SessionFactory factory = new Hibernate().buildSessionFactory();
        return new ConsultarBaseControllerImpl<>(
                new GetBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,NivelAcademico.class)),
                new SaveBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,NivelAcademico.class)),
                new UpdateBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,NivelAcademico.class)),
                new DeleteBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,NivelAcademico.class)),
                new GetAllBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,NivelAcademico.class)));
    }

    public static ConsultarBaseController<EstadoCivil> injectEstadoCivilControllerHibernate(){
        SessionFactory factory = new Hibernate().buildSessionFactory();
        return new ConsultarBaseControllerImpl<>(
                new GetBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,EstadoCivil.class)),
                new SaveBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,EstadoCivil.class)),
                new UpdateBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,EstadoCivil.class)),
                new DeleteBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,EstadoCivil.class)),
                new GetAllBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,EstadoCivil.class)));
    }

    public static ConsultarBaseController<Distrito> injectDistritoControllerHibernate(){
        SessionFactory factory = new Hibernate().buildSessionFactory();
        return new ConsultarBaseControllerImpl<>(
                new GetBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,Distrito.class)),
                new SaveBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,Distrito.class)),
                new UpdateBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,Distrito.class)),
                new DeleteBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,Distrito.class)),
                new GetAllBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,Distrito.class)));
    }

    public static ConsultarBaseController<Departamento> injectDepartamentoControllerHibernate(){
        SessionFactory factory = new Hibernate().buildSessionFactory();
        return new ConsultarBaseControllerImpl<>(
                new GetBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,Departamento.class)),
                new SaveBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,Departamento.class)),
                new UpdateBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,Departamento.class)),
                new DeleteBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,Departamento.class)),
                new GetAllBaseInteractorImpl<>(new HibernateBaseImpl<>(factory,Departamento.class)));
    }
}
