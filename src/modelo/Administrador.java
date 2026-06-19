package modelo;

public class Administrador extends Usuario {

    public Administrador() {
    }

    public Administrador(int idUsuario, String nombreUsuario, String contraseña, String rol, boolean estado) {
        super(idUsuario, nombreUsuario, contraseña, rol, estado);
    }
    public void GenerarReporte(){
        System.out.println("Generando reporte...");
    }
    
    @Override
    public void mostrarRol() {
    System.out.println("Administrador del sistema");
    }
}
