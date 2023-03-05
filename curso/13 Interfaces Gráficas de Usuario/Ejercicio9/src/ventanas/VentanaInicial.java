/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

/**
 *
 * @author aleja
 */
public class VentanaInicial extends javax.swing.JFrame {
    private String usuario1;
    private String usuario2;
    
    public VentanaInicial() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        etiquetaImagen = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        etiquetaNombre1 = new javax.swing.JLabel();
        cajaUsuario1 = new javax.swing.JTextField();
        etiquetaNombre2 = new javax.swing.JLabel();
        cajaUsuario2 = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        etiquetaMuestra1 = new javax.swing.JLabel();
        etiquetaMuestra2 = new javax.swing.JLabel();
        botonComenzar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panel.setBackground(new java.awt.Color(255, 255, 255));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3EnRaya.gif"))); // NOI18N
        panel.add(etiquetaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 264, -1, -1));

        titulo.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("Tres en Raya");
        panel.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 605, -1));

        etiquetaNombre1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etiquetaNombre1.setText("Digite el nombre del Usuario1: ");
        panel.add(etiquetaNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 106, -1, -1));

        cajaUsuario1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        panel.add(cajaUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 273, 30));

        etiquetaNombre2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        etiquetaNombre2.setText("Digite el nombre del Usuario2: ");
        panel.add(etiquetaNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 164, -1, -1));

        cajaUsuario2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        panel.add(cajaUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 273, 30));

        botonGuardar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        botonGuardar.setText("Guardar");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        panel.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 227, -1, -1));

        etiquetaMuestra1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        panel.add(etiquetaMuestra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        etiquetaMuestra2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        panel.add(etiquetaMuestra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        botonComenzar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botonComenzar.setText("Comenzar Juego");
        botonComenzar.setVisible(false);
        botonComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComenzarActionPerformed(evt);
            }
        });
        panel.add(botonComenzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        usuario1 = cajaUsuario1.getText();
        usuario2 = cajaUsuario2.getText();
        
        botonGuardar.setVisible(false);
        
        etiquetaMuestra1.setText(usuario1+" jugará primero, su ficha es: X");
        etiquetaMuestra2.setText(usuario2+" su ficha es: O");
        
        botonComenzar.setVisible(true);
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonComenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComenzarActionPerformed
        VentanaPrincipal ventanaP = new VentanaPrincipal(usuario1,usuario2);
        ventanaP.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_botonComenzarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonComenzar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextField cajaUsuario1;
    private javax.swing.JTextField cajaUsuario2;
    private javax.swing.JLabel etiquetaImagen;
    private javax.swing.JLabel etiquetaMuestra1;
    private javax.swing.JLabel etiquetaMuestra2;
    private javax.swing.JLabel etiquetaNombre1;
    private javax.swing.JLabel etiquetaNombre2;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
