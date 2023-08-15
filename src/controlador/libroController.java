package controlador;

import vista.vistaLibro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modeloDAO.libroDAO;
import modeloVO.libroVO;

public class libroController implements ActionListener {

    libroDAO dao = new libroDAO();
    libroVO l = new libroVO();
    vistaLibro vista;
    DefaultTableModel modelo = new DefaultTableModel();

    // Constructor que recibe la instancia de la vista
    public libroController(vistaLibro v) {
        this.vista = v;
        this.vista.btnListarLibro.addActionListener(this);
        this.vista.btnAgregarLibro.addActionListener(this);
        this.vista.btnEditarLibro.addActionListener(this);
        this.vista.btnActualizarLibro.addActionListener(this);
        this.vista.btnEliminarLibro.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.btnListarLibro) {
            limpiarTabla();
            listar(vista.tablaLibro);
        }
        if (e.getSource() == vista.btnAgregarLibro) {
            agregar();
            limpiarCampos();
            limpiarTabla();
            listar(vista.tablaLibro);
        }
        if (e.getSource() == vista.btnEditarLibro) {
            int fila = vista.tablaLibro.getSelectedRow();
            if (fila == -1) {
                JOptionPane.showMessageDialog(vista, "Debe seleccionar una fila");
            } else {
                llenarCamposEdicion(fila); // Llena los campos de edición
            }
        }
        if (e.getSource() == vista.btnActualizarLibro) {
            actualizar();
            limpiarCampos();
            limpiarTabla();
            listar(vista.tablaLibro);
        }
        if (e.getSource() == vista.btnEliminarLibro) {
            eliminar();
            limpiarTabla();
            listar(vista.tablaLibro);
        }
    }

    public void agregar() {
        // Obtén los datos de la vista y asigna a los atributos de 'l'
        l.setClaveLibro(vista.txtClaveLibro.getText());
        l.setNombreLibro(vista.txtNombreLibro.getText());
        l.setISBN(vista.txtISBN.getText());
        l.setNumPaginas(Integer.parseInt(vista.txtNumPaginas.getText()));
        l.setClaveEditorial(vista.txtClaveEditorialL.getText());

        int respuesta = dao.agregar(l);
        if (respuesta == 1) {
            JOptionPane.showMessageDialog(vista, "Libro agregado con éxito");
        } else {
            JOptionPane.showMessageDialog(vista, "Error al agregar el libro - Clave editorial no registrada");
        }
    }

    public void actualizar() {
        // Obtén los datos de la vista y asigna a los atributos de 'l'
        l.setClaveLibro(vista.txtClaveLibro.getText());
        l.setNombreLibro(vista.txtNombreLibro.getText());
        l.setISBN(vista.txtISBN.getText());
        l.setNumPaginas(Integer.parseInt(vista.txtNumPaginas.getText()));
        l.setClaveEditorial(vista.txtClaveEditorialL.getText());

        int respuesta = dao.actualizar(l);
        if (respuesta == 1) {
            JOptionPane.showMessageDialog(vista, "Libro actualizado con éxito");
        } else {
            JOptionPane.showMessageDialog(vista, "Error al actualizar el libro");
        }
    }

    public void eliminar() {
        int fila = vista.tablaLibro.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vista, "Debe seleccionar una fila");
        } else {
            String claveLibro = (String) vista.tablaLibro.getValueAt(fila, 0);
            try {
                dao.eliminar(claveLibro);
                JOptionPane.showMessageDialog(vista, "Libro eliminado con éxito");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(vista, "Error al eliminar el libro");
                ex.printStackTrace();
            }
        }
    }

    public void limpiarTabla() {
        modelo.setRowCount(0);
    }

    public void limpiarCampos() {
        vista.txtClaveLibro.setText("");
        vista.txtNombreLibro.setText("");
        vista.txtISBN.setText("");
        vista.txtNumPaginas.setText("");
        vista.txtClaveEditorialL.setText("");
    }

    public void listar(JTable tabla) {
        modelo = (DefaultTableModel) tabla.getModel();
        ArrayList<libroVO> lista = dao.Listar();

        for (libroVO l : lista) {
            Object[] fila = {l.getClaveLibro(), l.getNombreLibro(), l.getISBN(), l.getNumPaginas(), l.getClaveEditorial()};
            modelo.addRow(fila);
        }
        tabla.setModel(modelo);
    }

    public void llenarCamposEdicion(int fila) {
        String claveLibro = (String) vista.tablaLibro.getValueAt(fila, 0);
        String nombreLibro = (String) vista.tablaLibro.getValueAt(fila, 1);
        String ISBN = (String) vista.tablaLibro.getValueAt(fila, 2);
        int numPaginas = (int) vista.tablaLibro.getValueAt(fila, 3); // Conversión a int
        String claveEditorial = (String) vista.tablaLibro.getValueAt(fila, 4);

        vista.txtClaveLibro.setText(claveLibro);
        vista.txtNombreLibro.setText(nombreLibro);
        vista.txtISBN.setText(ISBN);
        vista.txtNumPaginas.setText(String.valueOf(numPaginas)); // Conversión a String
        vista.txtClaveEditorialL.setText(claveEditorial);
    }

}
