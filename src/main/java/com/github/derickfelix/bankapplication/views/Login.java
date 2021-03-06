/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.derickfelix.bankapplication.views;

import com.github.derickfelix.bankapplication.controllers.StaffController;
import com.github.derickfelix.bankapplication.controllers.UserController;
import java.awt.event.KeyEvent;

/**
 *
 * @author derickfelix
 */
public class Login extends javax.swing.JDialog {

    private UserController userController;
    private StaffController staffCtrl;

    /**
     * Creates new form Login
     */
    public Login(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        customOperations();
        
        txtAccount.setName("txtAccount");
        txtPassword.setName("txtPassword");
        btnLogin.setName("btnLogin");
    }

    private void customOperations() {
        this.userController = UserController.getInstance();
        this.staffCtrl = StaffController.getInstance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneLogin1 = new javax.swing.JPanel();
        lblAccount1 = new javax.swing.JLabel();
        lblPassword1 = new javax.swing.JLabel();
        txtAccount1 = new javax.swing.JTextField();
        txtPassword1 = new javax.swing.JPasswordField();
        lblStatus1 = new javax.swing.JLabel();
        paneTittle = new javax.swing.JPanel();
        panelbTitle = new javax.swing.JLabel();
        paneLogin = new javax.swing.JPanel();
        lblAccount = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtAccount = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblStatus = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        paneLogin1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Log in", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N

        lblAccount1.setText("Account number:");

        lblPassword1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword1.setText("Password:");

        txtAccount1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAccount1KeyPressed(evt);
            }
        });

        txtPassword1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassword1KeyPressed(evt);
            }
        });

        lblStatus1.setForeground(new java.awt.Color(197, 1, 1));
        lblStatus1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus1.setText("The account number or password you entered did not match our records.");

        javax.swing.GroupLayout paneLogin1Layout = new javax.swing.GroupLayout(paneLogin1);
        paneLogin1.setLayout(paneLogin1Layout);
        paneLogin1Layout.setHorizontalGroup(
            paneLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneLogin1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStatus1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(paneLogin1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(paneLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneLogin1Layout.createSequentialGroup()
                        .addComponent(lblPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneLogin1Layout.createSequentialGroup()
                        .addComponent(lblAccount1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneLogin1Layout.setVerticalGroup(
            paneLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneLogin1Layout.createSequentialGroup()
                .addComponent(lblStatus1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(paneLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccount1)
                    .addComponent(txtAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneLogin1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword1)
                    .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Trisoft Bank - Log in");
        setResizable(false);

        paneTittle.setBackground(new java.awt.Color(0, 83, 165));

        panelbTitle.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        panelbTitle.setForeground(new java.awt.Color(254, 254, 254));
        panelbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelbTitle.setText("TRISOFT BANK OF USA");

        javax.swing.GroupLayout paneTittleLayout = new javax.swing.GroupLayout(paneTittle);
        paneTittle.setLayout(paneTittleLayout);
        paneTittleLayout.setHorizontalGroup(
            paneTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneTittleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
        );
        paneTittleLayout.setVerticalGroup(
            paneTittleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneTittleLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(panelbTitle)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        paneLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sign in", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 14))); // NOI18N

        lblAccount.setText("Account number:");

        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPassword.setText("Password:");

        txtAccount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAccountKeyPressed(evt);
            }
        });

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        lblStatus.setForeground(new java.awt.Color(197, 1, 1));
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout paneLoginLayout = new javax.swing.GroupLayout(paneLogin);
        paneLogin.setLayout(paneLoginLayout);
        paneLoginLayout.setHorizontalGroup(
            paneLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(paneLoginLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(paneLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneLoginLayout.createSequentialGroup()
                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneLoginLayout.createSequentialGroup()
                        .addComponent(lblAccount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paneLoginLayout.setVerticalGroup(
            paneLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneLoginLayout.createSequentialGroup()
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAccount)
                    .addComponent(txtAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneTittle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(paneTittle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(paneLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnLogin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        onClickLogin();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtAccountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccountKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtAccount.nextFocus();
        }
    }//GEN-LAST:event_txtAccountKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            onClickLogin();
            this.nextFocus();
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtAccount1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccount1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccount1KeyPressed

    private void txtPassword1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassword1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassword1KeyPressed

    /**
     * Check the login fields, whether it is valid or invalid
     */
    private void onClickLogin() {
        String acc = txtAccount.getText();
        String pws = txtPassword.getText();
        
        if (userController.login(acc, pws) || staffCtrl.login(acc, pws)) {
            new Main().setVisible(true);
            dispose();
        } else {
            lblStatus.setText("The account number or password you entered did not match our records.");
            txtAccount.setText(null);
            txtPassword.setText(null);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblAccount;
    private javax.swing.JLabel lblAccount1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPassword1;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblStatus1;
    private javax.swing.JPanel paneLogin;
    private javax.swing.JPanel paneLogin1;
    private javax.swing.JPanel paneTittle;
    private javax.swing.JLabel panelbTitle;
    private javax.swing.JTextField txtAccount;
    private javax.swing.JTextField txtAccount1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPassword1;
    // End of variables declaration//GEN-END:variables
}
