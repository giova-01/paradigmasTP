package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class DBconexion {
    private final String url = "localhost:5432";
    private final String user = "postgres";
    private final String password = "Tomi123!";

    Connection DBConnection = null;

    public DBconexion() {
        super();
    }

    public Connection connect() {
        try {
            if(DBConnection == null){
                DBConnection = DriverManager.getConnection(url, user, password);
                System.out.println("Connected to the PostgreSQL server successfully.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return DBConnection;
    }

    public ResultSet ejecutarConsultaSql(String sql) throws SQLException {
        Connection conn=null;
        Statement stmt;
        ResultSet rs=null;
        try {
            conn=connect();
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            conn.close();
            throw new SQLException("Error conexion");
        }finally {
            conn.close();
        }

        return rs;
    }

    public ResultSet ejecutarConsultaSqlConParametros(String sql,HashMap<Integer,Object> param) throws SQLException {
        Connection conn=null;
        PreparedStatement pstmt;
        ResultSet rs=null;
        try {
            conn=connect();
            pstmt = conn.prepareStatement(sql);
            for (Integer index : param.keySet()) {
                Object obj=param.get(index);
                if(obj instanceof Integer)
                    pstmt.setInt(index+1, (Integer)obj);
                if(obj instanceof String)
                    pstmt.setString(index+1, (String)obj);
                if(obj instanceof Float)
                    pstmt.setFloat(index+1, (Float)obj);
                if(obj instanceof Double)
                    pstmt.setDouble(index+1, (Double)obj);
                if(obj instanceof Boolean)
                    pstmt.setBoolean(index+1, (Boolean)obj);
                if(obj instanceof Long)
                    pstmt.setLong(index+1, (Long)obj);
            }
            rs = pstmt.executeQuery();
        } catch (SQLException e) {
            conn.close();
            throw new SQLException("Error conexion");
        }finally {
            conn.close();
        }

        return rs;
    }
}
