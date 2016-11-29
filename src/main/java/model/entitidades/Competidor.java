package model.entitidades;


import java.sql.Date;

public class Competidor extends Entidad {

    private Integer idCompetidor;
    private String nombreCompetidor;
    private Date fechaNacimientoCompetidor;
    private String generoCompetidor;
    private Integer telefonoCompetidor;
    private Float pesoCompetidor;
    private Float estaturaCompetidor;
    private String emailCompetidor;

    public Competidor(Integer idCompetidor,
                      String nombreCompetidor,
                      Date fechaNacimientoCompetidor,
                      String generoCompetidor,
                      Integer telefonoCompetidor,
                      Float pesoCompetidor,
                      Float estaturaCompetidor,
                      String emailCompetidor) {
        this.idCompetidor = idCompetidor;
        this.nombreCompetidor = nombreCompetidor;
        this.fechaNacimientoCompetidor = fechaNacimientoCompetidor;
        this.generoCompetidor = generoCompetidor;
        this.telefonoCompetidor = telefonoCompetidor;
        this.pesoCompetidor = pesoCompetidor;
        this.estaturaCompetidor = estaturaCompetidor;
        this.emailCompetidor = emailCompetidor;
    }

    public Integer getIdCompetidor() {
        return idCompetidor;
    }

    public void setIdCompetidor(Integer idCompetidor) {
        this.idCompetidor = idCompetidor;
    }

    public String getNombreCompetidor() {
        return nombreCompetidor;
    }

    public void setNombreCompetidor(String nombreCompetidor) {
        this.nombreCompetidor = nombreCompetidor;
    }

    public Date getFechaNacimientoCompetidor() {
        return fechaNacimientoCompetidor;
    }

    public void setFechaNacimientoCompetidor(Date fechaNacimientoCompetidor) {
        this.fechaNacimientoCompetidor = fechaNacimientoCompetidor;
    }

    public String getGeneroCompetidor() {
        return generoCompetidor;
    }

    public void setGeneroCompetidor(String generoCompetidor) {
        this.generoCompetidor = generoCompetidor;
    }

    public Integer getTelefonoCompetidor() {
        return telefonoCompetidor;
    }

    public void setTelefonoCompetidor(Integer telefonoCompetidor) {
        this.telefonoCompetidor = telefonoCompetidor;
    }

    public Float getPesoCompetidor() {
        return pesoCompetidor;
    }

    public void setPesoCompetidor(Float pesoCompetidor) {
        this.pesoCompetidor = pesoCompetidor;
    }

    public Float getEstaturaCompetidor() {
        return estaturaCompetidor;
    }

    public void setEstaturaCompetidor(Float estaturaCompetidor) {
        this.estaturaCompetidor = estaturaCompetidor;
    }

    public String getEmailCompetidor() {
        return emailCompetidor;
    }

    public void setEmailCompetidor(String emailCompetidor) {
        this.emailCompetidor = emailCompetidor;
    }
}
