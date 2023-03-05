/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventana;

import javax.swing.ImageIcon;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author aleja
 */
public class Ventana extends javax.swing.JFrame {
    DefaultMutableTreeNode raiz = new DefaultMutableTreeNode("Raiz");
    DefaultTreeModel modeloTree = new DefaultTreeModel(raiz);
    
    public Ventana() {
        cargarDatosModeloTree();
        initComponents();
    }
    
    private void cargarDatosModeloTree(){
        DefaultMutableTreeNode colores = new DefaultMutableTreeNode("Colores");
        DefaultMutableTreeNode colorRojo = new DefaultMutableTreeNode("Rojo");
        DefaultMutableTreeNode colorAzul = new DefaultMutableTreeNode("Azul");
        colores.add(colorRojo);
        colores.add(colorAzul);
        
        DefaultMutableTreeNode deportes = new DefaultMutableTreeNode("Deportes");
        DefaultMutableTreeNode futbol = new DefaultMutableTreeNode("Futbol");
        DefaultMutableTreeNode futsal = new DefaultMutableTreeNode("Futsal");
        DefaultMutableTreeNode futbolCompleto = new DefaultMutableTreeNode("Futbol Completo");
        futbol.add(futsal);
        futbol.add(futbolCompleto);
        
        DefaultMutableTreeNode baloncesto = new DefaultMutableTreeNode("Baloncesto");
        deportes.add(futbol);
        deportes.add(baloncesto);
        
        raiz.add(colores);
        raiz.add(deportes);
    }
    
    private void eventosNodoSeleccionado(DefaultMutableTreeNode nodoSeleccionado){
        if(nodoSeleccionado.toString().equals("Rojo")){
            etiquetaImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/colorRojo.png")));
        }
        else if(nodoSeleccionado.toString().equals("Azul")){
            etiquetaImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/colorAzul.jpeg")));
        }
        else if(nodoSeleccionado.toString().equals("Futsal")){
            etiquetaImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/futsal.jpeg")));
        }
        else if(nodoSeleccionado.toString().equals("Futbol Completo")){
            etiquetaImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/futbolCompleto.jpeg")));
        }
        else if(nodoSeleccionado.toString().equals("Baloncesto")){
            etiquetaImagen.setIcon(new ImageIcon(getClass().getResource("/imagenes/baloncesto.jpeg")));
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        arbol = new javax.swing.JTree();
        etiquetaImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        arbol.setModel(modeloTree);
        TreeSelectionListener oyenteTree = new TreeSelectionListener(){
            @Override
            public void valueChanged(TreeSelectionEvent e){
                DefaultMutableTreeNode nodoSeleccionado = (DefaultMutableTreeNode) arbol.getLastSelectedPathComponent();
                eventosNodoSeleccionado(nodoSeleccionado);
            }
        };

        arbol.getSelectionModel().addTreeSelectionListener(oyenteTree);
        jScrollPane1.setViewportView(arbol);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(etiquetaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(etiquetaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree arbol;
    private javax.swing.JLabel etiquetaImagen;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
