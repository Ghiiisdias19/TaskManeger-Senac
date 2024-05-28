package com.mycompany.telas;

import com.mycompany.dao.TaskDAO;
import com.mycompany.taskmaneger.Task;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;


public class NovaTarefa_Tela extends javax.swing.JFrame {

    public NovaTarefa_Tela() {
        initComponents();
        geraAcessbilidade();
    }

    public void geraAcessbilidade() {
        CriarTarefaButton.setMnemonic(KeyEvent.VK_C);
        VoltarButton.setMnemonic(KeyEvent.VK_E);
    }
    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulop1 = new javax.swing.JLabel();
        Titulop2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ATnome = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        ATprioridade = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        ATdescricao = new javax.swing.JTextArea();
        jScrollPane11 = new javax.swing.JScrollPane();
        ATdata = new javax.swing.JTextArea();
        nome = new javax.swing.JLabel();
        descricao = new javax.swing.JLabel();
        prioridade = new javax.swing.JLabel();
        data = new javax.swing.JLabel();
        CriarTarefaButton = new javax.swing.JButton();
        VoltarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Titulop1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Titulop1.setText("Nova");

        Titulop2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        Titulop2.setText("Tarefa");

        ATnome.setColumns(20);
        ATnome.setRows(5);
        jScrollPane4.setViewportView(ATnome);

        ATprioridade.setColumns(20);
        ATprioridade.setRows(5);
        jScrollPane8.setViewportView(ATprioridade);

        ATdescricao.setColumns(20);
        ATdescricao.setRows(5);
        jScrollPane9.setViewportView(ATdescricao);

        ATdata.setColumns(20);
        ATdata.setRows(5);
        jScrollPane11.setViewportView(ATdata);

        nome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nome.setText("Nome");

        descricao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        descricao.setText("Descri��o");

        prioridade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        prioridade.setText("Prioridade");

        data.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        data.setText("Data");

        CriarTarefaButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        CriarTarefaButton.setText("Criar Tarefa");
        CriarTarefaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarTarefaButtonActionPerformed(evt);
            }
        });

        VoltarButton.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        VoltarButton.setText("Voltar");
        VoltarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(data)
                    .addComponent(prioridade)
                    .addComponent(descricao)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome))
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(VoltarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CriarTarefaButton)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(Titulop1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(Titulop2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(Titulop1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Titulop2)
                .addGap(37, 37, 37)
                .addComponent(nome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(descricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(prioridade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(data)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CriarTarefaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VoltarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 526, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarButtonActionPerformed
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VoltarButtonActionPerformed

    private void CriarTarefaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarTarefaButtonActionPerformed
                 if (emptyFields() || !validateDate(ATdata.getText())) {
                 return;}
                 
    String nome = ATnome.getText();
    String descricao = ATdescricao.getText();
    String prioridade = ATprioridade.getText();
    String data = ATdata.getText();

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Date dueDate;

    try {
            dueDate = sdf.parse(data);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Formato da DATA inv�lido. Use o formato XX/XX/XXXX.");
            return;
        }
    
        Task novaTarefa = new Task();
        novaTarefa.setTitle(nome);
        novaTarefa.setDescription(descricao);
        novaTarefa.setPriority(prioridade);
        novaTarefa.setDueDate(dueDate);

    TaskDAO taskdao = new TaskDAO();
    taskdao.inserir(novaTarefa);

 limparCampos();

        JOptionPane.showMessageDialog(null, "A Tarefa foi Cadastrada com Sucesso!\nNome: " + nome +
        "\nDescrição: " + descricao +
        "\nPrioridade: " + prioridade +
        "\nData: " + data);

    
      
    }//GEN-LAST:event_CriarTarefaButtonActionPerformed
     private void limparCampos() {
        ATnome.setText("");
        ATdescricao.setText("");
        ATprioridade.setText("");
        ATdata.setText("");
    }
     
     private boolean emptyFields() {
        if (ATnome.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "ATEN��O! Nome n�o pode ser vazio.");
            return true;
        } else if (ATdata.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "ATEN��O! Data n�o pode ser vazio.");
            return true;
        }
        return false;
    }

    private boolean validateDate(String date) {
        if (!date.matches("\\d{2}/\\d{2}/\\d{4}")) {
            JOptionPane.showMessageDialog(null, "Formato da DATA inv�lido. Use o formato XX/XX/XXXX.");
            return false;
        }
        return true;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new NovaTarefa_Tela().setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ATdata;
    private javax.swing.JTextArea ATdescricao;
    private javax.swing.JTextArea ATnome;
    private javax.swing.JTextArea ATprioridade;
    private javax.swing.JButton CriarTarefaButton;
    private javax.swing.JLabel Titulop1;
    private javax.swing.JLabel Titulop2;
    private javax.swing.JButton VoltarButton;
    private javax.swing.JLabel data;
    private javax.swing.JLabel descricao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel prioridade;
    // End of variables declaration//GEN-END:variables

}