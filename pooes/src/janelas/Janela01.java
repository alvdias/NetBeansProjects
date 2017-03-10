package janelas;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author diego
 */
public class Janela01 extends javax.swing.JFrame {

    /**
     * Creates new form Janela01
     */
    public Janela01() {
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

        buttonGroupBebidas = new javax.swing.ButtonGroup();
        jButtonCancelar = new javax.swing.JButton();
        jLabelNome = new javax.swing.JLabel();
        jTextNome = new javax.swing.JTextField();
        jLabelIdade = new javax.swing.JLabel();
        jSpinnerIdade = new javax.swing.JSpinner();
        jCheckBoxSobremesa = new javax.swing.JCheckBox();
        jCheckBoxSalada = new javax.swing.JCheckBox();
        jCheckBoxBebida = new javax.swing.JCheckBox();
        jCheckBoxPratoDia = new javax.swing.JCheckBox();
        jButtonPedir = new javax.swing.JButton();
        jRadioButtonSuco = new javax.swing.JRadioButton();
        jRadioButtonAgua = new javax.swing.JRadioButton();
        jRadioButtonRefrigerante = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCancelarMouseClicked(evt);
            }
        });

        jLabelNome.setText("Nome");

        jLabelIdade.setText("Idade");

        jSpinnerIdade.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinnerIdade.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinnerIdadeStateChanged(evt);
            }
        });

        jCheckBoxSobremesa.setText("Sobremesa");

        jCheckBoxSalada.setText("Salada");

        jCheckBoxBebida.setText("Bebida");
        jCheckBoxBebida.setEnabled(false);

        jCheckBoxPratoDia.setText("Prato do Dia");

        jButtonPedir.setText("Pedir");
        jButtonPedir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonPedirMouseClicked(evt);
            }
        });

        buttonGroupBebidas.add(jRadioButtonSuco);
        jRadioButtonSuco.setText("Suco");

        buttonGroupBebidas.add(jRadioButtonAgua);
        jRadioButtonAgua.setText("Água");

        buttonGroupBebidas.add(jRadioButtonRefrigerante);
        jRadioButtonRefrigerante.setText("Refrigerante");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxSobremesa)
                            .addComponent(jCheckBoxPratoDia)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxBebida)
                                    .addComponent(jCheckBoxSalada))
                                .addGap(91, 91, 91)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButtonRefrigerante)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jRadioButtonSuco)
                                        .addComponent(jRadioButtonAgua))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 85, Short.MAX_VALUE)
                                        .addComponent(jButtonCancelar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonPedir))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNome)
                            .addComponent(jLabelIdade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextNome)
                            .addComponent(jSpinnerIdade))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelIdade))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxSobremesa)
                    .addComponent(jRadioButtonSuco))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxSalada)
                    .addComponent(jRadioButtonAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxBebida)
                    .addComponent(jRadioButtonRefrigerante))
                .addGap(18, 18, 18)
                .addComponent(jCheckBoxPratoDia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPedir)
                    .addComponent(jButtonCancelar))
                .addGap(16, 16, 16))
        );

        setSize(new java.awt.Dimension(429, 345));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMouseClicked
        // TODO add your handling code here:
        limpaTela();
    }//GEN-LAST:event_jButtonCancelarMouseClicked

    private void jButtonPedirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonPedirMouseClicked
        // TODO add your handling code here:
        String nome = jTextNome.getText();
        int idade = (int) jSpinnerIdade.getValue();
        StringBuilder pedido = new StringBuilder();
        if (nome.equals("")) {
            JOptionPane.showMessageDialog(
                this,
                "Nome em Branco!",
                "Erro!",
                JOptionPane.ERROR_MESSAGE);
            return;
        }
        pedido.append("Pessoa: " + nome + "\n");
        pedido.append("Idade: " + idade + "\n");
        pedido.append("Produtos: \n");
        boolean sobremesa = jCheckBoxSobremesa.isSelected();
        boolean salada = jCheckBoxSalada.isSelected();
        boolean bebida = jCheckBoxBebida.isSelected();
        boolean pratoDia = jCheckBoxPratoDia.isSelected();
        boolean suco = jRadioButtonSuco.isSelected();
        boolean agua = jRadioButtonAgua.isSelected();
        boolean refrigerante = jRadioButtonRefrigerante.isSelected();
        if (sobremesa) {
            pedido.append("+ Sobremesa\n");
        }
        if (salada) {
            pedido.append("+ Salada\n");
        }
        if (bebida) {
            pedido.append("+ Bebida\n");
        }
        if (pratoDia) {
            pedido.append("+ Prato do dia\n");
        }
        if (suco) {
            pedido.append("+ Suco\n");
        } else if (agua) {
            pedido.append("+ Agua\n");
        } else if (refrigerante) {
            pedido.append("+ Refrigerante");
        }
        JOptionPane.showMessageDialog(
                this,
                pedido.toString(),
                "Pedido",
                JOptionPane.PLAIN_MESSAGE);
        limpaTela();
    }//GEN-LAST:event_jButtonPedirMouseClicked

    private void jSpinnerIdadeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinnerIdadeStateChanged
        // TODO add your handling code here:
        int idade = (int) jSpinnerIdade.getValue();
        if (idade > 17) {
            jCheckBoxBebida.setEnabled(true);
        } else {
            jCheckBoxBebida.setEnabled(false);
        }
    }//GEN-LAST:event_jSpinnerIdadeStateChanged

    /**
     * @param args the command line argumentsp
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
            java.util.logging.Logger.getLogger(Janela01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Janela01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupBebidas;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonPedir;
    private javax.swing.JCheckBox jCheckBoxBebida;
    private javax.swing.JCheckBox jCheckBoxPratoDia;
    private javax.swing.JCheckBox jCheckBoxSalada;
    private javax.swing.JCheckBox jCheckBoxSobremesa;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JRadioButton jRadioButtonAgua;
    private javax.swing.JRadioButton jRadioButtonRefrigerante;
    private javax.swing.JRadioButton jRadioButtonSuco;
    private javax.swing.JSpinner jSpinnerIdade;
    private javax.swing.JTextField jTextNome;
    // End of variables declaration//GEN-END:variables

    private void limpaTela() {
        jTextNome.setText("");
        jSpinnerIdade.setValue(0);
        jCheckBoxSobremesa.setSelected(false);
        jCheckBoxSalada.setSelected(false);
        jCheckBoxBebida.setSelected(false);
        jCheckBoxPratoDia.setSelected(false);
        jRadioButtonSuco.setSelected(false);
        jRadioButtonAgua.setSelected(false);
        jRadioButtonRefrigerante.setSelected(false);
    }
}
