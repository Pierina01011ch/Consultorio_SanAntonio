package main;
//Proyecto Consultorio Médico San Antonio
import conexion.ConexionBD;

public class Main {
    public static void main(String[] args) {
        ConexionBD conexion = new ConexionBD();
        conexion.conectar();
         
    }
}
