package com.mycompany.vetorinterativo;

import java.util.Arrays;
import javax.swing.DefaultListModel;


public class VetorInterativoSwing extends javax.swing.JFrame {
    
    int vetor[] = new int[5];
    DefaultListModel lista = new DefaultListModel();
    int selecionado = 0;

    /**
     * Creates new form VetorInterativoSwing
     */
    public VetorInterativoSwing() {
        initComponents();
        for(int i = 0; i < vetor.length; i++)
            lista.addElement(vetor[i]);
    }

    // Peculiaridades da Biblioteca Swing
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnOrdem = new javax.swing.JButton();
        txtNum = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstVetor = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        lblSelecionado = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAdd.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 18)); // NOI18N
        btnAdd.setText("Adicionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 18)); // NOI18N
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnOrdem.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 18)); // NOI18N
        btnOrdem.setText("Ordenar");
        btnOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdemActionPerformed(evt);
            }
        });

        txtNum.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 18)); // NOI18N

        lstVetor.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 18)); // NOI18N
        lstVetor.setModel(lista);
        lstVetor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstVetorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstVetor);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 24)); // NOI18N
        jLabel1.setText("Vetor");

        lblSelecionado.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 24)); // NOI18N
        lblSelecionado.setText("[0]");

        jLabel3.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 13)); // NOI18N
        jLabel3.setText("Clique em uma posição");

        jLabel2.setFont(new java.awt.Font("DejaVu Sans Mono", 0, 13)); // NOI18N
        jLabel2.setText("para começar!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd)
                            .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGap(34, 34, 34)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblSelecionado)
                            .addGap(111, 111, 111))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(77, 77, 77)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnAdd)
                        .addGap(34, 34, 34)
                        .addComponent(btnRemove)
                        .addGap(37, 37, 37)
                        .addComponent(btnOrdem))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lblSelecionado))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void btnOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdemActionPerformed
        // Ordenando o vetor usando o método da classe Arrays
        Arrays.sort(vetor);
        lista.removeAllElements();
        for(int i = 0; i < vetor.length; i++)
            lista.addElement(vetor[i]);
    }//GEN-LAST:event_btnOrdemActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // Convertendo o valor do spinner em inteiro para ser exibido na posição selecionada pelo usuário
        vetor[selecionado] = Integer.parseInt(txtNum.getValue().toString());
        // Esvaziando a lista antes de adicionar
        lista.removeAllElements();
        for(int i = 0; i < vetor.length; i++)
            lista.addElement(vetor[i]);
    }//GEN-LAST:event_btnAddActionPerformed

    private void lstVetorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstVetorMouseClicked
        // Atualizando o valor do label com o valor que o usuário selecionou no vetor
        selecionado = lstVetor.getSelectedIndex();
        lblSelecionado.setText("[" + selecionado + "]");
    }//GEN-LAST:event_lstVetorMouseClicked

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // Voltando o valor removido pelo usuário para 0
        vetor[selecionado] = 0;
        lista.removeAllElements();
        for(int i = 0; i < vetor.length; i++)
            lista.addElement(vetor[i]);
        
    }//GEN-LAST:event_btnRemoveActionPerformed


    public static void main(String args[]) {
        // Mais Peculiaridades da Biblioteca Swing
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VetorInterativoSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VetorInterativoSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VetorInterativoSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VetorInterativoSwing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VetorInterativoSwing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnOrdem;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSelecionado;
    private javax.swing.JList<String> lstVetor;
    private javax.swing.JSpinner txtNum;
    // End of variables declaration//GEN-END:variables
}
