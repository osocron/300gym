package controllers;

import model.entitidades.Entidad;

/**
 * Created by osocron on 23/11/16.
 */
public interface Validador<E extends Entidad> {

    Boolean validarEntidad(E e);

}
