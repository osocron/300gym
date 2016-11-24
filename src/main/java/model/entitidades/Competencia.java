package model.entitidades;

import java.sql.Date;

/**
 * Las entidades deben tener la misma estructura que la tabla de la
 * base de datos a la que hacen referencia y deben ser iguales a los
 * que definieron en su diagrama de Clases.
 *
 * Nota importante. Los unicos metodos que deben existir en esta Clase
 * son los getters y setters de los atributos.
 *
 * Nota importante. Los tipos de datos no deben ser primitivos, es decir,
 * en lugar de usar int usen Integer, en lugar de double usen Double.
 *
 * Tip: despues de definir los atributos pueden presionar Alt+Insert y
 * aparece la opcion de generar automaticamente el Constructor y los
 * getters y setters para que no se cansen escribiendo todos los metodos ;)
 */
public class Competencia extends Entidad {

    private Integer idCompetencia;
    private String nombreCompetencia;
    private Date fechaInicioCompetencia;
    private Date fechaFinCompetencia;
    private String nombreSedeCompetencia;
    private String direccionSedeCompetencia;
    private Double costoInscripcionCompetencia;

    public Competencia(Integer idCompetencia,
                       String nombreCompetencia,
                       Date fechaInicioCompetencia,
                       Date fechaFinCompetencia,
                       String nombreSedeCompetencia,
                       String direccionSedeCompetencia,
                       Double costoInscripcionCompetencia) {
        this.idCompetencia = idCompetencia;
        this.nombreCompetencia = nombreCompetencia;
        this.fechaInicioCompetencia = fechaInicioCompetencia;
        this.fechaFinCompetencia = fechaFinCompetencia;
        this.nombreSedeCompetencia = nombreSedeCompetencia;
        this.direccionSedeCompetencia = direccionSedeCompetencia;
        this.costoInscripcionCompetencia = costoInscripcionCompetencia;
    }

    public Integer getIdCompetencia() {
        return idCompetencia;
    }

    public void setIdCompetencia(Integer idCompetencia) {
        this.idCompetencia = idCompetencia;
    }

    public String getNombreCompetencia() {
        return nombreCompetencia;
    }

    public void setNombreCompetencia(String nombreCompetencia) {
        this.nombreCompetencia = nombreCompetencia;
    }

    public Date getFechaInicioCompetencia() {
        return fechaInicioCompetencia;
    }

    public void setFechaInicioCompetencia(Date fechaInicioCompetencia) {
        this.fechaInicioCompetencia = fechaInicioCompetencia;
    }

    public Date getFechaFinCompetencia() {
        return fechaFinCompetencia;
    }

    public void setFechaFinCompetencia(Date fechaFinCompetencia) {
        this.fechaFinCompetencia = fechaFinCompetencia;
    }

    public String getNombreSedeCompetencia() {
        return nombreSedeCompetencia;
    }

    public void setNombreSedeCompetencia(String nombreSedeCompetencia) {
        this.nombreSedeCompetencia = nombreSedeCompetencia;
    }

    public String getDireccionSedeCompetencia() {
        return direccionSedeCompetencia;
    }

    public void setDireccionSedeCompetencia(String direccionSedeCompetencia) {
        this.direccionSedeCompetencia = direccionSedeCompetencia;
    }

    public Double getCostoInscripcionCompetencia() {
        return costoInscripcionCompetencia;
    }

    public void setCostoInscripcionCompetencia(Double costoInscripcionCompetencia) {
        this.costoInscripcionCompetencia = costoInscripcionCompetencia;
    }

}
