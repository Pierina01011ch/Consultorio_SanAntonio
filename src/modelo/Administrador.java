package modelo;
//Aplicación de herencia y polimorfismo
public class Administrador extends Usuario {

    public Administrador() {
    }

    public Administrador(int idUsuario, String nombreUsuario, String contrasena, String rol, boolean estado) {
        super(idUsuario, nombreUsuario, contrasena, rol, estado);
    }
    public void GenerarReporte(){
        System.out.println("Generando reporte...");
    }
    
    @Override
    public void mostrarRol() {
    System.out.println("Administrador del sistema");
    }
}
