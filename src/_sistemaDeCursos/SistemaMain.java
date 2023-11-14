package _sistemaDeCursos;

import gestionDeAlumnos.cursos.Curso;
import java.util.Scanner;

public class SistemaMain {
    public static void main(String[] args) {
        boolean salir = false;
        byte elección = 0;
        Scanner sc =  new Scanner(System.in);

        while (!salir) {

            System.out.println("\n=====================================" +
                               "\n          CP Group S.A.S" +
                               "\n=====================================" +
                               "\nPor Favor ingrese una opción:" +
                               "\n1 - Registrar Alumno" +
                               "\n2 - Modificar Alumno" +
                               "\n3 - Listar Alumnos" +
                               "\n4 - Registrar Profesor" +
                               "\n5 - Modificar Profesor" +
                               "\n6 - Listar Profesores" +
                               "\n7 - Crear Curso" +
                               "\n8 - Listar Curso" +
                               "\n9 - Salir");
            elección = sc.nextByte();

            switch (elección) {
                case 1 -> {
                    System.out.println("TODO: registrarAlumno");
                }
                case 2 ->{
                    System.out.println("TODO: registrarProfesor");
                }
                case 7 -> {
                    // Esto esta horrible pero es para testear el builder de los cursos :)
                    System.out.println("Ingrese nombre del curso nuevo:");
                    sc.nextLine();
                    String tempNombre = sc.nextLine();
                    System.out.println("Ingrese catedra del curso nuevo:");
                    String tempCatedra = sc.nextLine();
                    System.out.println("Ingrese una descripción al curso nuevo:");
                    String tempDescripcion = sc.nextLine();
                    System.out.println("Ingrese un profesor al curso nuevo:"); //TODO llamar FactoryProfesor
                    String tempProfesor = sc.nextLine();
                    System.out.println("Ingrese un costo al curso nuevo:");
                    double tempCosto = sc.nextDouble();
                    System.out.println("El curso nuevo es online? true/false:");
                    boolean tempIsOnline = sc.nextBoolean();


                    /* TODO llamar FactoryAlumno
                    System.out.println("Ingrese una lista de alumnos");
                    List tempListaAlumnos = new ArrayList<>();
                    */

                    Curso curso = new Curso.Builder()
                            .setNombre(tempNombre)
                            .setCatedra(tempCatedra)
                            .setDescripcion(tempDescripcion)
                            .setProfesor(tempProfesor)
                            .setCosto(tempCosto)
                            .setOnline(tempIsOnline).build();

                    System.out.println("Se creo un nuevo curso:\n" + curso.toString());

                }
                case 9 -> {
                    salir = true;
                }
            }
        }
    }
}
