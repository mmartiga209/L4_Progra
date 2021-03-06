/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ub.info.prog2.GabaldonPolMartinezMarti.vista;
import java.awt.Color;
//import java.awt.Dimension;
import java.io.File;
//import java.awt.Toolkit;
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
        this.getContentPane().setBackground(new Color(165,235,235));
        
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
        lblControl = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmnMenu = new javax.swing.JMenu();
        optRecupera = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        optGuarda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(242, 242, 242));

        btnAfegirFitxerRepositori.setBackground(new java.awt.Color(170, 170, 170));
        btnAfegirFitxerRepositori.setText("Afegir un Fitxer al Repositori");
        btnAfegirFitxerRepositori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfegirFitxerRepositoriActionPerformed(evt);
            }
        });

        btnEliminarFitxerRepositori.setBackground(new java.awt.Color(170, 170, 170));
        btnEliminarFitxerRepositori.setText("Eliminar fitxer");
        btnEliminarFitxerRepositori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFitxerRepositoriActionPerformed(evt);
            }
        });

        btnCrearPortafoli.setBackground(new java.awt.Color(170, 170, 170));
        btnCrearPortafoli.setText("Crear Portafoli");
        btnCrearPortafoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPortafoliActionPerformed(evt);
            }
        });

        btnEliminarPortafoli.setBackground(new java.awt.Color(170, 170, 170));
        btnEliminarPortafoli.setText("Eliminar Portafoli");
        btnEliminarPortafoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPortafoliActionPerformed(evt);
            }
        });

        btnAfegirFitxerPortafoli.setBackground(new java.awt.Color(170, 170, 170));
        btnAfegirFitxerPortafoli.setText("Afegir fitxer al portafoli");
        btnAfegirFitxerPortafoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfegirFitxerPortafoliActionPerformed(evt);
            }
        });

        btnEliminarFitxerPortafoli.setBackground(new java.awt.Color(170, 170, 170));
        btnEliminarFitxerPortafoli.setText("Eliminar fitxer");
        btnEliminarFitxerPortafoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarFitxerPortafoliActionPerformed(evt);
            }
        });

        btnPlayFitxerRepositori.setBackground(new java.awt.Color(170, 170, 170));
        btnPlayFitxerRepositori.setText("Reproduir fitxer seleccionat");
        btnPlayFitxerRepositori.setToolTipText("");
        btnPlayFitxerRepositori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayFitxerRepositoriActionPerformed(evt);
            }
        });

        btnPlayPortafoli.setBackground(new java.awt.Color(170, 170, 170));
        btnPlayPortafoli.setText("Reproduir portafoli");
        btnPlayPortafoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayPortafoliActionPerformed(evt);
            }
        });

        btnPlayRepositori.setBackground(new java.awt.Color(170, 170, 170));
        btnPlayRepositori.setText("Reproduir repositori");
        btnPlayRepositori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayRepositoriActionPerformed(evt);
            }
        });

        chkCiclica.setText("Cíclica");
        chkCiclica.setActionCommand("Reproducció Cíclica");
        chkCiclica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCiclicaActionPerformed(evt);
            }
        });

        chkReverse.setText("Reverse");
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

        lblTitolPortafoli.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitolPortafoli.setText("Títol Portafoli:");
        lblTitolPortafoli.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblSeleccionarPortafoli.setText("Seleccionar Portafoli:");

        lblControl.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblControl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblControl.setText("CONTROL REPRODUCCIÓ");

        jmnMenu.setText("Arxiu");

        optRecupera.setText("Recupera dades des d'un fitxer");
        optRecupera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optRecuperaActionPerformed(evt);
            }
        });
        jmnMenu.add(optRecupera);
        jmnMenu.add(jSeparator1);

        optGuarda.setText("Guarda dades a un fitxer");
        optGuarda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optGuardaActionPerformed(evt);
            }
        });
        jmnMenu.add(optGuarda);

        jMenuBar1.add(jmnMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnAfegirFitxerRepositori, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnEliminarFitxerRepositori, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPlayFitxerRepositori, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnAfegirFitxerPortafoli, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(20, 20, 20)
                                                .addComponent(btnSalta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnPause, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnAtura, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(lblControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(chkReverse)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(chkCiclica)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminarFitxerPortafoli, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnEliminarPortafoli, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnPlayRepositori, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPlayPortafoli, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCrearPortafoli, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTitolPortafoli, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitolPortafoli, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbPortafolis, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(lblSeleccionarPortafoli, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSeleccionarPortafoli)
                                .addGap(52, 52, 52)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminarFitxerPortafoli)
                                .addGap(19, 19, 19))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTitolPortafoli)
                                    .addComponent(cmbPortafolis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)
                                .addComponent(txtTitolPortafoli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCrearPortafoli)
                                .addGap(111, 111, 111)
                                .addComponent(btnPlayRepositori)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPlayPortafoli)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(chkReverse)
                                    .addComponent(chkCiclica))
                                .addGap(26, 26, 26)
                                .addComponent(lblControl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnEliminarPortafoli)
                                .addComponent(btnSalta)
                                .addComponent(btnPlay)
                                .addComponent(btnAtura))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPause)
                                .addGap(2, 2, 2))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAfegirFitxerRepositori)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarFitxerRepositori)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAfegirFitxerPortafoli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPlayFitxerRepositori)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void optRecuperaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optRecuperaActionPerformed
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
    }//GEN-LAST:event_optRecuperaActionPerformed

    private void optGuardaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optGuardaActionPerformed
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
        
    }//GEN-LAST:event_optGuardaActionPerformed

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
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnPlayFitxerRepositori;
    private javax.swing.JButton btnPlayPortafoli;
    private javax.swing.JButton btnPlayRepositori;
    private javax.swing.JButton btnSalta;
    private javax.swing.JCheckBox chkCiclica;
    private javax.swing.JCheckBox chkReverse;
    private javax.swing.JComboBox<String> cmbPortafolis;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu jmnMenu;
    private javax.swing.JLabel lblControl;
    private javax.swing.JLabel lblSeleccionarPortafoli;
    private javax.swing.JLabel lblTitolPortafoli;
    private javax.swing.JList<String> lstPortafoli;
    private javax.swing.JList<String> lstRepositori;
    private javax.swing.JMenuItem optGuarda;
    private javax.swing.JMenuItem optRecupera;
    private javax.swing.JTextField txtTitolPortafoli;
    // End of variables declaration//GEN-END:variables
}
