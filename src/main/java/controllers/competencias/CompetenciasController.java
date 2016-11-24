package controllers.competencias;

import controllers.Controller;
import controllers.Validador;
import model.entitidades.Competencia;
import model.repositorios.Repositorio;

/**
 * Los controladores se encargan de validar que los datos sean correctos antes
 * de mandarlos a la base de datos. Tambien se encargan de manejar navegacion entre
 * vistas y de manejar los posibles errores.
 */
public class CompetenciasController extends Controller<Competencia, Integer> {


    public CompetenciasController(Repositorio<Competencia, Integer> repositorio,
                                  Validador<Competencia> validador) {
        super(repositorio, validador);
    }

    /**
     * Ejemplo de metodo que encuentra una Competencia por su Id
     *
     * @param id La llave primaria de la Competencia
     * @return   La competencia encontrada en la base de datos
     */
    public Competencia getById(Integer id) {
        try {
            return getRepositorio().getById(id);
        } catch (Exception e) {
            //Hacer algo con el error
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Ejemplo juguete de metodo que guarda una Competencia en la
     * base de datos
     *
     * @param c La Entidad competencia que va a ser guardada
     * @return  La competencia o null si no se pudo guardar.
     */
    public Competencia registrarCompetencia(Competencia c) {
        if (getValidador().validarEntidad(c)) {
            try {
                return getRepositorio().insert(c);
            } catch (Exception e) {
                //Hacer algo con el error
                e.printStackTrace();
                return null;
            }
        }
        else {
            //Hacer algo si la validacion falla
            return null;
        }
    }

}
