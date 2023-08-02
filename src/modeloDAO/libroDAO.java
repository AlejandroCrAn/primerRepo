package modeloDAO;

import conexionMSQL.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modeloVO.libroVO;

public class libroDAO {

    //REVISAR CUALQUIER ERROR, ESTA PARTE DE LAS CONEXIONES
    conexion conexion = new conexion();
    Connection con = conexion.getConexion();
    PreparedStatement ps;
    ResultSet rs;

    public ArrayList Listar() {
        ArrayList<libroVO> lista = new ArrayList<>();
        String SQL = "SELECT * FROM libro";
        try {
            Statement ps = con.createStatement();
            rs = ps.executeQuery(SQL);
            while (rs.next()) {
                libroVO l = new libroVO();
                l.setClaveLibro(rs.getString(1));
                l.setNombreLibro(rs.getString(2));
                l.setISBN(rs.getString(3));
                l.setNumPaginas(rs.getInt(4));
                l.setClaveLibro(rs.getString(5));
                lista.add(l);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public int agregar(libroVO l) {
        String SQL = "INSERT INTO libro (claveLibro,nombreLibro,ISBN,numPaginas,claveEditorial) VALUES (?,?,?,?,?)";
        try {
            con = conexion.getConexion();
            ps = con.prepareStatement(SQL);
            ps.setString(1, l.getClaveLibro());
            ps.setString(2, l.getNombreLibro());
            ps.setString(3, l.getISBN());
            ps.setInt(4, l.getNumPaginas());
            ps.setString(5, l.getClaveEditorial());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 1;
    }

    public int actualizar(libroVO l) {
        int respuesta = 0;
        String SQL = "UPDATE libro SET nombreLibro=?,ISBN=?,numPaginas=?,claveEditorial=? WHERE claveEditorial=?";
        try {
            con = conexion.getConexion();
            ps = con.prepareStatement(SQL);
            ps.setString(1, l.getNombreLibro());
            ps.setString(2, l.getISBN());
            ps.setInt(3, l.getNumPaginas());
            ps.setString(4, l.getClaveEditorial());
            ps.setString(5, l.getClaveEditorial());
            if (respuesta == 1) {
                return 1;
            } else {
                return 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return respuesta;
    }

    public void eliminar(String claveLibro) throws SQLException {
        String SQL = "DELETE FROM libro WHERE claveLibro = '" + claveLibro + "'";
        try {
            con = conexion.getConexion();
            ps = con.prepareStatement(SQL);
            ps.setString(1, claveLibro);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e; //Exepcion para que pueda se calculada por el controlador 
        }
    }

}
