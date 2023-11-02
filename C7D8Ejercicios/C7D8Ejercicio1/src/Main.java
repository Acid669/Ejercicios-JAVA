import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        //habilitar la entrada de datos por teclado
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Cargar el driver(Biblioteca) de mySql

        System.out.println("*********************");
        System.out.println("-Clase MySql cargada-");
        System.out.println("*********************\n");

        //Establecer conexion con la BBDD
        String url = "jdbc:mysql://localhost/universidad";
        Connection c = DriverManager.getConnection(url, "root", "");

        System.out.println("*****************");
        System.out.println("-BBDD conectada!-");
        System.out.println("*****************\n");

        //ArrayList de clase estudiantes
        List<Estudiantes> estudiantes = new ArrayList<>();



        //Ingresar datos al arrayList
        boolean bandera = true;

        while (bandera) {

            System.out.println("Introduzca nombre del estudiante");
            String nombre = scanner.next();
            System.out.println("Introduzca edad del estudiante");
            int edad = scanner.nextInt();
            System.out.println("Introduzca calificación del estudiante");
            double calificacion = scanner.nextDouble();
            estudiantes.add(new Estudiantes(nombre, edad, calificacion));
            System.out.println("Quiere seguir introduciendo datos? 1 - SI, 0 - NO ");
            int control = scanner.nextInt();

            if (control == 0) {
                bandera = false;
            }
        }

        //SQL para insertar registros en la BBDD
        String insertarSQL = "INSERT INTO estudiantes (nombre, edad, calificacion) VALUES(?,?,?)";

        //Declarar el statement
        PreparedStatement st = c.prepareStatement(insertarSQL);

        //Recorrer un el arrayList
        for (Estudiantes listaEstudiantes : estudiantes) {
            st.setString(1, listaEstudiantes.getNombre());
            st.setInt(2, listaEstudiantes.getEdad());
            st.setDouble(3, listaEstudiantes.getCalificacion());
            st.execute();
        }

        //Dar un aviso de que se cargo
        System.out.println("Se datos cargados correctamente.");

        //Consultar datos ingresados
        String consultaSQL = "SELECT * FROM estudiantes";
        Statement st2 = c.createStatement();
        ResultSet rs = st2.executeQuery(consultaSQL);

        System.out.println("**********************");
        System.out.println("-Lista de estudiantes-");
        System.out.println("**********************\n");


        //Recorrer el ResultSet
        while (rs.next()){
            System.out.println("Estudiante con ID: " + rs.getInt("id") + " Nombre: " + rs.getString("nombre") + " Edad: " + rs.getInt("edad") + " Calificación: " + rs.getDouble("calificacion") );
        }
    }
}