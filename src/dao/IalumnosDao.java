package dao;

import java.util.Date;

public interface IalumnosDao {
    public void listarAlumnos();

    public void buscarAlumno(int legajo);

    public void inscribirAlumnoCurso(int legajo, int idCurso);

    public void crearAumno( String nombre, String apellido, String dni, Date nacimiento);
}
