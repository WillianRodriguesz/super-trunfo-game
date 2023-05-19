package TrunfoGame;

import javax.swing.ImageIcon;

/**
 * @author arthur souza - 19102583
 * @author william rodrigues - 19100835
 */
public class Final extends javax.swing.JFrame {

    public Final(Jogador vencedor) {
        initComponents();
        System.out.println("nome"+vencedor.nome());
        nomeJogador.setText(vencedor.nome());
        fundoFinal();     
    }
    private void fundoFinal() {
        //ADICIONA O FUNDO DA ARENA //
        ImageIcon icon = new ImageIcon("src/img/fundoGanhador.png");
        icon.setImage(icon.getImage().getScaledInstance(1260, 709, 1));
        layoutFinal.setIcon(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeJogador = new javax.swing.JLabel();
        mensagemParabens = new javax.swing.JLabel();
        mensagem = new javax.swing.JLabel();
        btnCreditos = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        creditos = new javax.swing.JLabel();
        layoutFinal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nomeJogador.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        nomeJogador.setForeground(new java.awt.Color(204, 0, 51));
        getContentPane().add(nomeJogador, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 250, 40));

        mensagemParabens.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        mensagemParabens.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensagemParabens.setText("Parabéns");
        getContentPane().add(mensagemParabens, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 290, 80));

        mensagem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mensagem.setText("DERROTOU SEU ADVERSÁRIO E GANHOU A PARTIDA!");
        getContentPane().add(mensagem, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 350, -1));

        btnCreditos.setBackground(new java.awt.Color(0, 0, 0));
        btnCreditos.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        btnCreditos.setForeground(new java.awt.Color(255, 255, 255));
        btnCreditos.setText("CREDITOS");
        btnCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreditosActionPerformed(evt);
            }
        });
        getContentPane().add(btnCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, 120, 30));

        btnFechar.setBackground(new java.awt.Color(0, 0, 0));
        btnFechar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFechar.setForeground(new java.awt.Color(255, 255, 255));
        btnFechar.setText("SAIR");
        btnFechar.setToolTipText("");
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });
        getContentPane().add(btnFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 480, 90, 30));

        btnMenu.setBackground(new java.awt.Color(0, 0, 0));
        btnMenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setText("MENU");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 480, -1, 30));
        getContentPane().add(creditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 1170, 700));

        layoutFinal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(layoutFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreditosActionPerformed
        mensagemParabens.setVisible(false);
        mensagem.setVisible(false);
        nomeJogador.setVisible(false);
        
        ImageIcon Fcredito = new ImageIcon("src/img/fundocreditos.png");
        Fcredito.setImage(Fcredito.getImage().getScaledInstance(1260, 709, 1));
        layoutFinal.setIcon(Fcredito);
        
        ImageIcon credito = new ImageIcon("src/img/creditos.png");
        credito.setImage(credito.getImage().getScaledInstance(1260, 709, 1));
        creditos.setIcon(credito);
        
    }//GEN-LAST:event_btnCreditosActionPerformed

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
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Final.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreditos;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel creditos;
    private javax.swing.JLabel layoutFinal;
    private javax.swing.JLabel mensagem;
    private javax.swing.JLabel mensagemParabens;
    private javax.swing.JLabel nomeJogador;
    // End of variables declaration//GEN-END:variables
}
