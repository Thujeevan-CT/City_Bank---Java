/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CityBank;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Work
 */
public class LoginPanel extends javax.swing.JFrame {

    /**
     * Creates new form LoginPanel
     */
    public LoginPanel() {
        initComponents();
        
        this.setLocationRelativeTo(null); // Center Form
        jPanelManager.setVisible(true);
        jPanelCashier.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        btnAbout = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        btnMinimize = new javax.swing.JButton();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        kGradientPanel4 = new keeptoo.KGradientPanel();
        btnManager = new javax.swing.JButton();
        btnCashier = new javax.swing.JButton();
        jPanelManager = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtManegerUser = new javax.swing.JTextField();
        txtManegerPass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        btnManagerLogin = new javax.swing.JButton();
        jPanelCashier = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtCashierPass = new javax.swing.JPasswordField();
        txtCashierUser = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnCashierLogin = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        kGradientPanel2.setkEndColor(new java.awt.Color(0, 0, 30));
        kGradientPanel2.setkStartColor(new java.awt.Color(0, 76, 133));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/City Bank Low.png"))); // NOI18N

        btnAbout.setBackground(new java.awt.Color(0, 102, 153));
        btnAbout.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_info_30px.png"))); // NOI18N
        btnAbout.setText("About");
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        btnClose.setBackground(new java.awt.Color(0, 102, 153));
        btnClose.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_close_window_30px.png"))); // NOI18N
        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnMinimize.setBackground(new java.awt.Color(0, 102, 153));
        btnMinimize.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_macos_minimize_30px_1.png"))); // NOI18N
        btnMinimize.setText("Minimize");
        btnMinimize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinimizeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 283, Short.MAX_VALUE)
                .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMinimize, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        kGradientPanel3.setkEndColor(new java.awt.Color(0, 102, 204));
        kGradientPanel3.setkStartColor(new java.awt.Color(0, 50, 96));

        kGradientPanel4.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel4.setkGradientFocus(1500);
        kGradientPanel4.setkStartColor(new java.awt.Color(255, 255, 255));

        btnManager.setBackground(new java.awt.Color(0, 29, 66));
        btnManager.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnManager.setText("Manager");
        btnManager.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagerActionPerformed(evt);
            }
        });

        btnCashier.setBackground(new java.awt.Color(51, 51, 51));
        btnCashier.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnCashier.setText("Cashier");
        btnCashier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCashier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCashierActionPerformed(evt);
            }
        });

        jPanelManager.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_male_user_50px.png"))); // NOI18N
        jLabel5.setText("USER NAME :");
        jLabel5.setIconTextGap(20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_password_50px.png"))); // NOI18N
        jLabel6.setText("PASSWORD :");
        jLabel6.setIconTextGap(21);

        txtManegerUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtManegerUser.setForeground(new java.awt.Color(204, 204, 204));
        txtManegerUser.setText("User Name");
        txtManegerUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtManegerUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtManegerUserFocusLost(evt);
            }
        });

        txtManegerPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtManegerPass.setForeground(new java.awt.Color(204, 204, 204));
        txtManegerPass.setText("Password");
        txtManegerPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtManegerPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtManegerPassFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LOGIN FOR MANAGER");
        jLabel4.setMaximumSize(new java.awt.Dimension(189, 22));
        jLabel4.setMinimumSize(new java.awt.Dimension(189, 22));
        jLabel4.setPreferredSize(new java.awt.Dimension(189, 22));

        btnManagerLogin.setBackground(new java.awt.Color(0, 29, 66));
        btnManagerLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnManagerLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnManagerLogin.setText("LOGIN");
        btnManagerLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagerLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelManagerLayout = new javax.swing.GroupLayout(jPanelManager);
        jPanelManager.setLayout(jPanelManagerLayout);
        jPanelManagerLayout.setHorizontalGroup(
            jPanelManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManagerLayout.createSequentialGroup()
                .addGroup(jPanelManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelManagerLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelManagerLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanelManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelManagerLayout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtManegerPass))
                            .addGroup(jPanelManagerLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtManegerUser, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 77, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelManagerLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(btnManagerLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelManagerLayout.setVerticalGroup(
            jPanelManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelManagerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanelManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtManegerUser))
                .addGap(33, 33, 33)
                .addGroup(jPanelManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtManegerPass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnManagerLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jPanelCashier.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_male_user_50px.png"))); // NOI18N
        jLabel13.setText("USER NAME :");
        jLabel13.setIconTextGap(17);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_password_50px.png"))); // NOI18N
        jLabel14.setText("PASSWORD :");
        jLabel14.setIconTextGap(21);

        txtCashierPass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCashierPass.setForeground(new java.awt.Color(204, 204, 204));
        txtCashierPass.setText("Password");
        txtCashierPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCashierPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCashierPassFocusLost(evt);
            }
        });
        txtCashierPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCashierPassActionPerformed(evt);
            }
        });

        txtCashierUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCashierUser.setForeground(new java.awt.Color(204, 204, 204));
        txtCashierUser.setText("User Name");
        txtCashierUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCashierUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCashierUserFocusLost(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("LOGIN FOR CASHIER");

        btnCashierLogin.setBackground(new java.awt.Color(0, 29, 66));
        btnCashierLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCashierLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnCashierLogin.setText("LOGIN");
        btnCashierLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCashierLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCashierLayout = new javax.swing.GroupLayout(jPanelCashier);
        jPanelCashier.setLayout(jPanelCashierLayout);
        jPanelCashierLayout.setHorizontalGroup(
            jPanelCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCashierLayout.createSequentialGroup()
                .addGroup(jPanelCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCashierLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelCashierLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanelCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelCashierLayout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCashierPass))
                            .addGroup(jPanelCashierLayout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtCashierUser, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 77, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelCashierLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(btnCashierLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCashierLayout.setVerticalGroup(
            jPanelCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCashierLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanelCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtCashierUser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanelCashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtCashierPass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnCashierLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout kGradientPanel4Layout = new javax.swing.GroupLayout(kGradientPanel4);
        kGradientPanel4.setLayout(kGradientPanel4Layout);
        kGradientPanel4Layout.setHorizontalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jPanelManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel4Layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(btnManager, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCashier, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                    .addContainerGap(126, Short.MAX_VALUE)
                    .addComponent(jPanelCashier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(145, Short.MAX_VALUE)))
        );
        kGradientPanel4Layout.setVerticalGroup(
            kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManager, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCashier, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanelManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
            .addGroup(kGradientPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel4Layout.createSequentialGroup()
                    .addContainerGap(111, Short.MAX_VALUE)
                    .addComponent(jPanelCashier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(235, Short.MAX_VALUE)))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_user_shield_64px.png"))); // NOI18N
        jLabel3.setText("CITY BANK LOGIN PANEL");

        javax.swing.GroupLayout kGradientPanel3Layout = new javax.swing.GroupLayout(kGradientPanel3);
        kGradientPanel3.setLayout(kGradientPanel3Layout);
        kGradientPanel3Layout.setHorizontalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        kGradientPanel3Layout.setVerticalGroup(
            kGradientPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17)
                .addComponent(kGradientPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        // TODO add your handling code here:
        About ab = new About();
        ab.setVisible(true);
    }//GEN-LAST:event_btnAboutActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void txtCashierPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCashierPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCashierPassActionPerformed

    private void btnCashierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCashierActionPerformed
        // TODO add your handling code here:
        jPanelCashier.setVisible(true);
        jPanelManager.setVisible(false);
        
        btnCashier.setBackground(new java.awt.Color(0, 29, 66));
        btnManager.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_btnCashierActionPerformed

    private void btnManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagerActionPerformed
        // TODO add your handling code here:
        jPanelManager.setVisible(true);
        jPanelCashier.setVisible(false);
        
        btnManager.setBackground(new java.awt.Color(0, 29, 66));
        btnCashier.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_btnManagerActionPerformed

    private void btnMinimizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinimizeActionPerformed
        // TODO add your handling code here:
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizeActionPerformed

    private void btnManagerLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagerLoginActionPerformed
      
        String username = txtManegerUser.getText();
        String password = String.valueOf(txtManegerPass.getPassword());
        
        if(username.isEmpty() || password.isEmpty()){            
            JOptionPane.showMessageDialog(this, "Username / Password should not be empty.", "Error", JOptionPane.ERROR_MESSAGE);                                
        }else {
            //Login Process
            ManagerLogin(username, password);
        }
        
    }//GEN-LAST:event_btnManagerLoginActionPerformed

    private void txtManegerUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtManegerUserFocusGained
        // TODO add your handling code here:
        String usernameValue = txtManegerUser.getText().trim();
        
        if (usernameValue.equals("User Name"))
        {
            txtManegerUser.setText("");
            txtManegerUser.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtManegerUserFocusGained

    private void txtManegerPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtManegerPassFocusLost
        // TODO add your handling code here:
        String passValue = String.valueOf(txtManegerPass.getPassword()).trim();
        
        if (passValue.equals("Password") || passValue.equals(""))
        {
            txtManegerPass.setText("Password");
            txtManegerPass.setForeground(new Color(153,153,153));
        }
       
    }//GEN-LAST:event_txtManegerPassFocusLost

    private void txtManegerPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtManegerPassFocusGained
        // TODO add your handling code here:
        String passValue = String.valueOf(txtManegerPass.getPassword()).trim();
        
        if (passValue.equals("Password"))
        {
            txtManegerPass.setText("");
            txtManegerPass.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtManegerPassFocusGained

    private void txtManegerUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtManegerUserFocusLost
        // TODO add your handling code here:
        String usernameValue = txtManegerUser.getText().trim().toLowerCase();
        
        if (usernameValue.equals("User Name") || usernameValue.equals(""))
        {
            txtManegerUser.setText("User Name");
            txtManegerUser.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtManegerUserFocusLost

    private void btnCashierLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCashierLoginActionPerformed
        // TODO add your handling code here:
        
        String username = txtCashierUser.getText();
        String password = String.valueOf(txtCashierPass.getPassword());
        
        if(username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this, "Username / Password should not be empty.", "Error", JOptionPane.ERROR_MESSAGE);
        }else {
            CashierLogin(username, password);
        }
    }//GEN-LAST:event_btnCashierLoginActionPerformed


    
    private void txtCashierUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCashierUserFocusGained
        String usernameValue = txtCashierUser.getText().trim();
        
        if (usernameValue.equals("User Name"))
        {
            txtCashierUser.setText("");
            txtCashierUser.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtCashierUserFocusGained

    private void txtCashierUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCashierUserFocusLost
        // TODO add your handling code here:
        String usernameValue = txtCashierUser.getText().trim().toLowerCase();
        
        if (usernameValue.equals("User Name") || usernameValue.equals(""))
        {
            txtCashierUser.setText("User Name");
            txtCashierUser.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtCashierUserFocusLost

    private void txtCashierPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCashierPassFocusGained
        // TODO add your handling code here:
        String passValue = String.valueOf(txtCashierPass.getPassword()).trim();
        
        if (passValue.equals("Password"))
        {
            txtCashierPass.setText("");
            txtCashierPass.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtCashierPassFocusGained

    private void txtCashierPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCashierPassFocusLost
        // TODO add your handling code here:
        String passValue = String.valueOf(txtCashierPass.getPassword()).trim();
        
        if (passValue.equals("Password") || passValue.equals(""))
        {
            txtCashierPass.setText("Password");
            txtCashierPass.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtCashierPassFocusLost

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
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnCashier;
    private javax.swing.JButton btnCashierLogin;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnManager;
    private javax.swing.JButton btnManagerLogin;
    private javax.swing.JButton btnMinimize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanelCashier;
    private javax.swing.JPanel jPanelManager;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JPasswordField txtCashierPass;
    private javax.swing.JTextField txtCashierUser;
    private javax.swing.JPasswordField txtManegerPass;
    private javax.swing.JTextField txtManegerUser;
    // End of variables declaration//GEN-END:variables

    private void ManagerLogin(String user, String password) {
        Connection dbconn = DBConnection.connectDB();
        if(dbconn != null){
        try {
            PreparedStatement st = (PreparedStatement)dbconn.prepareStatement("Select * from admindb WHERE user = ? AND password = ?");
            
            st.setString(1, user);
            st.setString(2, password);
            ResultSet res = st.executeQuery();
            
            if(res.next()){
                
                dispose();
                ManagerLogin ML = new ManagerLogin();
                ML.setTitle("Manager Login");
                ML.setVisible(true);
            }else {
                System.out.println("UserName " + user);
                System.out.println("Password " + password);
                JOptionPane.showMessageDialog(this, "Username / Password not found.", "Error", JOptionPane.ERROR_MESSAGE);
                txtManegerUser.setText("");
                txtManegerPass.setText("");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        } else {
            System.out.println("The Connection not available");
        }
    }
    
    private void CashierLogin(String user, String password) {
        Connection dbconn = DBConnection.connectDB();
        if(dbconn != null){
        try {
            PreparedStatement st = (PreparedStatement)dbconn.prepareStatement("Select * from cashierdb WHERE username = ? AND password = ?");
            
            st.setString(1, user);
            st.setString(2, password);
            ResultSet res = st.executeQuery();
            if(res.next()){                
                dispose();
                CashierLogin CL = new CashierLogin();
                CL.setTitle("Cashier Login");
                CL.setVisible(true);
            }else {
                System.out.println("UserName " + user);
                System.out.println("Password " + password);
                JOptionPane.showMessageDialog(this, "Username / Password not found.", "Error", JOptionPane.ERROR_MESSAGE);
                txtCashierUser.setText("");
                txtCashierPass.setText("");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        } else {
            System.out.println("The Connection not available");
        }
    }
    
    
}