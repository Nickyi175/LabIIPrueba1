/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package juegoahorcado;

//import Juego.InicializarPalabrasFijo;

public class Menu extends javax.swing.JFrame {
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        InicializarPalabras = new javax.swing.JButton();
        AhorcadoFijo = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        JugarAhorcadoAlAzar = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setForeground(new java.awt.Color(0, 102, 153));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT Ext Condensed Bold", 0, 80)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("AHORCADOS");

        InicializarPalabras.setBackground(new java.awt.Color(0, 153, 204));
        InicializarPalabras.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        InicializarPalabras.setForeground(java.awt.Color.white);
        InicializarPalabras.setText("Inicializar Palabras");
        InicializarPalabras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicializarPalabrasActionPerformed(evt);
            }
        });

        AhorcadoFijo.setBackground(new java.awt.Color(0, 153, 204));
        AhorcadoFijo.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        AhorcadoFijo.setForeground(java.awt.Color.white);
        AhorcadoFijo.setText("Jugar Ahorcado Fijo");
        AhorcadoFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AhorcadoFijoActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton1.setForeground(java.awt.Color.white);
        jButton1.setText("Agregar palabras para modo azar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        JugarAhorcadoAlAzar.setBackground(new java.awt.Color(0, 153, 204));
        JugarAhorcadoAlAzar.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        JugarAhorcadoAlAzar.setForeground(java.awt.Color.white);
        JugarAhorcadoAlAzar.setText("Jugar Ahorcado al Azar");
        JugarAhorcadoAlAzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugarAhorcadoAlAzarActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(0, 153, 204));
        salir.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        salir.setForeground(java.awt.Color.white);
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(salir)
                    .addComponent(JugarAhorcadoAlAzar, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(InicializarPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AhorcadoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(221, 221, 221))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {AhorcadoFijo, InicializarPalabras, JugarAhorcadoAlAzar, jButton1, salir});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(AhorcadoFijo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InicializarPalabras, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JugarAhorcadoAlAzar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salir)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {AhorcadoFijo, InicializarPalabras, JugarAhorcadoAlAzar, jButton1, salir});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AhorcadoFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AhorcadoFijoActionPerformed
        JuegoAhorcadoFijo AhorcadoFijoJuego= new JuegoAhorcadoFijo(InicializarPalabrasFijo.palabraDef);
        AhorcadoFijoJuego.jugar();
    }//GEN-LAST:event_AhorcadoFijoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void InicializarPalabrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicializarPalabrasActionPerformed
        InicializarPalabrasFijo inicializar = new InicializarPalabrasFijo();
        inicializar.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_InicializarPalabrasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AgregarPalabras agregarPalabras = new AgregarPalabras();
        agregarPalabras.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JugarAhorcadoAlAzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugarAhorcadoAlAzarActionPerformed
        JuegoAhorcadoAzar juegoAhorcadoAzar = new JuegoAhorcadoAzar(AdminPalabrasSecretas.getpalabrasSecretas());
        juegoAhorcadoAzar.jugar();
        System.out.println(AdminPalabrasSecretas.getpalabrasSecretas());
    }//GEN-LAST:event_JugarAhorcadoAlAzarActionPerformed
     
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AhorcadoFijo;
    private javax.swing.JButton InicializarPalabras;
    private javax.swing.JButton JugarAhorcadoAlAzar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
