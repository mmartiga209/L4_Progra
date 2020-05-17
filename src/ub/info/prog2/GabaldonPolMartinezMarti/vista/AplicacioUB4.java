/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ub.info.prog2.GabaldonPolMartinezMarti.vista;
import java.awt.Color;
import java.awt.Dimension;
import java.io.File;
import java.awt.Toolkit;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import ub.info.prog2.GabaldonPolMartinezMarti.controlador.Controlador;
import ub.info.prog2.GabaldonPolMartinezMarti.model.FitxerMultimedia;
import ub.info.prog2.utils.ReproException;
import javax.swing.JOptionPane;
import java.util.Iterator;
import javax.swing.JFileChooser;
import javax.swing.ListSelectionModel;
/**
 *
 * @author MartinezMartiGabaldonPol
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
        btnPlayFitxerRepositori.setEnabled(false);
        btnPlayRepositori.setEnabled(false);
        btnPlayPortafoli.setEnabled(false);
        btnEliminarFitxerPortafoli.setEnabled(false);
        lstRepositori.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        //Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        //this.setPreferredSize(new Dimension(screenSize.width * 7 / 8, screenSize.height * 7/8));
        this.getContentPane().setBackground(new Color(74,199,223));
    }
    
    /**
     * Actualitza el desplegable de portafolis
     */
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
    
    /**
     * Activa o desactiva el botó d'eliminar un portafoli
     */
    private void updateEliminarPortafoli() {
        btnEliminarPortafoli.setEnabled(controlador.getSizePortafolis() != 0);
    }
    
    /**
     * Activa o desactiva el botó d'eliminar un fitxer del repositori segons si el repositori està buit o no
     */
    private void updateBtnEliminarFitxerRepositori() {
        btnEliminarFitxerRepositori.setEnabled(!lstRepositori.isSelectionEmpty());
    }
    
    /**
     * Activa o desactiva el botó d'eliminar un fitxer d'un portafoli segons si el portafoli està buit o no
     */
    private void updateBtnEliminarFitxerPortafoli(){
        btnEliminarFitxerPortafoli.setEnabled(!lstPortafoli.isSelectionEmpty());
    }
    
    /**
     * Actualitza el botó d'afegir un fitxer a un portafoli segons si hi ha un fitxer del repositori seleccionat
     */
    private void updateBtnAfegirFitxerPortafoli() {
        btnAfegirFitxerPortafoli.setEnabled(!lstRepositori.isSelectionEmpty() && cmbPortafolis.getItemCount() != 0);
    }
    
    /**
     * Actualitza la llista de fitxers del repositori
     */
    private void updateLstRepositori() {
        DefaultListModel<String> model = new DefaultListModel<>();
        int size = controlador.getSizeRepositori();
        for (int i = 0; i < size; i++) {
            model.addElement(((FitxerMultimedia)controlador.getAtRepositori(i)).resum());
        }
        lstRepositori.setModel(model);
    }
    
    /**
     * Actualitza la llista de fitxers del portafoli seleccionat
     */
    private void updateLstPortafoli() {
        DefaultListModel<String> model = new DefaultListModel<>();
        int size = controlador.getSizePortafoli((String)cmbPortafolis.getSelectedItem());
        for (int i = 0; i < size; i++) {
            model.addElement(((FitxerMultimedia)controlador.getAtPortafoli((String)cmbPortafolis.getSelectedItem(), i)).resum());
        }
        lstPortafoli.setModel(model);
    }
    
    /**
     * Activa o desactiva el botó de reproduir un fitxer si s'està o no seleccionant un
     */
    private void updateBtnPlayFitxerRepositori(){
        btnPlayFitxerRepositori.setEnabled(!lstRepositori.isSelectionEmpty());
    }
    
    /**
     * Activa o desactiva el botó de reproduir un portafoli segons si n'hi han o no
     */
    private void updateBtnPlayPortafoli(){
        btnPlayPortafoli.setEnabled(controlador.getSizePortafolis() != 0);
        
    }
    
    /**
     * Activa o desactiva el botó de reproduir el repositori depenent si hi han fitxers
     */
    private void updateBtnPlayRepositori(){
        btnPlayRepositori.setEnabled(controlador.getSizeRepositori()!= 0);
    }
    
    /**
     * Actualitza si hi ha marcada o no la reproducció cíclica
     */
    private void updateChkCiclica(){
        chkCiclica.setSelected(controlador.getCiclica());
    }
    
    /**
     * Actualitza si hi ha marcada o no la reproducció reverse
     */
    private void updateChkReverse(){
        chkReverse.setSelected(controlador.getReverse());
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
        btnPlayFitxerRepositori = new javax.swing.JButton();
        btnPlayPortafoli = new javax.swing.JButton();
        btnPlayRepositori = new javax.swing.JButton();
        chkCiclica = new javax.swing.JCheckBox();
        chkReverse = new javax.swing.JCheckBox();
        btnPlay = new javax.swing.JButton();
        btnPause = new javax.swing.JButton();
        btnAtura = new javax.swing.JButton();
        btnSalta = new javax.swing.JButton();
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
        btnMarti = new javax.swing.JButton();
        btnPol = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(242, 242, 242));

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
        btnEliminarFitxerPortafoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFitxerPortafoliActionPerformed(evt);
            }
        });

        btnPlayFitxerRepositori.setText("Reproduir el Fitxer seleccionat del Repositori");
        btnPlayFitxerRepositori.setToolTipText("");
        btnPlayFitxerRepositori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayFitxerRepositoriActionPerformed(evt);
            }
        });

        btnPlayPortafoli.setText("Reproduir el Portafoli seleccionat");
        btnPlayPortafoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayPortafoliActionPerformed(evt);
            }
        });

        btnPlayRepositori.setText("Reproduir el Repositori");
        btnPlayRepositori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayRepositoriActionPerformed(evt);
            }
        });

        chkCiclica.setText("Reproduccio Cíclica");
        chkCiclica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCiclicaActionPerformed(evt);
            }
        });

        chkReverse.setText("Reproduccio Reverse");
        chkReverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkReverseActionPerformed(evt);
            }
        });

        btnPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ub/info/prog2/GabaldonPolMartinezMarti/vista/play.png"))); // NOI18N
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });

        btnPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ub/info/prog2/GabaldonPolMartinezMarti/vista/pause.png"))); // NOI18N
        btnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseActionPerformed(evt);
            }
        });

        btnAtura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ub/info/prog2/GabaldonPolMartinezMarti/vista/stop.png"))); // NOI18N
        btnAtura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAturaActionPerformed(evt);
            }
        });

        btnSalta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ub/info/prog2/GabaldonPolMartinezMarti/vista/salta.png"))); // NOI18N
        btnSalta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaltaActionPerformed(evt);
            }
        });

        lstRepositori.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Repositori", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        lstRepositori.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                lstRepositoriComponentAdded(evt);
            }
        });
        lstRepositori.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstRepositoriValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstRepositori);

        lstPortafoli.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Portafoli", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 16))); // NOI18N
        lstPortafoli.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPortafoliValueChanged(evt);
            }
        });
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

        btnMarti.setText("Boto Marti");
        btnMarti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMartiActionPerformed(evt);
            }
        });

        btnPol.setText("Boto Pol");
        btnPol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPolActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnPlay)
                        .addGap(18, 18, 18)
                        .addComponent(btnPause)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminarFitxerRepositori)
                                    .addComponent(btnEliminarFitxerPortafoli)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnAtura)
                                                .addGap(26, 26, 26)
                                                .addComponent(btnSalta))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(btnRecuperaDades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnGuardaDades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnPlayFitxerRepositori)
                                            .addComponent(btnPlayRepositori)
                                            .addComponent(btnPlayPortafoli)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addComponent(chkCiclica))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(lblSeleccionarPortafoli))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAfegirFitxerPortafoli)
                                    .addComponent(btnAfegirFitxerRepositori))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(txtTitolPortafoli, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnCrearPortafoli, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(373, 373, 373)
                                .addComponent(chkReverse))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(347, 347, 347)
                                .addComponent(lblTitolPortafoli))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cmbPortafolis, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(188, 188, 188))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnMarti)
                            .addComponent(btnEliminarPortafoli)
                            .addComponent(btnPol))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAtura)
                            .addComponent(btnSalta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRecuperaDades))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGuardaDades)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblTitolPortafoli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTitolPortafoli)
                    .addComponent(btnAfegirFitxerRepositori))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAfegirFitxerPortafoli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCrearPortafoli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(btnEliminarPortafoli)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMarti)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnEliminarFitxerRepositori)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEliminarFitxerPortafoli))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(lblSeleccionarPortafoli)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPol)
                .addGap(18, 18, 18)
                .addComponent(cmbPortafolis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(chkReverse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlayFitxerRepositori)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPlay)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnPlayRepositori)
                        .addGap(7, 7, 7)
                        .addComponent(btnPlayPortafoli)
                        .addGap(18, 18, 18)
                        .addComponent(chkCiclica))
                    .addComponent(btnPause))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Ordena activar el botó de crear portafoli
     * @param evt event
     */
    private void txtTitolPortafoliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTitolPortafoliKeyReleased
        btnCrearPortafoli.setEnabled(!txtTitolPortafoli.getText().equals(""));
    }//GEN-LAST:event_txtTitolPortafoliKeyReleased

    /**
     * Assigna la funció de crear un portafoli del controlador al botó corresponent
     * @param evt event
     */
    private void btnCrearPortafoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPortafoliActionPerformed
        try {
            controlador.addPortafoli(txtTitolPortafoli.getText());
            txtTitolPortafoli.setText("");
            btnCrearPortafoli.setEnabled(false);
            updateCmbPortafolis();
            updateEliminarPortafoli();
            updateBtnPlayPortafoli();
            updateLstPortafoli();
            
        }
        catch (ReproException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Error al crear Portafoli", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnCrearPortafoliActionPerformed

    /**
     * Crida el mètode corresponent de controlador que elimina un protafoli seleccionat
     * @param evt event
     */
    private void btnEliminarPortafoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPortafoliActionPerformed
        try {
            controlador.removePortafoli((String)cmbPortafolis.getSelectedItem());
            updateCmbPortafolis();
            updateEliminarPortafoli();
            updateBtnPlayPortafoli();
            updateLstPortafoli();
        }
        catch (ReproException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Error a l'eliminar Portafoli", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarPortafoliActionPerformed

    /**
     * Crida el mètode corresponent de controlador que afegeix un fitxer al repositori
     * @param evt event
     */
    private void btnAfegirFitxerRepositoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfegirFitxerRepositoriActionPerformed
        FrmAfegirFitxerMultimedia2 jDAfegir = new FrmAfegirFitxerMultimedia2(this, true, controlador);
        
        jDAfegir.setTitle("Afegir Fitxer Multimedia");
        
        jDAfegir.pack();
        jDAfegir.setVisible(true);
        
        updateLstRepositori();
        updateBtnPlayRepositori();

    }//GEN-LAST:event_btnAfegirFitxerRepositoriActionPerformed

    /**
     * Crida el mètode corresponent de controlador que elimina un fitxer del repositori
     * @param evt event
     */
    private void btnEliminarFitxerRepositoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFitxerRepositoriActionPerformed
        try {
            controlador.removeFitxer(lstRepositori.getSelectedIndex());
        }
        catch (ReproException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Error a l'eliminar Portafoli", JOptionPane.ERROR_MESSAGE);
        }

        updateLstRepositori();
        updateLstPortafoli();
        updateBtnPlayRepositori();

    }//GEN-LAST:event_btnEliminarFitxerRepositoriActionPerformed

    /**
     * Actualitza els botons en cas que la llista de fitxers del repositori canviï
     * @param evt event
     */
    private void lstRepositoriValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstRepositoriValueChanged
        updateBtnEliminarFitxerRepositori();
        updateBtnPlayFitxerRepositori();
        updateBtnAfegirFitxerPortafoli();
    }//GEN-LAST:event_lstRepositoriValueChanged

    /**
     * Crida el mètode corresponent de controlador que afegeix un fitxer a un portafoli     
     * @param evt event
     */
    private void btnAfegirFitxerPortafoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfegirFitxerPortafoliActionPerformed
        try {
            controlador.addFitxer((String)cmbPortafolis.getSelectedItem(), lstRepositori.getSelectedIndex() + 1);
        }
        catch (ReproException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Error a l'afegir un fitxer a un Portafoli", JOptionPane.ERROR_MESSAGE);
        }
        updateLstPortafoli();
    }//GEN-LAST:event_btnAfegirFitxerPortafoliActionPerformed

    /**
     * Crida el mètode corresponent de controlador que guarda les dades a un fitxer d'elecció
     * @param evt event
     */
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

    /**
     * Crida el mètode corresponent de controlador que recupera les dades des d'un fitxer triat
     * @param evt event
     */
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
                updateLstRepositori();
                updateCmbPortafolis();
                updateLstPortafoli();                        
                updateEliminarPortafoli();
                updateBtnPlayPortafoli();
                updateBtnEliminarFitxerRepositori();
                updateBtnEliminarFitxerPortafoli();
                updateBtnAfegirFitxerPortafoli();
                updateBtnPlayRepositori();
                updateChkCiclica();
                updateChkReverse();
                
                JOptionPane.showMessageDialog(this, "Llista recuperada exitosament");
                

            }
            catch(ReproException e){
                JOptionPane.showMessageDialog(this, e.toString(), "Error al recuperar", JOptionPane.ERROR_MESSAGE);
                
            }
        }  
    }//GEN-LAST:event_btnRecuperaDadesActionPerformed

    private void btnMartiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMartiActionPerformed
        try {
            controlador.addImatge("C:\\Users\\marti\\Desktop\\Reproductor\\5e88a0ba2500003903058a57.jpeg", "Bad Bunny", ".jpeg", 1, 2);
            controlador.addImatge("C:\\Users\\marti\\Desktop\\Reproductor\\1661714716010501_c5_720x720.jpeg", "Angels", ".png", 1, 2);
            controlador.addImatge("C:\\Users\\marti\\Desktop\\Reproductor\\descarga.jpg", "C Tangana", ".png", 1, 2);
            controlador.addAudio("C:\\Users\\marti\\Desktop\\Reproductor\\Bad Bunny - A Tu Merced (Letra ) (1).mp3", "C:\\Users\\marti\\Desktop\\Reproductor\\5e88a0ba2500003903058a57.jpeg", "Bad Bunny", "08642", 45678);
            controlador.addAudio("C:\\Users\\marti\\Desktop\\Reproductor\\C. Tangana - Antes de morirme feat. Rosalía (Video Oficial).mp3", "C:\\Users\\marti\\Desktop\\Reproductor\\descarga.jpg", "C Tangana", "08642", 45678);
            controlador.addAudio("C:\\Users\\marti\\Desktop\\Reproductor\\C. Tangana - De Pie (Audio) (GOEAR.ORG).mp3", "C:\\Users\\marti\\Desktop\\Reproductor\\descarga.jpg", "C Tangana", "08642", 45678);
            controlador.addAudio("C:\\Users\\marti\\Desktop\\Reproductor\\C. Tangana - Llorando en la Limo (Video Oficial).mp3", "C:\\Users\\marti\\Desktop\\Reproductor\\descarga.jpg", "C Tangana", "08642", 45678);
            controlador.addAudio("C:\\Users\\marti\\Desktop\\Reproductor\\James Blake - Barefoot In The Park (feat. Rosalía).mp3", "C:\\Users\\marti\\Desktop\\Reproductor\\James_Blake_630.jpg", "Rosalia", "08642", 45678);
            controlador.addAudio("C:\\Users\\marti\\Desktop\\Reproductor\\Yves_Tumor_-_Gospel_For_A_New_Centurycom.mp3", "C:\\Users\\marti\\Desktop\\Reproductor\\James_Blake_630.jpg", "Yves", "08642", 45678);
            updateLstRepositori();
            updateBtnPlayRepositori();

        }
        catch (ReproException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Error a l'afegir un fitxer a un Portafoli", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnMartiActionPerformed

    private void btnPolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPolActionPerformed
        try {
            controlador.addAudio("/home/polg24/Desktop/did_it_again.mp3", "/home/polg24/Desktop/lil_teccasso.jpeg", "Sho", "08642", 45678);
            controlador.addAudio("/home/polg24/Desktop/these_days.mp3", "/home/polg24/Desktop/these_days.jpeg", "Sho", "08642", 45678);
            controlador.addAudio("/home/polg24/Desktop/hope.mp3", "/home/polg24/Desktop/x.jpg", "Sho", "08642", 45678);
            controlador.addAudio("/home/polg24/Desktop/did_it_again.mp3", "/home/polg24/Desktop/lil_teccasso.jpeg", "Uno otro", "08642", 45678);
            controlador.addAudio("/home/polg24/Desktop/these_days.mp3", "/home/polg24/Desktop/these_days.jpeg", "Bella chi", "08642", 45678);
            controlador.addAudio("/home/polg24/Desktop/hope.mp3", "/home/polg24/Desktop/x.jpg", "una verga salvahe", "08642", 45678);
            controlador.addImatge("/home/polg24/Desktop/Potato.jpg", "Sho", "un codec", 23, 45);
            controlador.addImatge("/home/polg24/Desktop/bolas.png", "una verga salvahe", "un codec", 23, 455678);
            
            
            updateLstRepositori();
            updateBtnPlayRepositori();

        }
        catch (ReproException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Error a l'afegir un fitxer a un Portafoli", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnPolActionPerformed

    /**
     * Actualitza els fitxers del portafoli si es selecciona un altre
     * @param evt event
     */
    private void cmbPortafolisItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPortafolisItemStateChanged
        updateLstPortafoli();
    }//GEN-LAST:event_cmbPortafolisItemStateChanged

    /**
     * Crida el mètode corresponent de controlador que reprodueix un fitxer del repositori
     * @param evt event
     */
    private void btnPlayFitxerRepositoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayFitxerRepositoriActionPerformed
        // TODO add your handling code here:
        try {
            controlador.playFitxer(lstRepositori.getSelectedIndex()+1);

        }
        catch (ReproException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Error al reproduir el fitxer", JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_btnPlayFitxerRepositoriActionPerformed

    /**
     * Crida el mètode corresponent de controlador que reprodueix el repositori sencer
     * @param evt event
     */
    private void btnPlayRepositoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayRepositoriActionPerformed
        // TODO add your handling code here:
        try{
            controlador.playLlista();
        }
        catch(ReproException e){
            JOptionPane.showMessageDialog(this, e.toString(), "Error al reproduir", JOptionPane.ERROR_MESSAGE);

        }        
    }//GEN-LAST:event_btnPlayRepositoriActionPerformed

    /**
     * Crida el mètode corresponent de controlador que elimina un fitxer d'un portafoli
     * @param evt event
     */
    private void btnEliminarFitxerPortafoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarFitxerPortafoliActionPerformed
        // TODO add your handling code here:
        try {
            controlador.removeFitxer((String)cmbPortafolis.getSelectedItem(),lstPortafoli.getSelectedIndex());
        }
        catch (ReproException e) {
            JOptionPane.showMessageDialog(this, e.toString(), "Error a l'eliminar Portafoli", JOptionPane.ERROR_MESSAGE);
        }

        updateLstRepositori();
        updateLstPortafoli();        
    }//GEN-LAST:event_btnEliminarFitxerPortafoliActionPerformed

    /**
     * Actualitza el botó d'elimianr fitxers del portafoli si es selecciona un fitxer
     * @param evt event
     */
    private void lstPortafoliValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPortafoliValueChanged
        // TODO add your handling code here:
        updateBtnEliminarFitxerPortafoli();
    }//GEN-LAST:event_lstPortafoliValueChanged

    /**
     * Crida el mètode corresponent de controlador que reprodueix el portafoli seleccionat
     * @param evt event
     */
    private void btnPlayPortafoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayPortafoliActionPerformed
        // TODO add your handling code here:
        try{
            controlador.playLlista((String)cmbPortafolis.getSelectedItem());
        }
        catch(ReproException e){
            JOptionPane.showMessageDialog(this, e.toString(), "Error al reproduir", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnPlayPortafoliActionPerformed

    /**
     * Crida el mètode corresponent de controlador que segueix amb la reproducció
     * @param evt event
     */
    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        // TODO add your handling code here:
        try{
            controlador.resumeReproduccio();
        }
        catch(ReproException e){
            JOptionPane.showMessageDialog(this, e.toString(), "Alerta", JOptionPane.WARNING_MESSAGE);            
        }        
    }//GEN-LAST:event_btnPlayActionPerformed

    /**
     * Crida el mètode corresponent de controlador que pausa la reproducció
     * @param evt event
     */
    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        // TODO add your handling code here:
        try{
            controlador.pauseReproduccio();
        }
        catch(ReproException e){
            JOptionPane.showMessageDialog(this, e.toString(), "Alerta", JOptionPane.WARNING_MESSAGE);            
        }        
    }//GEN-LAST:event_btnPauseActionPerformed

    /**
     * Crida el mètode corresponent de controlador que atura la reproducció en curs
     * @param evt event
     */
    private void btnAturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAturaActionPerformed
        // TODO add your handling code here:
        try{
            controlador.stopReproduccio();
        }
        catch(ReproException e){
            JOptionPane.showMessageDialog(this, e.toString(), "Alerta", JOptionPane.WARNING_MESSAGE);            
        }  
    }//GEN-LAST:event_btnAturaActionPerformed

    /**
     * Crida el mètode corresponent de controlador que fa salta al següent fitxer a reproduir
     * @param evt event
     */
    private void btnSaltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaltaActionPerformed
        // TODO add your handling code here:
        try{
            controlador.jumpReproduccio();
        }
        catch(ReproException e){
            JOptionPane.showMessageDialog(this, e.toString(), "Alerta", JOptionPane.WARNING_MESSAGE);            
        }  
    }//GEN-LAST:event_btnSaltaActionPerformed

    private void lstRepositoriComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_lstRepositoriComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lstRepositoriComponentAdded

    /**
     * Crida el mètode corresponent de controlador que canvia la reproducció de cíclica a no cíclica o viceversa
     * @param evt event
     */
    private void chkCiclicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCiclicaActionPerformed
        // TODO add your handling code here:
        controlador.changeCiclica();
    }//GEN-LAST:event_chkCiclicaActionPerformed

    /**
     * Crida el mètode corresponent de controlador que canvia el mode de reproducció reverse a no reverse o viceversa
     * @param evt event
     */
    private void chkReverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkReverseActionPerformed
        // TODO add your handling code here:
        controlador.changeReverse();
        
    }//GEN-LAST:event_chkReverseActionPerformed

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
    private javax.swing.JButton btnAfegirFitxerPortafoli;
    private javax.swing.JButton btnAfegirFitxerRepositori;
    private javax.swing.JButton btnAtura;
    private javax.swing.JButton btnCrearPortafoli;
    private javax.swing.JButton btnEliminarFitxerPortafoli;
    private javax.swing.JButton btnEliminarFitxerRepositori;
    private javax.swing.JButton btnEliminarPortafoli;
    private javax.swing.JButton btnGuardaDades;
    private javax.swing.JButton btnMarti;
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnPlayFitxerRepositori;
    private javax.swing.JButton btnPlayPortafoli;
    private javax.swing.JButton btnPlayRepositori;
    private javax.swing.JButton btnPol;
    private javax.swing.JButton btnRecuperaDades;
    private javax.swing.JButton btnSalta;
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
