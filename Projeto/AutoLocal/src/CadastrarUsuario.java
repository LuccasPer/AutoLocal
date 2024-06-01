import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Reinaldo
 */
public class CadastrarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarUsuario
     */
    public CadastrarUsuario() {
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

        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbCargo = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Usuário");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Usuário:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 50, 110, 41);

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(120, 50, 160, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setText("Senha:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 100, 110, 41);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(120, 110, 160, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Cargo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 170, 110, 41);

        cmbCargo.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        cmbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "Gerente", "Estagiário", "Vendedor", "Analista", " ", " ", " " }));
        cmbCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCargoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbCargo);
        cmbCargo.setBounds(120, 170, 160, 30);

        btnSalvar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(120, 240, 97, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("ID:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 10, 70, 30);

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtID);
        txtID.setBounds(120, 10, 160, 30);

        setSize(new java.awt.Dimension(377, 302));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void cmbCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCargoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        //l-pegar os dados digitados na tela
        String u, s, c,i;
        u = txtUsuario.getText();
        s = txtSenha.getText();
        i = txtID.getText();
        c = cmbCargo.getSelectedItem().toString();
        // 2- conectar com o banco de dados MySQL
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/autolocal" , "root" , "admin");
        // 3 Enviar os dados para a tabela do Banco de Dados
        PreparedStatement st = conectado.prepareStatement("INSERT INTO usuarios VALUES(?,?,?,?)");
        st.setString(1, i);
        st.setString(2,u);
        st.setString(3,s);
        st.setString(4,c);
        st.executeUpdate(); //executa o INSERT
        //4 - Mostrar uma mensagem indicando que cadastrou
        JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso");
        txtUsuario.setText("");
        txtSenha.setText("");
        txtID.setText("");
        cmbCargo.setSelectedIndex(1);
        txtUsuario.requestFocus();
                
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Driver não colocado na library");
        }  catch (SQLException ex){
                JOptionPane.showMessageDialog(null,"Erro no Banco de Dados" + ex.getMessage());
    }  
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
