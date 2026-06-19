package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL =
            "jdbc:mysql://localhost:3306/consultorio_san_antonio";

    private static final String USUARIO = "root";
    private static final String PASSWORD = "12345";

    private Connection conexion;

    public Connection conectar() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            System.out.println("Conexión exitosa a MySQL");

        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el Driver: " + e.getMessage());

        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }

        return conexion;
    }

    public void cerrarConexion() {

        try {

            if (conexion != null && !conexion.isClosed()) {

                conexion.close();

                System.out.println("Conexión cerrada correctamente");
            }

        } catch (SQLException e) {
            System.out.println("Error al cerrar conexión: " + e.getMessage());
        }
    }
}
