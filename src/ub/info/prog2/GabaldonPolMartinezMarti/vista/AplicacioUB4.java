/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ub.info.prog2.GabaldonPolMartinezMarti.vista;

/**
 *
 * @author polg24
 */
public class AplicacioUB4 extends javax.swing.JFrame {

    /**
     * Creates new form AplicacioUB4
     */
    public AplicacioUB4() {
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

        btnAfegirFitxerRepositori = new javax.swing.JButton();
        btnEliminarFitxer = new javax.swing.JButton();
        btnCrearPortafoli = new javax.swing.JButton();
        btnEliminarPortafoli = new javax.swing.JButton();
        btnAfegirFitxerPortafoli = new javax.swing.JButton();
        btnEliminarFitxerPortafoli = new javax.swing.JButton();
        btnPlayFitRepositori = new javax.swing.JButton();
        btnPlayPortafoli = new javax.swing.JButton();
        btnPlayRepositori1 = new javax.swing.JButton();
        chkCiclica = new javax.swing.JCheckBox();
        chkReverse = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(242, 241, 241));

        btnAfegirFitxerRepositori.setText("Afegir un Fitxer al Repositori");

        btnEliminarFitxer.setText("Eliminar Fitxer seleccionat del Repositori");

        btnCrearPortafoli.setText("Crear Portafoli");

        btnEliminarPortafoli.setText("Eliminar Portafoli");

        btnAfegirFitxerPortafoli.setText("Afegir un Fitxer a un Portafoli");

        btnEliminarFitxerPortafoli.setText("Eliminar Fitxer seleccionat d'un Portafoli");

        btnPlayFitRepositori.setText("Reproduir el Fitxer seleccionat del Repositori");
        btnPlayFitRepositori.setToolTipText("");

        btnPlayPortafoli.setText("Reproduir el Portafoli seleccionat");

        btnPlayRepositori1.setText("Reproduir el Repositori");

        chkCiclica.setText("Reproduccio Cíclica");

        chkReverse.setText("Reproduccio Reverse");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAfegirFitxerRepositori)
                    .addComponent(btnAfegirFitxerPortafoli)
                    .addComponent(btnCrearPortafoli)
                    .addComponent(btnEliminarPortafoli)
                    .addComponent(btnEliminarFitxerPortafoli)
                    .addComponent(btnEliminarFitxer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPlayFitRepositori)
                    .addComponent(btnPlayPortafoli)
                    .addComponent(btnPlayRepositori1)
                    .addComponent(chkCiclica)
                    .addComponent(chkReverse))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAfegirFitxerRepositori)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAfegirFitxerPortafoli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCrearPortafoli))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnPlayFitRepositori)
                        .addGap(18, 18, 18)
                        .addComponent(btnPlayRepositori1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarPortafoli)
                    .addComponent(btnPlayPortafoli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarFitxer)
                    .addComponent(chkCiclica))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarFitxerPortafoli)
                    .addComponent(chkReverse))
                .addContainerGap(280, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
    private javax.swing.JButton btnCrearPortafoli;
    private javax.swing.JButton btnEliminarFitxer;
    private javax.swing.JButton btnEliminarFitxerPortafoli;
    private javax.swing.JButton btnEliminarPortafoli;
    private javax.swing.JButton btnPlayFitRepositori;
    private javax.swing.JButton btnPlayPortafoli;
    private javax.swing.JButton btnPlayRepositori1;
    private javax.swing.JCheckBox chkCiclica;
    private javax.swing.JCheckBox chkReverse;
    // End of variables declaration//GEN-END:variables
}
