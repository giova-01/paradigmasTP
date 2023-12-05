package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;

public class IprofesoresDaoImp implements IprofesoresDao{
    private dao.DBconexion DBconexion;

    public IprofesoresDaoImp(){
        super();
        this.DBconexion=new dao.DBconexion();
    }

    @Override
    public void listarProfesores() {
        String query="select * from profesores";
        try {
            ResultSet rs=this.DBconexion.ejecutarConsultaSql(query);
            if(rs!=null) {
                while(rs.next()) {
                    System.out.println("nombre: "+rs.getInt(2)+"apellido: "+rs.getInt(3)+" id: "+rs.getString(6));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void buscarProfesor(int id) {
        String query="select * from profesores where id=?";
        HashMap<Integer, Object> param= new HashMap<Integer, Object>();
        param.put(0, id);
        try {
            ResultSet rs=this.DBconexion.ejecutarConsultaSqlConParametros(query, param);
            if(rs!=null) {
                while(rs.next()) {
                    System.out.println("nombre: "+rs.getInt(2)+"apellido: "+rs.getInt(3)+" id: "+rs.getString(6));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    @Override
    public void setProfesorDeCurso(int id_profesor, int id_curso) {
        try {
            String insertQuery = "update cursos set profesor=? WHERE id=?";
            HashMap<Integer, Object> params= new HashMap<Integer, Object>();
            params.put(0, id_profesor);
            params.put(1, id_curso);
            ResultSet response =this.DBconexion.ejecutarConsultaSqlConParametros(insertQuery, params);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void crearProfesor(int dni, String nombre, String apellido, String cv, Date nacimiento) {
        try {
            String insertQuery = "insert into profesores (dni, nombre, apellido, fecha_nacimiento) VALUES(?,?,?,?)";
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
