package _sistemaDeCursos;

import gestion.Usuarios.Profesor;
import gestion.cursos.Curso;
import gestion.cursos.GestorCursos;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class SistemaMain {
    public static void main(String[] args) {

        Curso cursoPresencialEjemplo = new Curso.Builder()
                .setNombre("Programación en Java")
                .setCatedra(UUID.randomUUID().toString())
                .setDescripcion("Introducción a la programación en Java")
                .setObjetivo("Aprender los fundamentos de Java")
                .setDirigidoA("Estudiantes de informática")
                .setProfesor(new Profesor("Jorge","Giraudo","43881292", new Date(10), "Soy Un profesor, creanme"))
                .setListadoAlumnos(new ArrayList<>(14))
                .setCosto(150.0)
                .build();

        GestorCursos gestor = new GestorCursos();
        gestor.registrarCursoPresencial(cursoPresencialEjemplo);
    }
}
