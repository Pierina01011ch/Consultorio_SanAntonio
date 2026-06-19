package modelo;

import java.util.Date;

public class Consulta {
    private int idConsulta;
    private Cita cita;
    private String diagnostico;
    private String sintomas;
    private String tratamiento;
    private String receta;
    private Date fechaConsulta;

    public Consulta() {
    }

    public Consulta(int idConsulta, Cita cita, String diagnostico, String sintomas, String tratamiento, String receta, Date fechaConsulta) {
        this.idConsulta = idConsulta;
        this.cita = cita;
        this.diagnostico = diagnostico;
        this.sintomas = sintomas;
        this.tratamiento = tratamiento;
        this.receta = receta;
        this.fechaConsulta = fechaConsulta;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public Date getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(Date fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }
    
}
