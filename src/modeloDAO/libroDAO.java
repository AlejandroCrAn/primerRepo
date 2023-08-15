package modeloDAO;

import conexionmysql.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modeloVO.libroVO;

public class libroDAO {

    Conexion conexion = new Conexion();
    Connection con = conexion.getConexion();
    PreparedStatement ps;
    ResultSet rs;

    public ArrayList<libroVO> Listar() {
        ArrayList<libroVO> lista = new ArrayList<>();
        String SQL = "SELECT * FROM libro";
        try {
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                libroVO l = new libroVO();
                l.setClaveLibro(rs.getString("claveLibro"));
                l.setNombreLibro(rs.getString("nombreLibro"));
                l.setISBN(rs.getString("ISBN"));
                l.setNumPaginas(rs.getInt("numPaginas"));
                l.setClaveEditorial(rs.getString("claveEditorial"));
                lista.add(l);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rs.close();
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return lista;
    }

    public int agregar(libroVO l) {
        String SQL = "INSERT INTO libro (claveLibro,nombreLibro,ISBN,numPaginas,claveEditorial) VALUES (?,?,?,?,?)";
        try {
            ps = con.prepareStatement(SQL);
            ps.setString(1, l.getClaveLibro());
            ps.setString(2, l.getNombreLibro());
            ps.setString(3, l.getISBN());
            ps.setInt(4, l.getNumPaginas());
            ps.setString(5, l.getClaveEditorial());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    public int actualizar(libroVO l) {
        String SQL = "UPDATE libro SET nombreLibro=?,ISBN=?,numPaginas=?,claveEditorial=? WHERE claveLibro=?";
        try {
            ps = con.prepareStatement(SQL);
            ps.setString(1, l.getNombreLibro());
            ps.setString(2, l.getISBN());
            ps.setInt(3, l.getNumPaginas());
            ps.setString(4, l.getClaveEditorial());
            ps.setString(5, l.getClaveLibro());
            return ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    public void eliminar(String claveLibro) throws SQLException {
        String SQL = "DELETE FROM libro WHERE claveLibro = ?";
        try {
            ps = con.prepareStatement(SQL);
            ps.setString(1, claveLibro);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e; // Excepción para que pueda ser manejada por el controlador
        } finally {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
