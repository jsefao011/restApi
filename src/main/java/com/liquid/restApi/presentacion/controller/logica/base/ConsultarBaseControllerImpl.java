package com.liquid.restApi.presentacion.controller.logica.base;

import com.liquid.restApi.datos.model.Persona;
import com.liquid.restApi.dominio.interactor.contrato.base.*;
import com.liquid.restApi.dominio.interactor.logica.base.*;
import com.liquid.restApi.presentacion.controller.contrato.base.ConsultarBaseController;

import java.util.List;

/**
 * Created by Jse on 04/06/2018.
 */
public class ConsultarBaseControllerImpl<T> implements ConsultarBaseController<T> {
    private GetBaseInteractor<T> getBaseInteractor;
    private SaveBaseInteractor<T> saveBaseInteractor;
    private UpdateBaseInteractor<T> updateBaseInteractor;
    private DeleteBaseInteractor<T> deleteBaseInteractor;
    private GetAllBaseInteractor<T> getAllBaseInteractor;

    public ConsultarBaseControllerImpl(GetBaseInteractor<T> getBaseInteractor, SaveBaseInteractor<T> saveBaseInteractor, UpdateBaseInteractor<T> updateBaseInteractor, DeleteBaseInteractor<T> deleteBaseInteractor, GetAllBaseInteractor<T> getAllBaseInteractor) {
        this.getBaseInteractor = getBaseInteractor;
        this.saveBaseInteractor = saveBaseInteractor;
        this.updateBaseInteractor = updateBaseInteractor;
        this.deleteBaseInteractor = deleteBaseInteractor;
        this.getAllBaseInteractor = getAllBaseInteractor;
    }

    @Override
    public List<T> allObjeto() {
        GetAllBaseInteractor.Response<T> response = new GetAllBaseInteractorImpl.ResponseImpl<>();
        getAllBaseInteractor.execute(new GetAllBaseInteractorImpl.RequestImpl(), response);
        return response.get();
    }

    @Override
    public T getObjeto(int id) {
        GetBaseInteractor.Response<T> responce = new GetBaseInteractorImpl.ResponseImpl<>();
        getBaseInteractor.execute(new GetBaseInteractorImpl.RequestImpl(id),responce);
        return responce.getPersona();
    }

    @Override
    public T save(T objeto) {
        SaveBaseInteractor.Response<T> response = new SaveBaseInteractorImpl.ResponseImpl<>();
        saveBaseInteractor.execute(new SaveBaseInteractorImpl.RequestImpl<>(objeto), response);
        return response.get();
    }

    @Override
    public boolean updateObjecto(T objeto) {
        UpdateBaseInteractor.Response response = new UpdateBaseInteractorImpl.ResponseImpl();
        updateBaseInteractor.execute(new UpdateBaseInteractorImpl.RequestImpl<>(objeto), response);
        return response.isSuccess();
    }

    @Override
    public boolean deleteObjeto(T objeto) {
        DeleteBaseInteractor.Response response = new DeleteBaseInteractorImpl.ResponseImpl();
        deleteBaseInteractor.execute(new DeleteBaseInteractorImpl.RequestImpl<>(objeto), response);
        return response.isSuccess();
    }
}
