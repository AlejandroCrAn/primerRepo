
package vista;


public class vistaLibro extends javax.swing.JFrame {

    public vistaLibro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        Pane_Libro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtClaveLibro = new javax.swing.JTextField();
        txtNombreLibro = new javax.swing.JTextField();
        txtISBN = new javax.swing.JTextField();
        txtNumPaginas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnListarLibro = new javax.swing.JButton();
        btnEditarLibro = new javax.swing.JButton();
        btnEliminarLibro = new javax.swing.JButton();
        btnAgregarLibro = new javax.swing.JButton();
        btnActualizarLibro = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtClaveEditorialL = new javax.swing.JTextField();
        Pane_Editoriales = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNombreEditorial = new javax.swing.JTextField();
        txtNumEditorial = new javax.swing.JTextField();
        txtClaveEditorialE = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnListarEditorial = new javax.swing.JButton();
        btnAgregarEditorial = new javax.swing.JButton();
        btnEditarEditorial = new javax.swing.JButton();
        btnActualizarEditorial = new javax.swing.JButton();
        btnEliminarEditorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LIBRO");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("CLAVE LIBRO: ");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("NOMBRE LIBRO:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("ISBN LIBRO:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("No. PÁGINAS:");

        txtClaveLibro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtNombreLibro.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtISBN.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtNumPaginas.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jTable1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CLAVE LIBRO", "NOMBRE LIBRO", "ISBN LIBRO", "No. PÁGINAS", "CLAVE EDITORIAL"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnListarLibro.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnListarLibro.setText("LISTAR");

        btnEditarLibro.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnEditarLibro.setText("EDITAR");

        btnEliminarLibro.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnEliminarLibro.setText("ELIMINAR");

        btnAgregarLibro.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnAgregarLibro.setText("AGREGAR");

        btnActualizarLibro.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnActualizarLibro.setText("ACTUALIZAR");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("CLAVE EDITORIAL:");

        txtClaveEditorialL.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout Pane_LibroLayout = new javax.swing.GroupLayout(Pane_Libro);
        Pane_Libro.setLayout(Pane_LibroLayout);
        Pane_LibroLayout.setHorizontalGroup(
            Pane_LibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_LibroLayout.createSequentialGroup()
                .addGroup(Pane_LibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pane_LibroLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(Pane_LibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Pane_LibroLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1))
                            .addComponent(jLabel2)))
                    .addGroup(Pane_LibroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)))
                .addGap(12, 12, 12)
                .addGroup(Pane_LibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(txtClaveLibro)
                    .addComponent(txtClaveEditorialL))
                .addGroup(Pane_LibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pane_LibroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(Pane_LibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(Pane_LibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Pane_LibroLayout.createSequentialGroup()
                                .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnListarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Pane_LibroLayout.createSequentialGroup()
                                .addComponent(txtNumPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Pane_LibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregarLibro)
                            .addComponent(btnActualizarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Pane_LibroLayout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(btnEliminarLibro)
                        .addGap(66, 66, 66)))
                .addGap(0, 8, Short.MAX_VALUE))
            .addGroup(Pane_LibroLayout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        Pane_LibroLayout.setVerticalGroup(
            Pane_LibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_LibroLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(Pane_LibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Pane_LibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtClaveLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)
                        .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(btnListarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pane_LibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Pane_LibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtNombreLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtNumPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEditarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(btnActualizarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Pane_LibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Pane_LibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtClaveEditorialL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("LIBRO", null, Pane_Libro, "");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("NOMBRE EDITORIAL:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("No. EDITORIAL:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("CLAVE EDITORIAL:");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "NOMBRE EDITORIAL", "No. EDITORIAL", "CLAVE EDITORIAL"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        btnListarEditorial.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnListarEditorial.setText("LISTAR");

        btnAgregarEditorial.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnAgregarEditorial.setText("AGREGAR");

        btnEditarEditorial.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnEditarEditorial.setText("EDITAR");

        btnActualizarEditorial.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnActualizarEditorial.setText("ACTUALIZAR");
        btnActualizarEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEditorialActionPerformed(evt);
            }
        });

        btnEliminarEditorial.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnEliminarEditorial.setText("ELIMINAR");

        javax.swing.GroupLayout Pane_EditorialesLayout = new javax.swing.GroupLayout(Pane_Editoriales);
        Pane_Editoriales.setLayout(Pane_EditorialesLayout);
        Pane_EditorialesLayout.setHorizontalGroup(
            Pane_EditorialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_EditorialesLayout.createSequentialGroup()
                .addGroup(Pane_EditorialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Pane_EditorialesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Pane_EditorialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Pane_EditorialesLayout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtClaveEditorialE, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Pane_EditorialesLayout.createSequentialGroup()
                            .addGroup(Pane_EditorialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(Pane_EditorialesLayout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNombreEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Pane_EditorialesLayout.createSequentialGroup()
                                    .addGap(68, 68, 68)
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNumEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(42, 42, 42)
                            .addGroup(Pane_EditorialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnEditarEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addComponent(btnListarEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(Pane_EditorialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnAgregarEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnActualizarEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addComponent(btnEliminarEditorial))))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        Pane_EditorialesLayout.setVerticalGroup(
            Pane_EditorialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Pane_EditorialesLayout.createSequentialGroup()
                .addGroup(Pane_EditorialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pane_EditorialesLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(Pane_EditorialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Pane_EditorialesLayout.createSequentialGroup()
                                .addGroup(Pane_EditorialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtNombreEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 13, Short.MAX_VALUE))
                            .addComponent(btnListarEditorial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(Pane_EditorialesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Pane_EditorialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminarEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizarEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(Pane_EditorialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Pane_EditorialesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Pane_EditorialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNumEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Pane_EditorialesLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(Pane_EditorialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEditarEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregarEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Pane_EditorialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtClaveEditorialE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jTabbedPane1.addTab("EDITORIALES", Pane_Editoriales);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("LIBRO");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarEditorialActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vistaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pane_Editoriales;
    private javax.swing.JPanel Pane_Libro;
    private javax.swing.JButton btnActualizarEditorial;
    private javax.swing.JButton btnActualizarLibro;
    private javax.swing.JButton btnAgregarEditorial;
    private javax.swing.JButton btnAgregarLibro;
    private javax.swing.JButton btnEditarEditorial;
    private javax.swing.JButton btnEditarLibro;
    private javax.swing.JButton btnEliminarEditorial;
    private javax.swing.JButton btnEliminarLibro;
    private javax.swing.JButton btnListarEditorial;
    private javax.swing.JButton btnListarLibro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtClaveEditorialE;
    private javax.swing.JTextField txtClaveEditorialL;
    private javax.swing.JTextField txtClaveLibro;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtNombreEditorial;
    private javax.swing.JTextField txtNombreLibro;
    private javax.swing.JTextField txtNumEditorial;
    private javax.swing.JTextField txtNumPaginas;
    // End of variables declaration//GEN-END:variables
}
