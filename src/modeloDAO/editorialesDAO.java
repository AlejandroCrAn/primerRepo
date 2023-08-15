package modeloDAO;

import conexionmysql.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modeloVO.editorialesVO;

public class editorialesDAO {

    Conexion conexion = new Conexion();
    Connection con = conexion.getConexion();
    PreparedStatement ps;
    ResultSet rs;

    public ArrayList<editorialesVO> Listar() {
        ArrayList<editorialesVO> lista = new ArrayList<>();
        String SQL = "SELECT * FROM editoriales";
        try {
            ps = con.prepareStatement(SQL);
            rs = ps.executeQuery();
            while (rs.next()) {
                editorialesVO e = new editorialesVO();
                e.setNumEditorial(rs.getInt("numEditorial"));
                e.setNombreEditorial(rs.getString("nombreEditorial"));
                e.setClaveEditorial(rs.getString("claveEditorial"));
                lista.add(e);
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

    public int agregar(editorialesVO e) {
        String SQL = "INSERT INTO editoriales (numEditorial,nombreEditorial,claveEditorial) VALUES (?,?,?)";
        try {
            ps = con.prepareStatement(SQL);
            ps.setInt(1, e.getNumEditorial());
            ps.setString(2, e.getNombreEditorial());
            ps.setString(3, e.getClaveEditorial());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return 0;
    }

    public int actualizar(editorialesVO e) {
        String SQL = "UPDATE editoriales SET nombreEditorial=?,claveEditorial=? WHERE numEditorial=?";
        try {
            ps = con.prepareStatement(SQL);
            ps.setString(1, e.getNombreEditorial());
            ps.setString(2, e.getClaveEditorial());
            ps.setInt(3, e.getNumEditorial());
            return ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return 0;
    }

    public void eliminar(int numEditorial) throws SQLException {
        String SQL = "DELETE FROM editoriales WHERE numEditorial = ?";
        try {
            ps = con.prepareStatement(SQL);
            ps.setInt(1, numEditorial);
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw ex; // Excepción para que pueda ser manejada por el controlador
        } finally {
            try {
                ps.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
