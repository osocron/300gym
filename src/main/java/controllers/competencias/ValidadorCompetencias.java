package controllers.competencias;

import controllers.Validador;
import model.entitidades.Competencia;

import java.util.Calendar;

/**
 * Ejemplo juqguete de un validador de Competencias, seguramente deberan escribir
 * mas de un metodo para lograr validar la entrada de datos.
 * Recuerden, validar los datos es la clave para que no existan tantos bugs
 * en la aplicacion. Ademas, es aqui donde la logica importante de la aplicacion
 * reside.
 */
public class ValidadorCompetencias implements Validador<Competencia> {

    /**
     * Ejemplo jugete de validacion de datos. Este metodo solo valida
     * un campo. Ustedes tendran que implemetar un metodo completo probablemente
     * con la ayuda de metodos secundarios.
     *
     * @param competencia La Entidad a ser validada
     * @return            true si paso la validacion o false de lo contrario
     */
    public Boolean validarEntidad(Competencia competencia) {
        //Checa que la fecha de inicio de la competencia sea despues del dia de hoy
        return competencia.getFechaInicioCompetencia().after(Calendar.getInstance().getTime());
    }

}
