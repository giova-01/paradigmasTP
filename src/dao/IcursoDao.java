package dao;

public interface IcursoDao {
    public void listarCursos();

    public void buscarCurso(int id);

    public void crearCurso(String nombre, String catedra, String desc, int costo, boolean online);
}
