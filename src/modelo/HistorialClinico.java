package modelo;

import java.util.ArrayList;

public class HistorialClinico {
    private int idHistorial;
    private Paciente paciente;

    private ArrayList<Consulta> consultas;

    public HistorialClinico() {

        consultas = new ArrayList<>();
    }

    public HistorialClinico(int idHistorial,
            Paciente paciente) {

        this.idHistorial = idHistorial;
        this.paciente = paciente;

        consultas = new ArrayList<>();
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void agregarConsulta(Consulta consulta) {

        consultas.add(consulta);

    }
}
