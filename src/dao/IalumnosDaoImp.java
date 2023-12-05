package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;

public class IalumnosDaoImp implements IalumnosDao{

    private dao.DBconexion DBconexion;

    public IalumnosDaoImp() {
        super();
        this.DBconexion=new dao.DBconexion();
    }

    @Override
    public void listarAlumnos() {
        String query="select * from alumnos";
        try {
            ResultSet rs=this.DBconexion.ejecutarConsultaSql(query);
            if(rs!=null) {
                while(rs.next()) {
                    System.out.println("nombre: "+rs.getInt(2)+"apellido: "+rs.getInt(3)+" legajo: "+rs.getString(4));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void buscarAlumno(int legajo) {
        String query="select * from alumnos where legajo=?";
        HashMap<Integer, Object> param= new HashMap<Integer, Object>();
        param.put(0, legajo);
        try {
            ResultSet rs=this.DBconexion.ejecutarConsultaSqlConParametros(query, param);
            if(rs!=null) {
                while(rs.next()) {
                    System.out.println("id_alumno: "+rs.getInt(1)+"id_persona: "+rs.getInt(2)+" legajo: "+rs.getString(3));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void inscribirAlumnoCurso(int legajo, int idCurso)  {
        String query="select * from alumnos where legajo=?";
        HashMap<Integer, Object> param= new HashMap<Integer, Object>();
        param.put(0, legajo);
        try {
            ResultSet rs=this.DBconexion.ejecutarConsultaSqlConParametros(query, param);
            if(rs!=null) {
                String insertQuery = "insert into relacion_alumnos_cursos (legajo, id_curso) VALUES(?, ?)";
                HashMap<Integer, Object> params= new HashMap<Integer, Object>();
                params.put(0, legajo);
                params.put(1, idCurso);
                ResultSet response =this.DBconexion.ejecutarConsultaSqlConParametros(insertQuery, params);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void crearAumno( String nombre, String apellido, String dni, Date nacimiento) {
        try {
                String insertQuery = "insert into alumnos (dni, nombre, apellido, fecha_nacimiento) VALUES(?,?,?,?)";
                HashMap<Integer, Object> params= new HashMap<Integer, Object>();
                params.put(0, dni);
                params.put(1, nombre);
                params.put(2, apellido);
                params.put(3, nacimiento);
                ResultSet response =this.DBconexion.ejecutarConsultaSqlConParametros(insertQuery, params);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
