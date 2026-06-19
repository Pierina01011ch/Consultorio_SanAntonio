package modelo;

public class Medico {
    private int idMedico;
    private String nombre;
    private String apellido;
    private String cmp;
    private String especialidad;
    private String telefono;
    private String horario;
    private boolean activo;

    public Medico() {
    }

    public Medico(int idMedico, String nombre, String apellido, String cmp, String especialidad, String telefono, String horario, boolean activo) {
        this.idMedico = idMedico;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cmp = cmp;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.horario = horario;
        this.activo = activo;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCmp() {
        return cmp;
    }

    public void setCmp(String cmp) {
        this.cmp = cmp;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
