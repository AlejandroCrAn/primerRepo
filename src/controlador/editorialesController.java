package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modeloDAO.editorialesDAO;
import modeloVO.editorialesVO;
import vista.vistaLibro; // Asegúrate de reemplazar esto con el nombre de tu vista

public class editorialesController implements ActionListener {

    editorialesDAO dao = new editorialesDAO();
    editorialesVO e = new editorialesVO();
    vistaLibro vista = new vistaLibro(); // Reemplaza con el nombre de tu vista
    DefaultTableModel modelo = new DefaultTableModel();

    public editorialesController(vistaLibro v) {
        this.vista = v;
        this.vista.btnListarEditorial.addActionListener(this);
        this.vista.btnAgregarEditorial.addActionListener(this);
        this.vista.btnEditarEditorial.addActionListener(this);
        this.vista.btnActualizarEditorial.addActionListener(this);
        this.vista.btnEliminarEditorial.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnListarEditorial) {
            limpiarTabla();
            listar(vista.tablaEditoriales);
        }
        if (e.getSource() == vista.btnAgregarEditorial) {
            agregar();
            limpiarCampos(); // Limpia los campos después de agregar
            limpiarTabla();
            listar(vista.tablaEditoriales);
        }
        if (e.getSource() == vista.btnEditarEditorial) {
            int fila = vista.tablaEditoriales.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar una fila");
            } else {
                // Obtiene los valores de la fila seleccionada
                int numEditorial = Integer.parseInt(vista.tablaEditoriales.getValueAt(fila, 0).toString());
                String nombreEditorial = (String) vista.tablaEditoriales.getValueAt(fila, 1);
                String claveEditorial = (String) vista.tablaEditoriales.getValueAt(fila, 2);

                // Llena los campos de edición con los valores obtenidos
                vista.txtNumEditorial.setText(String.valueOf(numEditorial));
                vista.txtNombreEditorial.setText(nombreEditorial);
                vista.txtClaveEditorialE.setText(claveEditorial);
            }
        }
        if (e.getSource() == vista.btnActualizarEditorial) {
            actualizar();
            limpiarCampos(); // Limpia los campos después de actualizar
            limpiarTabla();
            listar(vista.tablaEditoriales);
        }
        if (e.getSource() == vista.btnEliminarEditorial) {
            try {
                eliminar();
            } catch (SQLException ex) {
                Logger.getLogger(editorialesController.class.getName()).log(Level.SEVERE, null, ex);
            }
            limpiarTabla();
            listar(vista.tablaEditoriales);
        }
    }

    public void agregar() {
        // Obtén los datos de la vista y asigna a los atributos de 'e'
        e.setNumEditorial(Integer.parseInt(vista.txtNumEditorial.getText()));
        e.setNombreEditorial(vista.txtNombreEditorial.getText());
        e.setClaveEditorial(vista.txtClaveEditorialE.getText());

        int respuesta = dao.agregar(e);
        if (respuesta == 1) {
            JOptionPane.showMessageDialog(vista, "Editorial agregada con éxito");
        } else {
            JOptionPane.showMessageDialog(vista, "Error al agregar la editorial");
        }
    }

    public void actualizar() {
        // Obtén los datos de la vista y asigna a los atributos de 'e'
        e.setNumEditorial(Integer.parseInt(vista.txtNumEditorial.getText()));
        e.setNombreEditorial(vista.txtNombreEditorial.getText());
        e.setClaveEditorial(vista.txtClaveEditorialE.getText());

        int respuesta = dao.actualizar(e);
        if (respuesta == 1) {
            JOptionPane.showMessageDialog(vista, "Editorial actualizada con éxito");
        } else {
            JOptionPane.showMessageDialog(vista, "Error al actualizar la editorial");
        }
    }

    public void eliminar() throws SQLException {
        int fila = vista.tablaEditoriales.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar una fila");
        } else {
            int numEditorial = Integer.parseInt(vista.tablaEditoriales.getValueAt(fila, 0).toString());
            dao.eliminar(numEditorial);
            JOptionPane.showMessageDialog(vista, "Editorial eliminada con éxito");
        }
    }

    public void limpiarTabla() {
        modelo.setRowCount(0);
    }

    public void limpiarCampos() {
        vista.txtNumEditorial.setText("");
        vista.txtNombreEditorial.setText("");
        vista.txtClaveEditorialE.setText("");
    }

    public void listar(JTable tabla) {
        modelo = (DefaultTableModel) tabla.getModel();
        ArrayList<editorialesVO> lista = dao.Listar();

        for (editorialesVO e : lista) {
            Object[] fila = {e.getNumEditorial(), e.getNombreEditorial(), e.getClaveEditorial()};
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }
}
// Implementa los métodos restantes (guardar, editar, actualizar, eliminar, limpiarTabla, listar) siguiendo el ejemplo que proporcionaste

