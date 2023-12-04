package gestion.cursos;

import gestion.Usuarios.Alumno;
import gestion.Usuarios.Profesor;

import java.util.ArrayList;
import java.util.List;

public class GestorCursos{
    private List<Curso> cursosPresenciales = new ArrayList<>();
    private List<Curso> cursosVirtuales = new ArrayList<>();


     public void registrarCursoPresencial(Curso nuevoCurso) {

        if (!docenteDisponible(nuevoCurso)) {
            System.out.println("Error: El docente ya tiene asignado otro curso en el mismo horario o día.");
            return;
        }

        if (!alumnoDisponible(nuevoCurso)) {
            System.out.println("Error: El alumno ya está inscrito en otro curso presencial en el mismo horario o día.");
            return;
        }

        if (nuevoCurso.getListadoAlumnos().size() >= 15) {
            cursosPresenciales.add(nuevoCurso);
            System.out.println("Se ha creado un nuevo curso presencial con código de catedra: " + nuevoCurso.getCatedra());
            return;
        }
        cursosPresenciales.add(nuevoCurso);
        System.out.println("Curso presencial registrado con éxito.");
    }

    private boolean docenteDisponible(Curso nuevoCurso) {
        for (Curso c : cursosPresenciales) {
            if (c.getProfesor() != null && c.getProfesor().equals(nuevoCurso.getProfesor())) {
                // El docente ya tiene asignado otro curso en el mismo horario o día
                return false;
            }
        }
        return true;
    }

    private boolean alumnoDisponible(Curso curso) {
        for (Curso c : cursosPresenciales) {
            for (Object alumno : c.getListadoAlumnos()) {
                if (curso.getListadoAlumnos().contains(alumno)) {
                    // El alumno ya está inscrito en otro curso presencial en el mismo horario o día
                    return false;
                }
            }
        }
        return true;
    }



    public void registrarCursoVirtual(Curso nuevoCurso) {
        //TODO: Implementar lógica para registrar el curso virtual, que es casi igual creo
    }


    public void inscribirAlumno(Alumno alumno, Curso nuevoCurso) {
        //TODO: Implementar lógica para verificar reglas específicas y realizar la inscripción
    }


    public void asignarDocente(Profesor profesor, Curso nuevoCurso) {
        //TODO: Implementar lógica para verificar reglas específicas y asignar al docente
    }
}
