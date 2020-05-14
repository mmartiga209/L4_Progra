/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ub.info.prog2.GabaldonPolMartinezMarti.vista;

import java.io.File;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import ub.info.prog2.GabaldonPolMartinezMarti.controlador.Controlador;
import ub.info.prog2.GabaldonPolMartinezMarti.model.FitxerMultimedia;
import ub.info.prog2.utils.ReproException;
import javax.swing.JOptionPane;
import java.util.Iterator;
import javax.swing.JFileChooser;
/**
 *
 * @author polg24
 */
public class AplicacioUB4 extends javax.swing.JFrame {

    private Controlador controlador;
    /**
     * Creates new form AplicacioUB4
     */
    public AplicacioUB4() {
        initComponents();
        controlador = new Controlador();
        btnCrearPortafoli.setEnabled(false);
        btnEliminarPortafoli.setEnabled(false);
        btnEliminarFitxerRepositori.setEnabled(false);
        btnAfegirFitxerPortafoli.setEnabled(false);
    }
    
    private void updateCmbPortafolis() {
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        Iterator<String> iter = controlador.getTitolsPortafolis().iterator();
        while (iter.hasNext()) {
            model.addElement(iter.next());
        }
        cmbPortafolis.setModel(model);
        updateBtnAfegirFitxerPortafoli();
        updateLstPortafoli();
    }
    
    private void updateEliminarPortafoli() {
        btnEliminarPortafoli.setEnabled(controlador.getSizePortafolis() != 0);
    }
    
    private void updateBtnEliminarFitxerRepositori() {
        btnEliminarFitxerRepositori.setEnabled(!lstRepositori.isSelectionEmpty());
    }
    
    private void updateBtnAfegirFitxerPortafoli() {
        btnAfegirFitxerPortafoli.setEnabled(!lstRepositori.isSelectionEmpty() && cmbPortafolis.getItemCount() != 0);
    }
    
    private void updateLstRepositori() {
        DefaultListModel<String> model = new DefaultListModel<>();
        int size = controlador.getSizeRepositori();
        for (int i = 0; i < size; i++) {
            model.addElement(((FitxerMultimedia)controlador.getAtRepositori(i)).resum());
        }
        lstRepositori.setModel(model);
    }
    
    private void updateLstPortafoli() {
        DefaultListModel<String> model = new DefaultListModel<>();
        int size = controlador.getSizePortafoli((String)cmbPortafolis.getSelectedItem());
        for (int i = 0; i < size; i++) {
            model.addElement(((FitxerMultimedia)controlador.getAtPortafoli((String)cmbPortafolis.getSelectedItem(), i)).resum());
        }
        lstPortafoli.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAfegirFitxerRepositori = new javax.swing.JButton();
        btnEliminarFitxerRepositori = new javax.swing.JButton();
        btnCrearPortafoli = new javax.swing.JButton();
        btnEliminarPortafoli = new javax.swing.JButton();
        btnAfegirFitxerPortafoli = new javax.swing.JButton();
        btnEliminarFitxerPortafoli = new javax.swing.JButton();
        btnPlayFitRepositori = new javax.swing.JButton();
        btnPlayPortafoli = new javax.swing.JButton();
        btnPlayRepositori1 = new javax.swing.JButton();
        chkCiclica = new javax.swing.JCheckBox();
        chkReverse = new javax.swing.JCheckBox();
        btnPlay = new javax.swing.JButton();
        btnPause = new javax.swing.JButton();
        btnAtura = new javax.swing.JButton();
        btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstRepositori = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPortafoli = new javax.swing.JList<>();
        cmbPortafolis = new javax.swing.JComboBox<>();
        txtTitolPortafoli = new javax.swing.JTextField();
        lblTitolPortafoli = new javax.swing.JLabel();
        lblSeleccionarPortafoli = new javax.swing.JLabel();
        btnRecuperaDades = new javax.swing.JButton();
        btnGuardaDades = new javax.swing.JButton();
        btnAddImatge = new javax.swing.JButton();
        btnAddAudio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(242, 241, 241));

        btnAfegirFitxerRepositori.setText("Afegir un Fitxer al Repositori");
        btnAfegirFitxerRepositori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfegirFitxerRepositoriActionPerformed(evt);
            }
        });

        btnEliminarFitxerRepositori.setText("Eliminar Fitxer seleccionat del Repositori");
        btnEliminarFitxerRepositori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFitxerRepositoriActionPerformed(evt);
            }
        });

        btnCrearPortafoli.setText("Crear Portafoli");
        btnCrearPortafoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPortafoliActionPerformed(evt);
            }
        });

        btnEliminarPortafoli.setText("Eliminar Portafoli");
        btnEliminarPortafoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPortafoliActionPerformed(evt);
            }
        });

        btnAfegirFitxerPortafoli.setText("Afegir un Fitxer al Portafoli seleccionat");
        btnAfegirFitxerPortafoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfegirFitxerPortafoliActionPerformed(evt);
            }
        });

        btnEliminarFitxerPortafoli.setText("Eliminar Fitxer seleccionat d'un Portafoli");

        btnPlayFitRepositori.setText("Reproduir el Fitxer seleccionat del Repositori");
        btnPlayFitRepositori.setToolTipText("");

        btnPlayPortafoli.setText("Reproduir el Portafoli seleccionat");

        btnPlayRepositori1.setText("Reproduir el Repositori");

        chkCiclica.setText("Reproduccio Cíclica");

        chkReverse.setText("Reproduccio Reverse");

        btnPlay.setText("Play");

        btnPause.setText("Pause");

        btnAtura.setText("Atura");

        btn.setText("Salta");

        lstRepositori.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstRepositoriValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstRepositori);

        jScrollPane2.setViewportView(lstPortafoli);

        cmbPortafolis.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPortafolisItemStateChanged(evt);
            }
        });

        txtTitolPortafoli.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTitolPortafoliKeyReleased(evt);
            }
        });

        lblTitolPortafoli.setText("Títol Portafoli:");

        lblSeleccionarPortafoli.setText("Seleccionar Portafoli:");

        btnRecuperaDades.setText("Recupera dades des d'un fitxer");
        btnRecuperaDades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecuperaDadesActionPerformed(evt);
            }
        });

        btnGuardaDades.setText("Guarda dades a un fitxer");
        btnGuardaDades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardaDadesActionPerformed(evt);
            }
        });

        btnAddImatge.setText("addimatge");
        btnAddImatge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddImatgeActionPerformed(evt);
            }
        });

        btnAddAudio.setText("addaudio");
        btnAddAudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAudioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminarFitxerRepositori)
                                    .addComponent(btnEliminarFitxerPortafoli)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnRecuperaDades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnGuardaDades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnPlayPortafoli)
                                            .addComponent(btnPlayFitRepositori)
                                            .addComponent(btnPlayRepositori1)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(160, 160, 160)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnAddAudio)
                                            .addComponent(btnAddImatge)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAfegirFitxerPortafoli)
                                    .addComponent(btnAfegirFitxerRepositori))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnCrearPortafoli, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                        .addComponent(txtTitolPortafoli))
                                    .addComponent(lblTitolPortafoli)
                                    .addComponent(btnEliminarPortafoli))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSeleccionarPortafoli)
                                    .addComponent(cmbPortafolis, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(360, 360, 360)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkReverse)
                                    .addComponent(chkCiclica)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPlay)
                                .addGap(27, 27, 27)
                                .addComponent(btnPause)
                                .addGap(55, 55, 55)
                                .addComponent(btnAtura)
                                .addGap(31, 31, 31)
                                .addComponent(btn)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblTitolPortafoli))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblSeleccionarPortafoli)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTitolPortafoli)
                            .addComponent(btnAfegirFitxerRepositori)
                            .addComponent(cmbPortafolis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAfegirFitxerPortafoli)
                            .addComponent(btnCrearPortafoli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarPortafoli)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(btnEliminarFitxerRepositori)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminarFitxerPortafoli))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(btnAddImatge)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAddAudio)))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPlayFitRepositori)
                            .addComponent(btnRecuperaDades))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPlayRepositori1)
                            .addComponent(btnGuardaDades))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPlayPortafoli)
                        .addGap(95, 95, 95)
                        .addComponent(chkCiclica)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnPlay)
                                    .addComponent(btnPause)
                                    .addComponent(btnAtura)
                                    .addComponent(btn))
                                .addGap(12, 12, 12))
                            .addComponent(chkReverse))
                        .addGap(26, 26, 26))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTitolPortafoliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTitolPortafoliKeyReleased
        btnCrearPortafoli.setEnabled(!txtTitolPortafoli.getText().equals(""));
    }//GEN-LAST:event_txtTitolPortafoliKeyReleased

    private void btnCrearPortafoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPortafoliActionPerformed
        try {
            controlador.addPortafoli(txtTitolPortafoli.getText());
            txtTitolPortafoli.setText("");
            btnCrearPortafoli.setEnabled(false);
            updateCmbPortafolis();
            updateEliminarPortafoli();
            updateLstPortafoli();
            
        }
        catch (ReproException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Error al crear Portafoli", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCrearPortafoliActionPerformed

    private void btnEliminarPortafoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPortafoliActionPerformed
        try {                                                  
            controlador.removePortafoli((String)cmbPortafolis.getSelectedItem());
            updateCmbPortafolis();
            updateEliminarPortafoli();
            updateLstPortafoli();
        }
        catch (ReproException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Error a l'eliminar Portafoli", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarPortafoliActionPerformed

    private void btnAfegirFitxerRepositoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfegirFitxerRepositoriActionPerformed
        FrmAfegirFitxerMultimedia2 jDAfegir = new FrmAfegirFitxerMultimedia2(this, true, controlador);
        
        jDAfegir.setTitle("Afegir Fitxer Multimedia");
        
        jDAfegir.pack();
        jDAfegir.setVisible(true);
        
        updateLstRepositori();
    }//GEN-LAST:event_btnAfegirFitxerRepositoriActionPerformed

    private void btnEliminarFitxerRepositoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFitxerRepositoriActionPerformed
        try {
            controlador.removeFitxer(lstRepositori.getSelectedIndex());
        }
        catch (ReproException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Error a l'eliminar Portafoli", JOptionPane.ERROR_MESSAGE);
        }

        updateLstRepositori();
        updateLstPortafoli();
    }//GEN-LAST:event_btnEliminarFitxerRepositoriActionPerformed

    private void lstRepositoriValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstRepositoriValueChanged
        updateBtnEliminarFitxerRepositori();
        updateBtnAfegirFitxerPortafoli();
    }//GEN-LAST:event_lstRepositoriValueChanged

    private void btnAfegirFitxerPortafoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfegirFitxerPortafoliActionPerformed
        try {
            controlador.addFitxer((String)cmbPortafolis.getSelectedItem(), lstRepositori.getSelectedIndex() + 1);
        }
        catch (ReproException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Error a l'afegir un fitxer a un Portafoli", JOptionPane.ERROR_MESSAGE);
        }
        updateLstPortafoli();
    }//GEN-LAST:event_btnAfegirFitxerPortafoliActionPerformed

    private void btnGuardaDadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardaDadesActionPerformed
        // TODO add your handling code here:
        File fitxer;
        //Creació del selector de fitxer
        JFileChooser seleccio = new JFileChooser();
        //Mostrem la finestra de dialeg
        //Resultat emmagazema una constant que indica si s’ha
        //seleccionat o no un fitxer
        int resultat = seleccio.showOpenDialog(this);
        //Assegurem que hi hagi un fitxer seleccionat
        if (resultat == JFileChooser.APPROVE_OPTION) {
            fitxer=seleccio.getSelectedFile();
        
            try{
                controlador.saveDades(fitxer.toString());
                JOptionPane.showMessageDialog(this, "Llista guardada exitosament");

            }
            catch(ReproException e){
                JOptionPane.showMessageDialog(this, e.toString(), "Error al guardar", JOptionPane.ERROR_MESSAGE);
                
            }
        }
    }//GEN-LAST:event_btnGuardaDadesActionPerformed

    private void btnRecuperaDadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecuperaDadesActionPerformed
        // TODO add your handling code here:
        File fitxer;
        //Creació del selector de fitxer
        JFileChooser seleccio = new JFileChooser();
        //Mostrem la finestra de dialeg
        //Resultat emmagazema una constant que indica si s’ha
        //seleccionat o no un fitxer
        int resultat = seleccio.showOpenDialog(this);
        //Assegurem que hi hagi un fitxer seleccionat
        if (resultat == JFileChooser.APPROVE_OPTION) {
            fitxer=seleccio.getSelectedFile();
        
            try{
                controlador.loadDades(fitxer.toString());
                JOptionPane.showMessageDialog(this, "Llista recuperada exitosament");

            }
            catch(ReproException e){
                JOptionPane.showMessageDialog(this, e.toString(), "Error al recuperar", JOptionPane.ERROR_MESSAGE);
                
            }
        }  
    }//GEN-LAST:event_btnRecuperaDadesActionPerformed

    private void btnAddImatgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddImatgeActionPerformed
        try {
            controlador.addImatge("/home/polg24/Desktop/bolas.png", "Pol", ".png", 1, 2);
            updateLstRepositori();
        }
        catch (ReproException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Error a l'afegir un fitxer a un Portafoli", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddImatgeActionPerformed

    private void btnAddAudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAudioActionPerformed
        try {
            controlador.addAudio("/home/polg24/Desktop/hope.mp3", "/home/polg24/Desktop/bolas.png", "Sho", "08642", 45678);
            updateLstRepositori();
        }
        catch (ReproException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Error a l'afegir un fitxer a un Portafoli", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddAudioActionPerformed

    private void cmbPortafolisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPortafolisItemStateChanged
        updateLstPortafoli();
    }//GEN-LAST:event_cmbPortafolisItemStateChanged

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AplicacioUB4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplicacioUB4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplicacioUB4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplicacioUB4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplicacioUB4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn;
    private javax.swing.JButton btnAddAudio;
    private javax.swing.JButton btnAddImatge;
    private javax.swing.JButton btnAfegirFitxerPortafoli;
    private javax.swing.JButton btnAfegirFitxerRepositori;
    private javax.swing.JButton btnAtura;
    private javax.swing.JButton btnCrearPortafoli;
    private javax.swing.JButton btnEliminarFitxerPortafoli;
    private javax.swing.JButton btnEliminarFitxerRepositori;
    private javax.swing.JButton btnEliminarPortafoli;
    private javax.swing.JButton btnGuardaDades;
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnPlayFitRepositori;
    private javax.swing.JButton btnPlayPortafoli;
    private javax.swing.JButton btnPlayRepositori1;
    private javax.swing.JButton btnRecuperaDades;
    private javax.swing.JCheckBox chkCiclica;
    private javax.swing.JCheckBox chkReverse;
    private javax.swing.JComboBox<String> cmbPortafolis;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblSeleccionarPortafoli;
    private javax.swing.JLabel lblTitolPortafoli;
    private javax.swing.JList<String> lstPortafoli;
    private javax.swing.JList<String> lstRepositori;
    private javax.swing.JTextField txtTitolPortafoli;
    // End of variables declaration//GEN-END:variables
}
