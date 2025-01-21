
package plantilla;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PrincipalCarrosForm extends javax.swing.JFrame {

   // INICIALIZAR FRAME
    public PrincipalCarrosForm() {
        
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        botones = new javax.swing.ButtonGroup();
        botonesAvance = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtLinea = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnSedan = new javax.swing.JRadioButton();
        btnCoupe = new javax.swing.JRadioButton();
        btnWagon = new javax.swing.JRadioButton();
        jComboBoxNacionalidad = new javax.swing.JComboBox();
        jSpinnerModelo = new javax.swing.JSpinner();
        jComboBoxCilindraje = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        btnParticular = new javax.swing.JRadioButton();
        btnPublico = new javax.swing.JRadioButton();
        btnOficial = new javax.swing.JRadioButton();
        button1 = new java.awt.Button();
        jButton1 = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtPropietario = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jList1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REGISTRO DE VEHICULOS");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("REGISTRO DE VEHICULOS");

        jLabel2.setText("Marca:");

        jLabel3.setText("Linea:");

        jLabel4.setText("Carroceria:");

        jLabel5.setText("Nacionalidad:");

        jLabel6.setText("Correo:");

        jLabel7.setText("Telefono:");

        jLabel8.setText("Modelo:");

        jLabel9.setText("Cilindraje");

        txtLinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLineaActionPerformed(evt);
            }
        });

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        botones.add(btnSedan);
        btnSedan.setText("SEDAN");
        btnSedan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSedanActionPerformed(evt);
            }
        });

        botones.add(btnCoupe);
        btnCoupe.setText("COUPE");
        btnCoupe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoupeActionPerformed(evt);
            }
        });

        botones.add(btnWagon);
        btnWagon.setText("WAGON");

        jComboBoxNacionalidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nacional", "EEUU", "Japon", "Korea", "China" }));

        jSpinnerModelo.setModel(new javax.swing.SpinnerNumberModel(1990, 1990, null, 1));

        jComboBoxCilindraje.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "800", "1000", "1200", "1400", "1600", "1800", "2000", "2500", "3000" }));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Linea", "Carroceria", "Nacionalidad", "Propietario", "Telefono", "Correo", "Modelo", "Cilindraje", "Servicio"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel10.setText("Servicio");

        botonesAvance.add(btnParticular);
        btnParticular.setText("Particular");
        btnParticular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnParticularActionPerformed(evt);
            }
        });

        botonesAvance.add(btnPublico);
        btnPublico.setText("Publico");

        botonesAvance.add(btnOficial);
        btnOficial.setText("Oficial");
        btnOficial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOficialActionPerformed(evt);
            }
        });

        button1.setLabel("button1");

        jButton1.setText("jButton1");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jButton3.setText("Registrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel12.setText("Propietario:");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/plantilla/LOGO CAR.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnSedan)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnCoupe)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnWagon)
                                                .addGap(30, 30, 30))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtPropietario, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(txtTelefono)
                                                .addComponent(txtCorreo)
                                                .addComponent(jComboBoxNacionalidad, 0, 186, Short.MAX_VALUE)))
                                        .addComponent(txtLinea, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxCilindraje, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSpinnerModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(124, 124, 124))))
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnParticular)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPublico)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnOficial))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(166, 166, 166)
                                        .addComponent(jLabel11))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel1))
                            .addComponent(jLabel6)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(btnSedan)
                            .addComponent(btnCoupe)
                            .addComponent(btnWagon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(txtPropietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jSpinnerModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jComboBoxCilindraje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel11))))
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(btnPublico)
                    .addComponent(btnParticular)
                    .addComponent(btnOficial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnRegistrar)
                    .addComponent(btnModificar))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnSedanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSedanActionPerformed
        
    }//GEN-LAST:event_btnSedanActionPerformed

    private void txtLineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLineaActionPerformed
    
    }//GEN-LAST:event_txtLineaActionPerformed

    private void btnParticularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnParticularActionPerformed
     
    }//GEN-LAST:event_btnParticularActionPerformed
                              
                            //BOTON REGISTRAR 
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

 String marca = txtMarca.getText();
        String linea = txtLinea.getText();
        String carroceria = "";
        
        if (btnSedan.isSelected()) {
            carroceria = "Sedan";
        } else if (btnCoupe.isSelected()) {
            carroceria = "Coupe";
        } else if (btnWagon.isSelected()) {
            carroceria = "Wagon";
        }
        
        String nacionalidad = (String) jComboBoxNacionalidad.getSelectedItem();
        String propietario=txtPropietario.getText();
        String correo = txtCorreo.getText();
        String telefono = txtTelefono.getText();
        int modelo = (int) jSpinnerModelo.getValue();
        
        String cilindraje=(String) jComboBoxCilindraje.getSelectedItem();
        String servicio = "";
        if (btnParticular.isSelected()) {
            servicio = " particular";
        } else if (btnPublico.isSelected()) {
            servicio = " publico";
        } else if (btnOficial.isSelected()) {
            servicio = " oficial";
        }

         Object[] FilaTabla = {marca, linea, carroceria, nacionalidad,propietario, correo, telefono,modelo,cilindraje,servicio};
         DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.addRow(FilaTabla);
    
        limpiarFormulario();
    }//GEN-LAST:event_btnRegistrarActionPerformed
                         
                            //BOTON MOFICIAR 
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
       // Obtener el índice de la fila seleccionada
        int filaSeleccionada = jTable2.getSelectedRow();
        
        if (filaSeleccionada >= 0) {
            // Si hay una fila seleccionada, obtener el modelo de la tabla
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            
            // Obtener los nuevos valores de los campos de texto y selecciones
            String marca = txtMarca.getText();
            String linea = txtLinea.getText();
            String carroceria = "";
            
            if (btnSedan.isSelected()) {
                carroceria = "Sedan";           
            } else if (btnCoupe.isSelected()) {
                carroceria = "Coupe";
            } else if (btnWagon.isSelected()) {
                carroceria = "Wagon";
           
            }
            
            String nacionalidad = (String) jComboBoxNacionalidad.getSelectedItem();
            String propietario=txtPropietario.getText();
            String correo = txtCorreo.getText();
            String telefono = txtTelefono.getText();
            int modelo=(int) jSpinnerModelo.getValue();
            String cilindraje=(String)jComboBoxCilindraje.getSelectedItem();
            String servicio = "";
            
            if (btnParticular.isSelected()) {
                servicio = "Particular";           
            } else if (btnPublico.isSelected()) {
                servicio = "Publico";
            } else if (btnOficial.isSelected()) {
                servicio = "Oficial";
            }
            // Modificar los valores en la fila seleccionada
            model.setValueAt(marca, filaSeleccionada, 0); // Columna "marca"
            model.setValueAt(linea, filaSeleccionada, 1); // Columna "linea"
            model.setValueAt(carroceria, filaSeleccionada, 2); // Columna "carroceria"
            model.setValueAt(nacionalidad, filaSeleccionada,3); // Columna "nacionalidad"
            model.setValueAt(propietario, filaSeleccionada, 4); // Columna "propietario"
            model.setValueAt(correo, filaSeleccionada, 6); // Columna "correo"
            model.setValueAt(telefono, filaSeleccionada, 5); // Columna "telefono"
            model.setValueAt(modelo, filaSeleccionada, 7); // Columna "modelo"
            model.setValueAt(cilindraje, filaSeleccionada, 8); // Columna "cilindraje"
            model.setValueAt(servicio, filaSeleccionada, 9); // Columna "servicio"

            // Limpiar el formulario después de modificar
            limpiarFormulario();
        } else {
            // Mostrar mensaje de error si no se seleccionó ninguna fila
            JOptionPane.showMessageDialog(null, "Por favor selecciona una fila para modificar.");
        }
    

    }//GEN-LAST:event_btnModificarActionPerformed
                          
                            //BOTON ELIMINAR 
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
                                    
    int filaSeleccionada = jTable2.getSelectedRow();
    
    // Verificar si hay una fila seleccionada
    if (filaSeleccionada >= 0) 
    {    
       // Obtener el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) jTable2.getModel();    
        
        // Eliminar la fila seleccionada
        modelo.removeRow(filaSeleccionada);      
        
        // Mensaje opcional para confirmar la eliminación
        JOptionPane.showMessageDialog(null, "Fila eliminada exitosamente.");
    } 
    else {    // Si no se ha seleccionado ninguna fila, mostrar un mensaje de advertencia
                JOptionPane.showMessageDialog(null, "Por favor, selecciona una fila para eliminar.");
             }
    
    //ACTIONLISTENER
    
    
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void btnCoupeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoupeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCoupeActionPerformed

    private void btnOficialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOficialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOficialActionPerformed
                          
                            //METODO LIMPIAR FORMULARIO
    public void limpiarFormulario() {
        
    txtMarca.setText("");
    txtLinea.setText("");
    botones.clearSelection();  // Limpiar la selección de los RadioButtons
    jComboBoxNacionalidad.setSelectedIndex(0);
    txtCorreo.setText("");
    txtPropietario.setText("");
    txtTelefono.setText("");
    jSpinnerModelo.setValue("");
    jComboBoxCilindraje.setSelectedIndex(0);
    botonesAvance.clearSelection();  // Limpiar la selección de los RadioButtons de avance
    
    }
                             
                            //MAIN PLANTILLA FORMULARIO
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalCarrosForm().setVisible(true);
            }
        });
        
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup botones;
    private javax.swing.ButtonGroup botonesAvance;
    private javax.swing.JRadioButton btnCoupe;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JRadioButton btnOficial;
    private javax.swing.JRadioButton btnParticular;
    private javax.swing.JRadioButton btnPublico;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JRadioButton btnSedan;
    private javax.swing.JRadioButton btnWagon;
    private java.awt.Button button1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBoxCilindraje;
    private javax.swing.JComboBox jComboBoxNacionalidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinnerModelo;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtLinea;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPropietario;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
