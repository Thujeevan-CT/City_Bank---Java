package CityBank;


import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class CheckBalance extends javax.swing.JFrame {


    public CheckBalance() {
        initComponents();
        
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtAccNoCk = new javax.swing.JTextField();
        btnCNcancel = new javax.swing.JButton();
        btnFindbtACCNO = new javax.swing.JButton();
        showAccType = new javax.swing.JLabel();
        ShowAmount = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        showAccHName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 0, 30));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 76, 133));

        jLabel4.setFont(new java.awt.Font("Script MT Bold", 1, 25)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_bounced_check_50px.png"))); // NOI18N
        jLabel4.setText("Check Balance");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel9.setText("Account Type :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Current Amount ");

        txtAccNoCk.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtAccNoCk.setForeground(new java.awt.Color(153, 153, 153));
        txtAccNoCk.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccNoCk.setText("Account Number");
        txtAccNoCk.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtAccNoCk.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAccNoCkFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAccNoCkFocusLost(evt);
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
        btnFindbtACCNO.setText("Check Balance");
        btnFindbtACCNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindbtACCNOActionPerformed(evt);
            }
        });

        showAccType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        showAccType.setForeground(new java.awt.Color(255, 255, 255));

        ShowAmount.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        ShowAmount.setForeground(new java.awt.Color(255, 255, 255));
        ShowAmount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel11.setText("Account Holder Name :");

        showAccHName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        showAccHName.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(txtAccNoCk, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 145, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(ShowAmount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showAccType, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showAccHName, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(btnFindbtACCNO, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(btnCNcancel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtAccNoCk, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFindbtACCNO)
                .addGap(31, 31, 31)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showAccType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(showAccHName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ShowAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCNcancel)
                .addGap(63, 63, 63))
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

    private void txtAccNoCkFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAccNoCkFocusGained
        // TODO add your handling code here:
        String usernameValue = txtAccNoCk.getText().trim();

        if (usernameValue.equals("Account Number"))
        {
            txtAccNoCk.setText("");
            txtAccNoCk.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtAccNoCkFocusGained

    private void txtAccNoCkFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAccNoCkFocusLost
        // TODO add your handling code here:
        String usernameValue = txtAccNoCk.getText().trim().toLowerCase();

        if (usernameValue.equals("Account Number") || usernameValue.equals(""))
        {
            txtAccNoCk.setText("Account Number");
            txtAccNoCk.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtAccNoCkFocusLost

    private void btnCNcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCNcancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCNcancelActionPerformed

    private void btnFindbtACCNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindbtACCNOActionPerformed
        // TODO add your handling code here:
        
        SerachDetailsACCNumber();
        
    }//GEN-LAST:event_btnFindbtACCNOActionPerformed

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
            java.util.logging.Logger.getLogger(CheckBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckBalance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckBalance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ShowAmount;
    private javax.swing.JButton btnCNcancel;
    private javax.swing.JButton btnFindbtACCNO;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel showAccHName;
    private javax.swing.JLabel showAccType;
    private javax.swing.JTextField txtAccNoCk;
    // End of variables declaration//GEN-END:variables

    private void SerachDetailsACCNumber() {
        Connection dbconn = DBConnection.connectDB();
        if(dbconn != null){
        try {
            PreparedStatement st = (PreparedStatement)dbconn.prepareStatement("Select * from customersdb WHERE accountnumber  = ?");
            
            int id = (Integer.parseInt(txtAccNoCk.getText()));           
            st.setInt(1, id);
            ResultSet res = st.executeQuery();
            
            if(res.next()==false) {
                JOptionPane.showMessageDialog(this, "Sorry Record Not Found");
                showAccType.setText("");
                ShowAmount.setText("");
                showAccHName.setText("");
                txtAccNoCk.requestFocus();
            } else {               
                showAccType.setText(res.getString("accounttype"));
                showAccHName.setText(res.getString("fullname"));
                ShowAmount.setText(res.getString("depositamount"));
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
