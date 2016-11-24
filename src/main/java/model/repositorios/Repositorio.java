package model.repositorios;

import model.entitidades.Entidad;

import java.util.ArrayList;


/**
 * Este es un contrato que cada repositorio debe implementar, esto
 * con la finalidad de que el codigo sea uniforme y pueda ser reutilizado.
 *
 * Si encuentran metodos que consideren son utiles y generales para todas
 * las clases del proyecto pueden agregarlos aqui, solo asegurense de avisarle
 * a los demas companeros para que podamos actualizar los cambios e implementar
 * los metodos.
 *
 * @param <E> Este tipo de dato debe ser subclase de Entidad
 * @param <I> Este es el tipo de dato de la llave primaria de la Entidad.
 *            Nota importante: Este tipo de dato no puede ser un primitivo.
 *            Es decir, en lugar de poner un int, pongan un Integer, en lugar
 *            de un double, pongan un Double.
 */
public interface Repositorio<E extends Entidad, I> {

    /**
     * Este metodo obtiene una Entidad por su llave primaria
     *
     * @param id La llave primaria de la Entidad en la base de datos
     * @return   Un objeto Entidad
     */
    E getById(I id) throws Exception;

    /**
     * Este metodo regresa todas las Entidades de la base de datos
     */
    ArrayList<E> getAll() throws Exception;

    /**
     * Inserta una Entidad en la base de datos
     *
     * @param e El objeto de tipo Entidad a ser insertado
     * @return  El mismo objeto o un error.
     */
    E insert(E e) throws Exception;

    /**
     * Modifica una Entidad en la base de datos
     *
     * @param e  La Entidad con los atributos modificados
     * @return   La misma Entidad
     */
    E update(E e) throws Exception;

    /**
     * Elimina una Entidad de la base de datos
     *
     * @param id La llave primaria de la Entidad
     */
    void delete(I id) throws Exception;


    /**
     * Busca en la base de datos para saber si la llave primaria
     * existe o no en la base de datos, para no duplicarlas.
     *
     * @param id           La llave primaria que se buscara en la BD
     * @return             true si existe, false si no se encontro, lo cual
     *                     significa que esta disponible para ser usada.
     * @throws Exception   Envia una excepcion si hubo algun problema.
     */
    boolean idExiste(I id) throws Exception;

}
