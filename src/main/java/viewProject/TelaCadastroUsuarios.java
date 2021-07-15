/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewProject;

import baseProject.Cadastro;
import usuario.DAO.CadastroDAO;
import usuario.DAO.ConsultaUsuDAO;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Cauet Damasceno
 */
public class TelaCadastroUsuarios extends javax.swing.JInternalFrame {

    int acao;
    ConsultaUsuDAO ConsulDAO;
    CadastroDAO cadastroDAO;
    Cadastro cad = new Cadastro();
    Connection conexao;

    /**
     * Creates new form TelaCadastroUsuarios
     */
    public TelaCadastroUsuarios() {
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

        PanelCadastro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUsuId = new javax.swing.JTextField();
        txtUsuNome = new javax.swing.JTextField();
        ComboBoxUsu = new javax.swing.JComboBox<>();
        txtUsuLogin = new javax.swing.JTextField();
        PasswordFieldUsu = new javax.swing.JPasswordField();
        txtUsuFone = new javax.swing.JTextField();
        btnPesquisa = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setMaximumSize(new java.awt.Dimension(825, 525));
        setMinimumSize(new java.awt.Dimension(823, 520));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        PanelCadastro.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerenciamento de usuários"));

        jLabel1.setText("ID: *");

        jLabel2.setText("Nome: *");

        jLabel3.setText("Login: *");

        jLabel4.setText("Fone:");

        jLabel5.setText("Perfil: *");

        jLabel6.setText("Senha: *");

        txtUsuId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuIdActionPerformed(evt);
            }
        });

        txtUsuNome.setEnabled(false);

        ComboBoxUsu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Atendente" }));
        ComboBoxUsu.setEnabled(false);
        ComboBoxUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxUsuActionPerformed(evt);
            }
        });

        txtUsuLogin.setEnabled(false);

        PasswordFieldUsu.setEnabled(false);

        txtUsuFone.setEnabled(false);

        btnPesquisa.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cauet Damasceno\\Documents\\NetBeansProjects\\VaccineForAll\\src\\main\\java\\imagens\\search.png")); // NOI18N
        btnPesquisa.setText("Pesquisar");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelCadastroLayout = new javax.swing.GroupLayout(PanelCadastro);
        PanelCadastro.setLayout(PanelCadastroLayout);
        PanelCadastroLayout.setHorizontalGroup(
            PanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCadastroLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(PanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(6, 6, 6)
                .addGroup(PanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCadastroLayout.createSequentialGroup()
                        .addComponent(txtUsuId, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCadastroLayout.createSequentialGroup()
                        .addComponent(txtUsuNome)
                        .addGap(15, 15, 15))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCadastroLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(PanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelCadastroLayout.createSequentialGroup()
                        .addComponent(txtUsuFone, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboBoxUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCadastroLayout.createSequentialGroup()
                        .addComponent(txtUsuLogin)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PasswordFieldUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        PanelCadastroLayout.setVerticalGroup(
            PanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUsuId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(btnPesquisa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuNome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(PanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6)
                    .addComponent(PasswordFieldUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtUsuFone, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(PanelCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ComboBoxUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(52, 52, 52))
        );

        btnNovo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cauet Damasceno\\Documents\\NetBeansProjects\\VaccineForAll\\src\\main\\java\\imagens\\add-user.png")); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cauet Damasceno\\Documents\\NetBeansProjects\\VaccineForAll\\src\\main\\java\\imagens\\pencil.png")); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setEnabled(false);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cauet Damasceno\\Documents\\NetBeansProjects\\VaccineForAll\\src\\main\\java\\imagens\\diskette.png")); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.setEnabled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnDeletar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cauet Damasceno\\Documents\\NetBeansProjects\\VaccineForAll\\src\\main\\java\\imagens\\remove-user.png")); // NOI18N
        btnDeletar.setText("Excluir");
        btnDeletar.setEnabled(false);
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cauet Damasceno\\Documents\\NetBeansProjects\\VaccineForAll\\src\\main\\java\\imagens\\broom.png")); // NOI18N
        btnCancelar.setText("Limpar Campos");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon("C:\\Users\\Cauet Damasceno\\Documents\\NetBeansProjects\\VaccineForAll\\src\\main\\java\\imagens\\exit.png")); // NOI18N
        btnSair.setText("Sair");
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(PanelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(PanelCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnNovo, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        setBounds(0, 0, 840, 520);
    }// </editor-fold>//GEN-END:initComponents

    // Fim botão de adicionar cadastro.

    private void ComboBoxUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxUsuActionPerformed


    }//GEN-LAST:event_ComboBoxUsuActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        TelaPrincipal.telcad = true;
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        // TODO add your handling code here:
        TelaPrincipal.telcad = false;
        dispose();
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        if (txtUsuId.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Digite o código !");
        } else {
            int codigo = Integer.parseInt(txtUsuId.getText());
            cadastroDAO = new CadastroDAO();
            try {
                if (JOptionPane.showConfirmDialog(this, "Confirma a exclusão ?", "Confirmação", JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION) {
                    if (cadastroDAO.removerCadastro(codigo)) {
                        JOptionPane.showMessageDialog(this, "Excluido com sucesso !");
                        limparCampos();
                    } else {
                        JOptionPane.showMessageDialog(this, "Erro ao excluir o registro !");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Operação cancelada !");
                    limparCampos();
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Erro: Exclusão Não Realizada !" + e.getMessage());
            }

        }

    }//GEN-LAST:event_btnDeletarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        // TODO add your handling code here:
        acao = 1;
        novo();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        acao = 2;
        editar();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:        
        int cod;
        cad = new Cadastro();
        preencher_objetos();
        try {
            cadastroDAO = new CadastroDAO();

            /// acao = 1 será para incluir novo registro
            if (acao == 1) {
                cod = cadastroDAO.incluirCadastro(cad);
                txtUsuId.setText(String.valueOf(cod));
                JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                salvar();

            }
            /// acao =2 edita registro já realizado.
            if (acao == 2) {
                cad.setIduser(Integer.parseInt(txtUsuId.getText()));
                if (cadastroDAO.alterarCadastro(cad)) {
                    JOptionPane.showMessageDialog(this, "Alterado com sucesso !");
                    salvar();
                }
               
            }

        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, "Operação não realizada" + error.getMessage());
        }


    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtUsuIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuIdActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed
        // TODO add your handling code here:
        cad = new Cadastro();
        if (txtUsuId.getText().equals("")) {
            
               // chama a tela de consulta:   
            TelaConsultaUsuario consultaUsu = new TelaConsultaUsuario();
            TelaPrincipal.Desktop.add(consultaUsu);
            consultaUsu.setVisible(true);
            TelaPrincipal.Desktop.setComponentZOrder(consultaUsu, 0);

            /// chama a tela de consulta
        } else {
            cad.setIduser(Integer.parseInt(txtUsuId.getText()));
            cadastroDAO = new CadastroDAO();
            try {
                
                if (cadastroDAO.pesquisarCadastro(cad)) {
                    if ((cad != null)) {
                        pesquisa();                        
                    }
                }
            } catch (Exception e) {
                
                JOptionPane.showMessageDialog(this, "Usuário não cadastrado"+ e.getMessage());
            }

        }
    }//GEN-LAST:event_btnPesquisaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxUsu;
    private javax.swing.JPanel PanelCadastro;
    private javax.swing.JPasswordField PasswordFieldUsu;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JButton btnSair;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtUsuFone;
    private static javax.swing.JTextField txtUsuId;
    private javax.swing.JTextField txtUsuLogin;
    private javax.swing.JTextField txtUsuNome;
    // End of variables declaration//GEN-END:variables

    public static void recebeid(Cadastro cad) {
        txtUsuId.setText(String.valueOf(cad.getIduser()));
        txtUsuId.requestFocus();
    }

    public void preencher_objetos() {
        cad.setNome(txtUsuNome.getText().trim());
        cad.setFone(txtUsuFone.getText());
        cad.setLogin(txtUsuLogin.getText().trim());
        cad.setSenha(String.valueOf(PasswordFieldUsu.getPassword()));
        cad.setPerfil((ComboBoxUsu.getSelectedItem().toString()));
    }

    public void novo() {
        txtUsuNome.setEnabled(true);
        ComboBoxUsu.setEnabled(true);
        txtUsuLogin.setEnabled(true);
        PasswordFieldUsu.setEnabled(true);
        txtUsuFone.setEnabled(true);
        txtUsuId.setEnabled(false);
        btnEditar.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        txtUsuLogin.setText("");
        txtUsuId.setText("");
        txtUsuNome.setText("");
        txtUsuFone.setText("");
        PasswordFieldUsu.setText("");
        ComboBoxUsu.setSelectedItem("");
    }

    public void limparCampos() {
        txtUsuId.setText("");
        txtUsuLogin.setText("");
        txtUsuNome.setText("");
        txtUsuFone.setText("");
        PasswordFieldUsu.setText("");
        ComboBoxUsu.setSelectedItem("");
        txtUsuNome.setEnabled(false);
        ComboBoxUsu.setEnabled(false);
        txtUsuLogin.setEnabled(false);
        PasswordFieldUsu.setEnabled(false);
        txtUsuFone.setEnabled(false);
        txtUsuId.setEnabled(true);
        btnEditar.setEnabled(false);
        btnSalvar.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnSair.setEnabled(true);
        btnNovo.setEnabled(true);
    }

    public void editar() {
        txtUsuNome.setEnabled(true);
        ComboBoxUsu.setEnabled(true);
        txtUsuLogin.setEnabled(true);
        PasswordFieldUsu.setEnabled(true);
        txtUsuFone.setEnabled(true);
        txtUsuId.setEnabled(false);
        btnEditar.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnDeletar.setEnabled(true);
        btnNovo.setEnabled(false);

    }

    public void salvar() {
        txtUsuNome.setEnabled(false);
        ComboBoxUsu.setEnabled(false);
        txtUsuLogin.setEnabled(false);
        PasswordFieldUsu.setEnabled(false);
        txtUsuFone.setEnabled(false);
        txtUsuId.setEnabled(true);
        btnEditar.setEnabled(true);
        btnSalvar.setEnabled(false);

    }

    public void pesquisa() {
    
        txtUsuNome.setText(cad.getNome().trim());
        txtUsuFone.setText(cad.getFone().trim());
        txtUsuLogin.setText(cad.getLogin().trim());
        PasswordFieldUsu.setText(cad.getSenha().trim());
        ComboBoxUsu.setSelectedItem(cad.getPerfil().trim());
        btnEditar.setEnabled(true);
        btnSalvar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnDeletar.setEnabled(true);
        btnNovo.setEnabled(false);

    }

} // Fim da classe principal

