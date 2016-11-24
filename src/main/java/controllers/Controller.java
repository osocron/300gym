package controllers;

import model.entitidades.Entidad;
import model.repositorios.*;

import java.util.ArrayList;

/**
 * Clase abstracta que obliga a que los Controladores tengan a su
 * disposicion un Repositorio y un Validador.
 *
 * @param <E> Este tipo de dato debe ser subclase de Entidad
 * @param <I> Este es el tipo de dato de la llave primaria de la Entidad.
 *            Nota importante: Este tipo de dato no puede ser un primitivo.
 *            Es decir, en lugar de poner un int, pongan un Integer, en lugar
 *            de un double, pongan un Double.
 */
public abstract class Controller<E extends Entidad, I> {

    private Repositorio<E, I> repositorio;
    private Validador<E> validador;

    public Controller(Repositorio<E, I> repositorio, Validador<E> validador) {
        this.repositorio = repositorio;
        this.validador = validador;
    }


    protected Repositorio<E, I> getRepositorio() {
        return repositorio;
    }


    protected Validador<E> getValidador() {
        return validador;
    }

}
