package main;
//Proyecto Consultorio Médico San Antonio
import conexion.ConexionBD;
import modelo.Usuario;
import modelo.Administrador;

public class Main {
    public static void main(String[] args) {
        ConexionBD conexion = new ConexionBD();
        conexion.conectar();
        
        Usuario usuario = new Administrador();
        usuario.mostrarRol();
    }
}
