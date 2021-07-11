package CityBank;


import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SearchDetails extends javax.swing.JFrame {

    
    public SearchDetails() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtAccNo = new javax.swing.JTextField();
        btnCNcancel = new javax.swing.JButton();
        btnFindbtACCNO = new javax.swing.JButton();
        txtAccFullName = new javax.swing.JTextField();
        btnFindbtACCNmae = new javax.swing.JButton();
        txtCutomerName = new javax.swing.JLabel();
        txtCutomerAge = new javax.swing.JLabel();
        txtCutomerAddress = new javax.swing.JLabel();
        txtCutomerNIC = new javax.swing.JLabel();
        txtCutomerGender = new javax.swing.JLabel();
        txtCutomerEmail = new javax.swing.JLabel();
        txtCutomerPhNo = new javax.swing.JLabel();
        txtCutomerAccType = new javax.swing.JLabel();
        txtDepositAmountS = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 30));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 76, 133));

        jLabel4.setFont(new java.awt.Font("Script MT Bold", 1, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_search_property_50px_1.png"))); // NOI18N
        jLabel4.setText("Search Details");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel1.setText("Full Name :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Age :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Address :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("NIC :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel7.setText("Email :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel8.setText("Phone Number :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Account Type :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel10.setText("Current Amount :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("Gender :");

        txtAccNo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAccNo.setForeground(new java.awt.Color(153, 153, 153));
        txtAccNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccNo.setText("Account Number");
        txtAccNo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtAccNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAccNoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAccNoFocusLost(evt);
            }
        });

        btnCNcancel.setBackground(new java.awt.Color(0, 29, 66));
        btnCNcancel.setFont(new java.awt.Font("Script MT Bold", 0, 14)); // NOI18N
        btnCNcancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCNcancel.setText("Done");
        btnCNcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCNcancelActionPerformed(evt);
            }
        });

        btnFindbtACCNO.setBackground(new java.awt.Color(0, 29, 66));
        btnFindbtACCNO.setFont(new java.awt.Font("Script MT Bold", 0, 14)); // NOI18N
        btnFindbtACCNO.setForeground(new java.awt.Color(255, 255, 255));
        btnFindbtACCNO.setText("Find By Account Number");
        btnFindbtACCNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindbtACCNOActionPerformed(evt);
            }
        });

        txtAccFullName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAccFullName.setForeground(new java.awt.Color(153, 153, 153));
        txtAccFullName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccFullName.setText("Account Holder Full name");
        txtAccFullName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAccFullNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAccFullNameFocusLost(evt);
            }
        });

        btnFindbtACCNmae.setBackground(new java.awt.Color(0, 29, 66));
        btnFindbtACCNmae.setFont(new java.awt.Font("Script MT Bold", 0, 14)); // NOI18N
        btnFindbtACCNmae.setForeground(new java.awt.Color(255, 255, 255));
        btnFindbtACCNmae.setText("Find By Holder Name");
        btnFindbtACCNmae.setToolTipText("");
        btnFindbtACCNmae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindbtACCNmaeActionPerformed(evt);
            }
        });

        txtCutomerName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCutomerName.setForeground(new java.awt.Color(255, 255, 255));

        txtCutomerAge.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCutomerAge.setForeground(new java.awt.Color(255, 255, 255));

        txtCutomerAddress.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCutomerAddress.setForeground(new java.awt.Color(255, 255, 255));

        txtCutomerNIC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCutomerNIC.setForeground(new java.awt.Color(255, 255, 255));

        txtCutomerGender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCutomerGender.setForeground(new java.awt.Color(255, 255, 255));

        txtCutomerEmail.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCutomerEmail.setForeground(new java.awt.Color(255, 255, 255));

        txtCutomerPhNo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCutomerPhNo.setForeground(new java.awt.Color(255, 255, 255));

        txtCutomerAccType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCutomerAccType.setForeground(new java.awt.Color(255, 255, 255));

        txtDepositAmountS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDepositAmountS.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(btnFindbtACCNO, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141)
                        .addComponent(btnFindbtACCNmae, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(txtAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAccFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCutomerName, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                            .addComponent(txtCutomerAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCutomerAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCutomerNIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCutomerGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCutomerEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCutomerPhNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCutomerAccType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDepositAmountS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(btnCNcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAccFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindbtACCNO)
                    .addComponent(btnFindbtACCNmae))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(txtCutomerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCutomerAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCutomerAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCutomerNIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(11, 11, 11)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCutomerGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCutomerEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCutomerPhNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCutomerAccType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDepositAmountS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(btnCNcancel)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCNcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCNcancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCNcancelActionPerformed

    private void btnFindbtACCNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindbtACCNOActionPerformed
        // TODO add your handling code here:
       SerachDetailsACCNumber();
    }//GEN-LAST:event_btnFindbtACCNOActionPerformed

    private void btnFindbtACCNmaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindbtACCNmaeActionPerformed
        // TODO add your handling code here:
        SerachDetailsACCName();
    }//GEN-LAST:event_btnFindbtACCNmaeActionPerformed

    private void txtAccFullNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAccFullNameFocusGained
        // TODO add your handling code here:
        String usernameValue = txtAccFullName.getText().trim();
        
        if (usernameValue.equals("Account Holder Full name"))
        {
            txtAccFullName.setText("");
            txtAccFullName.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtAccFullNameFocusGained

    private void txtAccFullNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAccFullNameFocusLost
        // TODO add your handling code here:
         String usernameValue = txtAccFullName.getText().trim().toLowerCase();
        
        if (usernameValue.equals("Account Holder Full name") || usernameValue.equals(""))
        {
            txtAccFullName.setText("Account Holder Full name");
            txtAccFullName.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtAccFullNameFocusLost

    private void txtAccNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAccNoFocusLost
        // TODO add your handling code here:
        String usernameValue = txtAccNo.getText().trim().toLowerCase();

        if (usernameValue.equals("Account Number") || usernameValue.equals(""))
        {
            txtAccNo.setText("Account Number");
            txtAccNo.setForeground(new Color(153,153,153));
        }

    }//GEN-LAST:event_txtAccNoFocusLost

    private void txtAccNoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAccNoFocusGained
        // TODO add your handling code here:
        String usernameValue = txtAccNo.getText().trim();

        if (usernameValue.equals("Account Number"))
        {
            txtAccNo.setText("");
            txtAccNo.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtAccNoFocusGained

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
            java.util.logging.Logger.getLogger(SearchDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCNcancel;
    private javax.swing.JButton btnFindbtACCNO;
    private javax.swing.JButton btnFindbtACCNmae;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JTextField txtAccFullName;
    private javax.swing.JTextField txtAccNo;
    private javax.swing.JLabel txtCutomerAccType;
    private javax.swing.JLabel txtCutomerAddress;
    private javax.swing.JLabel txtCutomerAge;
    private javax.swing.JLabel txtCutomerEmail;
    private javax.swing.JLabel txtCutomerGender;
    private javax.swing.JLabel txtCutomerNIC;
    private javax.swing.JLabel txtCutomerName;
    private javax.swing.JLabel txtCutomerPhNo;
    private javax.swing.JLabel txtDepositAmountS;
    // End of variables declaration//GEN-END:variables

    private void SerachDetailsACCNumber() {
        Connection dbconn = DBConnection.connectDB();
        if(dbconn != null){
        try {
            PreparedStatement st = (PreparedStatement)dbconn.prepareStatement("Select * from customersdb WHERE accountnumber  = ?");
            
            int id = (Integer.parseInt(txtAccNo.getText()));           
            st.setInt(1, id);
            ResultSet res = st.executeQuery();
            
            if(res.next()==false) {
                JOptionPane.showMessageDialog(this, "Sorry Record Not Found");
                txtCutomerName.setText("");
                txtCutomerAge.setText("");
                txtCutomerAddress.setText("");
                txtCutomerNIC.setText("");
                txtCutomerGender.setText("");
                txtCutomerEmail.setText("");
                txtCutomerPhNo.setText("");
                txtCutomerAccType.setText("");
                txtDepositAmountS.setText("");
                txtAccNo.requestFocus();
            } else {
                txtCutomerName.setText(res.getString("fullname"));
                txtCutomerAge.setText(res.getString("age"));
                txtCutomerAddress.setText(res.getString("address"));
                txtCutomerNIC.setText(res.getString("nic"));
                txtCutomerGender.setText(res.getString("gender"));
                txtCutomerEmail.setText(res.getString("email"));
                txtCutomerPhNo.setText(res.getString("phonenumber"));
                txtCutomerAccType.setText(res.getString("accounttype"));
                txtDepositAmountS.setText(res.getString("depositamount"));
                txtAccFullName.setText(res.getString("fullname"));
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(SearchDetails.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Sorry, Record Not Found.", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        } else {
            System.out.println("The Connection not available");
        }
    }
    
    private void SerachDetailsACCName() {
        Connection dbconn = DBConnection.connectDB();
        if(dbconn != null){
        try {
            
            PreparedStatement st2 = (PreparedStatement)dbconn.prepareStatement("Select * from customersdb WHERE fullname  = ?");
            String name = txtAccFullName.getText();
            st2.setString(1, name);
            ResultSet res2 = st2.executeQuery();

            
            if(res2.next()==false) {
                JOptionPane.showMessageDialog(this, "Sorry, Record Not Found");
                txtCutomerName.setText("");
                txtCutomerAge.setText("");
                txtCutomerAddress.setText("");
                txtCutomerNIC.setText("");
                txtCutomerGender.setText("");
                txtCutomerEmail.setText("");
                txtCutomerPhNo.setText("");
                txtCutomerAccType.setText("");
                txtDepositAmountS.setText("");
                txtAccFullName.requestFocus();
            } else {
                txtCutomerName.setText(res2.getString("fullname"));
                txtCutomerAge.setText(res2.getString("age"));
                txtCutomerAddress.setText(res2.getString("address"));
                txtCutomerNIC.setText(res2.getString("nic"));
                txtCutomerGender.setText(res2.getString("gender"));
                txtCutomerEmail.setText(res2.getString("email"));
                txtCutomerPhNo.setText(res2.getString("phonenumber"));
                txtCutomerAccType.setText(res2.getString("accounttype"));
                txtDepositAmountS.setText(res2.getString("depositamount"));
                txtAccNo.setText(res2.getString("accountnumber"));
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(SearchDetails.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Sorry, Record Not Found.", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        } else {
            System.out.println("The Connection not available");
        }
    }
    
}
