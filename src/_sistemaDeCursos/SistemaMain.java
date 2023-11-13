package _sistemaDeCursos;

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
                               "\n7 - Salir");
            elección = sc.nextByte();

            switch (elección) {
                case 1 -> {
                    System.out.println("TODO: registrarAlumno");
                }
                case 2 ->{
                    System.out.println("TODO: registrarProfesor");
                }
                case 3 -> {
                    salir = true;
                }
            }
        }
    }
}
