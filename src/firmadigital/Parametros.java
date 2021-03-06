/*
 * Copyright (C) 2014 jorjoluiso
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package firmadigital;

import firmadigital.util.TextTransfer;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

/**
 *
 * @author jorjoluiso
 */
public class Parametros extends javax.swing.JDialog {

    /**
     * Creates new form NewJDialog
     */
    public Parametros(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtWebService = new javax.swing.JTextField();
        txtUbicacionAlmacenCertificado = new javax.swing.JTextField();
        lblWebService = new javax.swing.JLabel();
        lblWebService1 = new javax.swing.JLabel();
        cmdExaminarAlmacen = new javax.swing.JButton();
        cmdGuardar = new javax.swing.JButton();
        txtCertificado = new javax.swing.JTextField();
        lblCertificado = new javax.swing.JLabel();
        cmdExaminarCertificado = new javax.swing.JButton();
        cmdComando = new javax.swing.JButton();
        txtComando = new javax.swing.JTextField();

        setTitle("Parámetros");
        setName("dialogParametros"); // NOI18N
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        lblWebService.setText("Dirección del Web Service");

        lblWebService1.setText("Dirección del archivo almacén de certificados Java");

        cmdExaminarAlmacen.setMnemonic('E');
        cmdExaminarAlmacen.setText("Examinar");
        cmdExaminarAlmacen.setMaximumSize(new java.awt.Dimension(80, 25));
        cmdExaminarAlmacen.setMinimumSize(new java.awt.Dimension(80, 25));
        cmdExaminarAlmacen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExaminarAlmacenActionPerformed(evt);
            }
        });

        cmdGuardar.setMnemonic('G');
        cmdGuardar.setText("Guardar");
        cmdGuardar.setAlignmentY(0.0F);
        cmdGuardar.setMaximumSize(new java.awt.Dimension(80, 25));
        cmdGuardar.setMinimumSize(new java.awt.Dimension(80, 25));
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });

        lblCertificado.setText("Dirección del certificado");

        cmdExaminarCertificado.setMnemonic('E');
        cmdExaminarCertificado.setText("Examinar");
        cmdExaminarCertificado.setMaximumSize(new java.awt.Dimension(80, 25));
        cmdExaminarCertificado.setMinimumSize(new java.awt.Dimension(80, 25));
        cmdExaminarCertificado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdExaminarCertificadoActionPerformed(evt);
            }
        });

        cmdComando.setText("Comando");
        cmdComando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdComandoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtWebService)
                    .addComponent(txtUbicacionAlmacenCertificado)
                    .addComponent(txtCertificado)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWebService)
                            .addComponent(lblWebService1)
                            .addComponent(lblCertificado)
                            .addComponent(cmdExaminarAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cmdGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmdExaminarCertificado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmdComando, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 321, Short.MAX_VALUE))
                    .addComponent(txtComando))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWebService)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtWebService, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblWebService1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUbicacionAlmacenCertificado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdExaminarAlmacen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblCertificado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCertificado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdExaminarCertificado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdComando))
                .addGap(18, 18, 18)
                .addComponent(txtComando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(cmdGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        try {
            PropertiesConfiguration config = new PropertiesConfiguration("FirmaDigital.properties");
            if (config.getProperty("web.web_service") == null) {
                config.setProperty("web.web_service", "https://celcer.sri.gob.ec/comprobantes-electronicos-ws/RecepcionComprobantes?wsdl");
                config.save();
            }

            if (config.getProperty("certificado.almacen") == null) {
                config.setProperty("certificado.almacen", System.getProperty("java.home") + File.separator + "lib\\security\\cacerts");
                config.save();
            }
            if (config.getProperty("certificado.direccion") == null) {
                config.setProperty("certificado.direccion", System.getProperty("user.home") + File.separator + "Certificado");
                config.save();
            }
            txtUbicacionAlmacenCertificado.setText((String) config.getProperty("certificado.almacen"));
            txtWebService.setText((String) config.getProperty("web.web_service"));
            txtCertificado.setText(config.getProperty("certificado.direccion").toString());
        } catch (ConfigurationException ex) {
            Logger.getLogger(Parametros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formComponentShown

    private void cmdExaminarAlmacenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExaminarAlmacenActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            String selectedFile = fileChooser.getSelectedFile().getAbsolutePath();
            txtUbicacionAlmacenCertificado.setText(selectedFile);
        }
    }//GEN-LAST:event_cmdExaminarAlmacenActionPerformed

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
        System.out.println("Guardar");
        try {
            PropertiesConfiguration config = new PropertiesConfiguration("FirmaDigital.properties");
            config.setProperty("web.web_service", txtWebService.getText());
            config.setProperty("certificado.almacen", txtUbicacionAlmacenCertificado.getText());
            config.setProperty("certificado.direccion", txtCertificado.getText());
            config.save();

        } catch (ConfigurationException ex) {
            Logger.getLogger(Parametros.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdExaminarCertificadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdExaminarCertificadoActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            String selectedFile = fileChooser.getSelectedFile().getAbsolutePath();
            txtCertificado.setText(selectedFile);
        }
    }//GEN-LAST:event_cmdExaminarCertificadoActionPerformed

    private void cmdComandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdComandoActionPerformed
        
        String comando = "keytool -import -keystore \"" + txtUbicacionAlmacenCertificado.getText() + "\" -file \"" + txtCertificado.getText() + "\" -alias SRI -storepass changeit";
        System.out.println(comando);
        
        txtComando.setText(comando);
        
        
    }//GEN-LAST:event_cmdComandoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdComando;
    private javax.swing.JButton cmdExaminarAlmacen;
    private javax.swing.JButton cmdExaminarCertificado;
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JLabel lblCertificado;
    private javax.swing.JLabel lblWebService;
    private javax.swing.JLabel lblWebService1;
    private javax.swing.JTextField txtCertificado;
    private javax.swing.JTextField txtComando;
    private javax.swing.JTextField txtUbicacionAlmacenCertificado;
    private javax.swing.JTextField txtWebService;
    // End of variables declaration//GEN-END:variables
}
