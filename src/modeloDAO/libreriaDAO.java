package modeloDAO;

import conexionMSQL.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modeloVO.editorialesVO;

public class libreriaDAO {

    conexion conexion = new conexion();
    Connection con = conexion.getConexion();
    PreparedStatement ps;
    ResultSet rs;
//    
//    public ArrayList Listar(){
//        ArrayList<editorialesVO> lista = new ArrayList<>();
//        String SQL = "SELECT * FROM editoriales";
//        try {
//             Statement ps = con.createStatement();
//            rs = ps.executeQuery(SQL);
//        } catch (Exception e) {
//        }
//    }
    
    //Prieba de cambio realizado para gitHub
}
