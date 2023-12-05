package _sistemaDeCursos;

import gestion.Usuarios.Alumno;
import gestion.Usuarios.Profesor;
import gestion.cursos.Curso;
import gestion.cursos.GestorCursos;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class SistemaMain {
    public static void main(String[] args) {


        //Creacion de Profesor
        Profesor docenteejemplo = new Profesor.ProfeBuilder("Maria", "Gomez", "87654321","Experiencia en Java")
                .fechaNacimiento(new Date())
                .edad(30)
                .build();

        //Creacion de un curso presencial
        Curso cursoPresencialEjemplo = new Curso.Builder()
                .setNombre("Programación en Java")
                .setCatedra(UUID.randomUUID().toString())
                .setDescripcion("Introducción a la programación en Java")
                .setObjetivo("Aprender los fundamentos de Java")
                .setDirigidoA("Estudiantes de informática")
                .setProfesor(docenteejemplo)
                .setListadoAlumnos(new ArrayList<>(14))
                .setCosto(150.0)
                .build();

        //Temgo que instanciar el gestor de cursos, no lo puedo poner static
        GestorCursos gestor = new GestorCursos();
        gestor.registrarCursoPresencial(cursoPresencialEjemplo);

        //Creacion de un alumno
        Alumno alumno = new Alumno.AlumnoBuilder("Juan", "Perez", "12345678")
                .fechaNacimiento(new Date())
                .edad(20)
                .legajo()
                .build();
    }
}
