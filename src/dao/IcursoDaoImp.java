package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class IcursoDaoImp implements IcursoDao{

    private dao.DBconexion DBconexion;

    IcursoDaoImp(){
        super();
        this.DBconexion=new dao.DBconexion();
    }

    @Override
    public void listarCursos() {
        String query="select * from cursos";
        try {
            ResultSet rs=this.DBconexion.ejecutarConsultaSql(query);
            if(rs!=null) {
                while(rs.next()) {
                    System.out.println("nombre: "+rs.getInt(1)+"catedra: "+rs.getInt(2)+ " desc: "+rs.getString(3) + " costo: " + rs.getString(5)+" online: " +rs.getString(6)+" profesor: " + rs.getString(4) +" id: "+rs.getString(6));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void buscarCurso(int id) {
        String query="select * from cursos where id=?";
        HashMap<Integer, Object> param= new HashMap<Integer, Object>();
        param.put(0, id);
        try {
            ResultSet rs=this.DBconexion.ejecutarConsultaSqlConParametros(query, param);
            if(rs!=null) {
                while(rs.next()) {
                    System.out.println("nombre: "+rs.getInt(1)+"catedra: "+rs.getInt(2)+ " desc: "+rs.getString(3) + " costo: " + rs.getString(5)+" online: " +rs.getString(6)+" profesor: " + rs.getString(4) +" id: "+rs.getString(6));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public void crearCurso(String nombre, String catedra, String desc, int costo, boolean online) {
        try {
            String insertQuery = "insert into cursos (nombre, catedra, descripcion, costo, online) values(?, ?, ?, ?, ?)";
            HashMap<Integer, Object> params= new HashMap<Integer, Object>();
            params.put(0, nombre);
            params.put(1, catedra);
            params.put(2, desc);
            params.put(3, costo);
            params.put(4, online);
            ResultSet response =this.DBconexion.ejecutarConsultaSqlConParametros(insertQuery, params);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
