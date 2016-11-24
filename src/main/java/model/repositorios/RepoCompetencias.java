package model.repositorios;

import model.entitidades.Competencia;
import model.jdbc.ConectorJDBC;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * Ejemplo juguete de un Repositorio para la tabla competencias
 * de la Base de Datos.
 *
 * La clase debe implementar los metodos definidos en la Interfaz Repositorio.
 * Ademas, es en este lugar donde se crean metodos adicionales para manejar los
 * datos de la tabla en la BD.
 *
 */
public class RepoCompetencias implements Repositorio<Competencia,Integer> {

    public Competencia getById(Integer id) throws Exception {
        //Implementar con tu codigo
        return null;
    }

    public ArrayList<Competencia> getAll() throws Exception {
        //Implementar con tu codigo
        return null;
    }

    public Competencia insert(Competencia competencia) throws Exception {
        //Implementar con tu codigo
        return null;
    }

    public Competencia update(Competencia competencia) throws Exception {
        //Implementar con tu codigo
        return null;
    }

    public void delete(Integer id) throws Exception {
        //Implementar con tu codigo
    }

    public boolean idExiste(Integer id) throws Exception {
        //Implementar con tu codigo
        return false;
    }

    /**
     * Ejemplo juguete de un metodo adicional a los establecidos por la Interfaz Repositorio.
     * Tambien demuestra que es las clases de Repositorios donde se escriben las sentencias
     * SQL y se manipulan los datos que regresan.
     */
    public java.sql.Date getFechaCompetencia(Integer id) throws Exception {
        //Ejemplo de metodo adicional a los establecidos por la
        //Interfaz Repositorio
        Date fecha = null;
        ConectorJDBC conector = new ConectorJDBC();
        try {
            Connection con = conector.connectToMysqlDB("gym300", "admin", "123456", "localhost");
            ResultSet res = conector.getResultSet(con, "SELECT fecha FROM compatencias WHERE idCompetencia="+id);
            res.next();
            fecha = res.getDate("fecha");
            conector.cerrarConexion();
        } catch (Exception e) {
            throw new Error(e.getMessage());
        }
        return fecha;
    }

}
