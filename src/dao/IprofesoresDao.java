package dao;

import java.util.Date;

public interface IprofesoresDao {
    public void listarProfesores();

    public void buscarProfesor(int id);

    public void setProfesorDeCurso(int id_profesor, int id_curso);

    public void crearProfesor(int dni, String nombre, String apellido, String cv, Date nacimiento);
}
