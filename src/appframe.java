/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import javax.swing.JOptionPane;
public class appframe extends javax.swing.JFrame {
    private final String[] accountNumbers = {"123456", "789012"}; // Sample account numbers
    private final String[] pinNumbers = {"1111", "2222"}; // Sample PIN numbers
    private final double[] bankBalances = {1000.0, 2000.0}; // Sample bank balances
    private final String[] accountHolders = {"Venkat", "Balaji"}; // Sample account holders names

    private int loggedInAccountIndex = -1; // To keep track of the logged-in account
    public appframe() {
        initComponents();
        setTitle("ATM Simulator");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPanel = new javax.swing.JPanel();
        WelcomeTitle = new javax.swing.JLabel();
        AccountNumberLabel = new javax.swing.JLabel();
        PinNumberLabel = new javax.swing.JLabel();
        AccountNumberInput = new javax.swing.JTextField();
        PinNumberInput = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();
        MenuPanel = new javax.swing.JPanel();
        MainMenuTitle = new javax.swing.JLabel();
        UserNameLabel = new javax.swing.JLabel();
        BankBalanceLabel = new javax.swing.JLabel();
        DepositButton = new javax.swing.JButton();
        WithdrawButton = new javax.swing.JButton();
        LogoutButton = new javax.swing.JButton();
        DepositPanel = new javax.swing.JPanel();
        DepositTitle = new javax.swing.JLabel();
        DepositMoneyLabel = new javax.swing.JLabel();
        DepositMoneyInput = new javax.swing.JTextField();
        DepositMoneyButton = new javax.swing.JButton();
        WithdrawPanel = new javax.swing.JPanel();
        WithdrawTitle = new javax.swing.JLabel();
        WithdrawMoneyLabel = new javax.swing.JLabel();
        WithdrawMoneyInput = new javax.swing.JTextField();
        WithdrawMoneyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        WelcomeTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        WelcomeTitle.setText("Welcome to the ATM");

        AccountNumberLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AccountNumberLabel.setText("Account Number :");

        PinNumberLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PinNumberLabel.setText("PIN Number :");

        LoginButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(LoginButton))
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(WelcomeTitle)
                            .addGroup(LoginPanelLayout.createSequentialGroup()
                                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(PinNumberLabel)
                                    .addComponent(AccountNumberLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AccountNumberInput)
                                    .addComponent(PinNumberInput, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(WelcomeTitle)
                .addGap(55, 55, 55)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccountNumberLabel)
                    .addComponent(AccountNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PinNumberLabel)
                    .addComponent(PinNumberInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(LoginButton)
                .addGap(51, 51, 51))
        );

        getContentPane().add(LoginPanel, "card2");

        MainMenuTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        MainMenuTitle.setText("Main Menu");

        UserNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        UserNameLabel.setText("Account Holder : ");

        BankBalanceLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BankBalanceLabel.setText("Bank Balance : ");

        DepositButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DepositButton.setText("Deposit Money");
        DepositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositButtonActionPerformed(evt);
            }
        });

        WithdrawButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        WithdrawButton.setText("Withdraw Money");
        WithdrawButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawButtonActionPerformed(evt);
            }
        });

        LogoutButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LogoutButton.setText("Logout");
        LogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(MainMenuTitle))
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BankBalanceLabel)
                            .addComponent(UserNameLabel)
                            .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(WithdrawButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DepositButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(MainMenuTitle)
                .addGap(18, 18, 18)
                .addComponent(UserNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BankBalanceLabel)
                .addGap(18, 18, 18)
                .addComponent(DepositButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(WithdrawButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LogoutButton)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(MenuPanel, "card3");

        DepositTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        DepositTitle.setText("Deposit Money");

        DepositMoneyLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DepositMoneyLabel.setText("Enter the amount :");

        DepositMoneyButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DepositMoneyButton.setText("Deposit");
        DepositMoneyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositMoneyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DepositPanelLayout = new javax.swing.GroupLayout(DepositPanel);
        DepositPanel.setLayout(DepositPanelLayout);
        DepositPanelLayout.setHorizontalGroup(
            DepositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DepositPanelLayout.createSequentialGroup()
                .addGroup(DepositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DepositPanelLayout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(DepositTitle))
                    .addGroup(DepositPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(DepositMoneyLabel)
                        .addGap(18, 18, 18)
                        .addComponent(DepositMoneyInput, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DepositPanelLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(DepositMoneyButton)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        DepositPanelLayout.setVerticalGroup(
            DepositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DepositPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(DepositTitle)
                .addGap(45, 45, 45)
                .addGroup(DepositPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DepositMoneyLabel)
                    .addComponent(DepositMoneyInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(DepositMoneyButton)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        getContentPane().add(DepositPanel, "card4");

        WithdrawTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        WithdrawTitle.setText("Withdraw Money");

        WithdrawMoneyLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        WithdrawMoneyLabel.setText("Enter the amount :");

        WithdrawMoneyButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        WithdrawMoneyButton.setText("Withdraw");
        WithdrawMoneyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawMoneyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout WithdrawPanelLayout = new javax.swing.GroupLayout(WithdrawPanel);
        WithdrawPanel.setLayout(WithdrawPanelLayout);
        WithdrawPanelLayout.setHorizontalGroup(
            WithdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WithdrawPanelLayout.createSequentialGroup()
                .addGroup(WithdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(WithdrawPanelLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(WithdrawMoneyLabel)
                        .addGap(18, 18, 18)
                        .addComponent(WithdrawMoneyInput, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(WithdrawPanelLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(WithdrawMoneyButton))
                    .addGroup(WithdrawPanelLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(WithdrawTitle)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        WithdrawPanelLayout.setVerticalGroup(
            WithdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(WithdrawPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(WithdrawTitle)
                .addGap(46, 46, 46)
                .addGroup(WithdrawPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WithdrawMoneyLabel)
                    .addComponent(WithdrawMoneyInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(WithdrawMoneyButton)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        getContentPane().add(WithdrawPanel, "card4");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        String enteredAccountNumber = AccountNumberInput.getText();
        String enteredPin = new String(PinNumberInput.getPassword());
        boolean isValidLogin = false;
        for (int i = 0; i < accountNumbers.length; i++) {
            if (enteredAccountNumber.equals(accountNumbers[i]) && enteredPin.equals(pinNumbers[i])) {
                isValidLogin = true;
                loggedInAccountIndex = i;
                break;
            }
        }
        if (isValidLogin) {
            showMainMenu();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid account number or PIN. Please try again.", "Login Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void LogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutButtonActionPerformed
        loggedInAccountIndex = -1;
        AccountNumberInput.setText("");
        PinNumberInput.setText("");
        LoginPanel.setVisible(true);
        MenuPanel.setVisible(false);
    }//GEN-LAST:event_LogoutButtonActionPerformed

    private void DepositMoneyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositMoneyButtonActionPerformed
        String depositAmountStr = DepositMoneyInput.getText();
    try {
        double depositAmount = Double.parseDouble(depositAmountStr);
        
        if (depositAmount <= 0) {
            JOptionPane.showMessageDialog(this, "Please enter a valid deposit amount.", "Invalid Amount", JOptionPane.ERROR_MESSAGE);
        } else {
            bankBalances[loggedInAccountIndex] += depositAmount;
            JOptionPane.showMessageDialog(this, "Money deposited successfully", "Deposit Successful", JOptionPane.INFORMATION_MESSAGE);
            DepositMoneyInput.setText("");
            showMainMenu();
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Please enter a valid deposit amount.", "Invalid Amount", JOptionPane.ERROR_MESSAGE);
    }
    
    }//GEN-LAST:event_DepositMoneyButtonActionPerformed

    private void DepositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositButtonActionPerformed
        LoginPanel.setVisible(false);
        MenuPanel.setVisible(false);
        DepositPanel.setVisible(true);
        WithdrawPanel.setVisible(false);
    }//GEN-LAST:event_DepositButtonActionPerformed

    private void WithdrawMoneyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawMoneyButtonActionPerformed
        String withdrawAmountStr = WithdrawMoneyInput.getText();
    try {
        double withdrawAmount = Double.parseDouble(withdrawAmountStr);
        
        if (withdrawAmount <= 0) {
            JOptionPane.showMessageDialog(this, "Please enter a valid deposit amount.", "Invalid Amount", JOptionPane.ERROR_MESSAGE);
        } else if (bankBalances[loggedInAccountIndex]-withdrawAmount<0) {
            JOptionPane.showMessageDialog(this, "Bank balance is lower than the withdraw amount.", "Invalid Amount", JOptionPane.ERROR_MESSAGE);
        }
        else {
            bankBalances[loggedInAccountIndex] -= withdrawAmount;
            JOptionPane.showMessageDialog(this, "Money withdraw successfully", "Deposit Successful", JOptionPane.INFORMATION_MESSAGE);
            WithdrawMoneyInput.setText("");
            showMainMenu();
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Please enter a valid deposit amount.", "Invalid Amount", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_WithdrawMoneyButtonActionPerformed

    private void WithdrawButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawButtonActionPerformed
        LoginPanel.setVisible(false);
        MenuPanel.setVisible(false);
        DepositPanel.setVisible(false);
        WithdrawPanel.setVisible(true);
    }//GEN-LAST:event_WithdrawButtonActionPerformed

    private void showMainMenu() {
        LoginPanel.setVisible(false);
        MenuPanel.setVisible(true);
        DepositPanel.setVisible(false);
        WithdrawPanel.setVisible(false);
        String userName = accountHolders[loggedInAccountIndex];
        double userBalance = bankBalances[loggedInAccountIndex];
        UserNameLabel.setText("Account holder : "+userName);
        BankBalanceLabel.setText("Account balance : "+String.valueOf(userBalance));
    }
    public static void main(String args[]) {
        try {
    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
            javax.swing.UIManager.setLookAndFeel(info.getClassName());
            break;
        }
    }
} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
    java.util.logging.Logger.getLogger(appframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new appframe().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AccountNumberInput;
    private javax.swing.JLabel AccountNumberLabel;
    private javax.swing.JLabel BankBalanceLabel;
    private javax.swing.JButton DepositButton;
    private javax.swing.JButton DepositMoneyButton;
    private javax.swing.JTextField DepositMoneyInput;
    private javax.swing.JLabel DepositMoneyLabel;
    private javax.swing.JPanel DepositPanel;
    private javax.swing.JLabel DepositTitle;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JButton LogoutButton;
    private javax.swing.JLabel MainMenuTitle;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JPasswordField PinNumberInput;
    private javax.swing.JLabel PinNumberLabel;
    private javax.swing.JLabel UserNameLabel;
    private javax.swing.JLabel WelcomeTitle;
    private javax.swing.JButton WithdrawButton;
    private javax.swing.JButton WithdrawMoneyButton;
    private javax.swing.JTextField WithdrawMoneyInput;
    private javax.swing.JLabel WithdrawMoneyLabel;
    private javax.swing.JPanel WithdrawPanel;
    private javax.swing.JLabel WithdrawTitle;
    // End of variables declaration//GEN-END:variables
}
