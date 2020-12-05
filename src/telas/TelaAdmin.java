/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import controladores.EmpresaDAO;
import controladores.UsuarioDAO;
import javax.swing.JOptionPane;
import objetos.Empresa;
import objetos.EmpresaTableModel;
import objetos.Usuario;
import objetos.UsuarioTableModel;

/**
 *
 * @author Gabriel
 */
public class TelaAdmin extends javax.swing.JFrame {

    Usuario usuario = new Usuario();
    UsuarioDAO dao = new UsuarioDAO();
    Empresa empresa = new Empresa();
    EmpresaDAO DAO = new EmpresaDAO();

    public TelaAdmin() {
        initComponents();
        atualizarTabela();
    }

    public void atualizarTabela() {
        UsuarioTableModel tm = new UsuarioTableModel(dao.listarUsuario());
        tblUser.setModel(tm);
        EmpresaTableModel etm = new EmpresaTableModel(DAO.listarEmpresa());
        tblEmp.setModel(etm);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUser = new javax.swing.JTable();
        btnEditarUsuario = new javax.swing.JButton();
        btnExcluirUsuario = new javax.swing.JButton();
        btnVoltar2 = new javax.swing.JButton();
        btnCadatroUser = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmp = new javax.swing.JTable();
        btnEditarEmpresa = new javax.swing.JButton();
        btnExcluirEmpresa = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(730, 400));

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));

        tblUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Login", "Senha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblUser);

        btnEditarUsuario.setText("Editar");
        btnEditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuarioActionPerformed(evt);
            }
        });

        btnExcluirUsuario.setText("Excluir");
        btnExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirUsuarioActionPerformed(evt);
            }
        });

        btnVoltar2.setText("Voltar");
        btnVoltar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltar2ActionPerformed(evt);
            }
        });

        btnCadatroUser.setText("Cadastrar Usuário");
        btnCadatroUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadatroUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnEditarUsuario)
                .addGap(136, 136, 136)
                .addComponent(btnExcluirUsuario)
                .addGap(125, 125, 125)
                .addComponent(btnCadatroUser)
                .addGap(52, 52, 52))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEditarUsuario)
                        .addComponent(btnVoltar2))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExcluirUsuario)
                        .addComponent(btnCadatroUser)))
                .addGap(0, 300, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Usuários", jPanel1);

        tblEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Endereço", "Telefone", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmp);

        btnEditarEmpresa.setText("Editar");
        btnEditarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEmpresaActionPerformed(evt);
            }
        });

        btnExcluirEmpresa.setText("Excluir");
        btnExcluirEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirEmpresaActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jButton1.setText("Cadastrar Empresa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltar)
                .addGap(148, 148, 148)
                .addComponent(btnEditarEmpresa)
                .addGap(148, 148, 148)
                .addComponent(btnExcluirEmpresa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(53, 53, 53))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluirEmpresa)
                    .addComponent(btnEditarEmpresa)
                    .addComponent(btnVoltar)
                    .addComponent(jButton1))
                .addContainerGap(300, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Empresas", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
        //chamada das classe TelaCadastriUsuario e TelaCadastroEmpresa
        TelaCadastroUsuario cadastro = new TelaCadastroUsuario();
        TelaCadastroEmpresa register = new TelaCadastroEmpresa();
    
    private void btnEditarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEmpresaActionPerformed
        int linha = tblEmp.getSelectedRow();
        if(linha == -1){
            JOptionPane.showMessageDialog(null, "Selecione uma empresa para poder editar");
        }else{
            empresa = DAO.pesquisarEmpresaPorId((int) tblEmp.getValueAt(linha, 0));
            register.empresa = empresa;
            register.atulizarCamposConsulta();
            register.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnEditarEmpresaActionPerformed

    private void btnExcluirEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirEmpresaActionPerformed
        int linha = tblEmp.getSelectedRow();
        if(linha == -1){
            JOptionPane.showMessageDialog(null, "Selecione uma empresa para poder excluir");
        }else if(JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir esta empresa?", "Excluir empresa",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            empresa = DAO.pesquisarEmpresaPorId((int) tblEmp.getValueAt(linha, 0));
            DAO.excluirEmpresa(empresa);
            JOptionPane.showMessageDialog(null, "Empresa excluído com sucesso");
            atualizarTabela();
        }
    }//GEN-LAST:event_btnExcluirEmpresaActionPerformed

    private void btnExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirUsuarioActionPerformed
        int linha = tblUser.getSelectedRow();
        if(linha == -1){
            JOptionPane.showMessageDialog(null, "Selecione um usuário para poder excluir");
        }else if(JOptionPane.showConfirmDialog(null, "Deseja mesmo excluir este usuário?", "Excluir usuário",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            usuario = dao.pesquisarUsuarioPorId((int) tblUser.getValueAt(linha, 0));
            dao.excluirUsuario(usuario);
            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso");
            atualizarTabela();
        }
    }//GEN-LAST:event_btnExcluirUsuarioActionPerformed

    private void btnEditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuarioActionPerformed
         int linha = tblUser.getSelectedRow();
        if(linha == -1){
            JOptionPane.showMessageDialog(null, "Selecione um usuário para poder editar");
        }else{
            usuario = dao.pesquisarUsuarioPorId((int) tblUser.getValueAt(linha, 0));
            cadastro.usuario = usuario;
            cadastro.atulizarCamposConsulta();
            cadastro.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnEditarUsuarioActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnVoltar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltar2ActionPerformed
                TelaLogin login = new TelaLogin();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltar2ActionPerformed

    private void btnCadatroUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadatroUserActionPerformed
        cadastro.setVisible(true);
            dispose();
    }//GEN-LAST:event_btnCadatroUserActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        register.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadatroUser;
    private javax.swing.JButton btnEditarEmpresa;
    private javax.swing.JButton btnEditarUsuario;
    private javax.swing.JButton btnExcluirEmpresa;
    private javax.swing.JButton btnExcluirUsuario;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton btnVoltar2;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblEmp;
    private javax.swing.JTable tblUser;
    // End of variables declaration//GEN-END:variables
}
