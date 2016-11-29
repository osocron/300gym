package model.repositorios;

import model.entitidades.Competencia;
import model.jdbc.ConectorJDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

    private static ConectorJDBC conector = new ConectorJDBC();

    public Competencia getById(Integer id) throws Exception {
        String sql = "SELECT * FROM Competencia WHERE id_Competencia = " + id;
        try {
            Connection con = conector.connectToMysqlDB("trescientos_gym", "gym", "gym", "localhost");
            ResultSet res = conector.getResultSet(con, sql);
            if (res.next()) {
                return new Competencia(
                        res.getInt("id_Competencia"),
                        res.getString("Nombre_competencia"),
                        res.getDate("fecha_Inicio_Competencia"),
                        res.getDate("fecha_Fin_Competencia"),
                        res.getString("nombre_sede_competencia"),
                        res.getString("direccion_Sede"),
                        res.getFloat("costo_Inscripcion_competencia")
                );
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            conector.cerrarConexion();
        }
    }

    public ArrayList<Competencia> getAll() throws Exception {
        String sql = "SELECT * FROM Competencia";
        try {
            Connection con = conector.connectToMysqlDB("trescientos_gym", "gym", "gym", "localhost");
            ResultSet res = conector.getResultSet(con, sql);
            Competencia curComp;
            ArrayList<Competencia> lista = new ArrayList<>();
            while (res.next()) {
                curComp = new Competencia(
                        res.getInt("id_Competencia"),
                        res.getString("Nombre_competencia"),
                        res.getDate("fecha_Inicio_Competencia"),
                        res.getDate("fecha_Fin_Competencia"),
                        res.getString("nombre_sede_competencia"),
                        res.getString("direccion_Sede"),
                        res.getFloat("costo_Inscripcion_competencia")
                );
                lista.add(curComp);
            }
            return lista;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            conector.cerrarConexion();
        }
    }

    public Competencia insert(Competencia competencia) throws Exception {
        String sql = "INSERT INTO Competencia (" +
                "id_Competencia, Nombre_competencia, " +
                "nombre_sede_competencia, direccion_Sede, " +
                "fecha_Inicio_Competencia, fecha_Fin_Competencia, " +
                "costo_Inscripcion_competencia) Values (?,?,?,?,?,?,?)";
        try {
            Connection con = conector.connectToMysqlDB("trescientos_gym", "gym", "gym", "localhost");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, competencia.getIdCompetencia());
            ps.setString(2, competencia.getNombreCompetencia());
            ps.setString(3, competencia.getNombreSedeCompetencia());
            ps.setString(4, competencia.getDireccionSedeCompetencia());
            ps.setDate(5, competencia.getFechaInicioCompetencia());
            ps.setDate(6, competencia.getFechaFinCompetencia());
            ps.setFloat(7, competencia.getCostoInscripcionCompetencia());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conector.cerrarConexion();
        }
        return competencia;
    }

    public Competencia update(Competencia competencia) throws Exception {
        String sql = "UPDATE Competencia SET " +
                "Nombre_competencia = ?, nombre_sede_competencia = ?, " +
                "direccion_Sede = ?, fecha_Inicio_Competencia = ?, " +
                "fecha_Fin_Competencia = ?, costo_Inscripcion_competencia = ? " +
                "WHERE id_Competencia = ?";
        try {
            Connection con = conector.connectToMysqlDB("trescientos_gym", "gym", "gym", "localhost");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, competencia.getNombreCompetencia());
            ps.setString(2, competencia.getNombreSedeCompetencia());
            ps.setString(3, competencia.getDireccionSedeCompetencia());
            ps.setDate(4, competencia.getFechaInicioCompetencia());
            ps.setDate(5, competencia.getFechaFinCompetencia());
            ps.setFloat(6, competencia.getCostoInscripcionCompetencia());
            ps.setInt(7, competencia.getIdCompetencia());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conector.cerrarConexion();
        }
        return competencia;
    }

    public void delete(Integer id) throws Exception {
        String sql = "DELETE FROM Competencia WHERE id_Competencia = ?";
        try {
            Connection con = conector.connectToMysqlDB("trescientos_gym", "gym", "gym", "localhost");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            conector.cerrarConexion();
        }
    }

    public boolean idExiste(Integer id) throws Exception {
        String sql = "SELECT * FROM Competencia WHERE id_Competencia = " + id;
        try {
            Connection con = conector.connectToMysqlDB("trescientos_gym", "gym", "gym", "localhost");
            ResultSet res = conector.getResultSet(con, sql);
            return res.next();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            conector.cerrarConexion();
        }
    }

    public Integer getLastID() throws Exception {
        String sql = "SELECT id_Competencia FROM Competencia ORDER BY id DESC LIMIT 1";
        try {
            Connection con = conector.connectToMysqlDB("trescientos_gym", "gym", "gym", "localhost");
            ResultSet res = conector.getResultSet(con, sql);
            if (res.next()) {
                return res.getInt("id_Competencia");
            } else {
                return -1;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

}
