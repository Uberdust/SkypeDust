/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.uberdust.skypedust.ui;

import eu.uberdust.skypedust.FileManage;
import eu.uberdust.skypedust.LogFiles;
import eu.uberdust.skypedust.PluginException;
import eu.uberdust.skypedust.PluginManager;
import eu.uberdust.skypedust.useraccount.UserAccount;
import java.awt.CardLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.table.DefaultTableModel;
import eu.uberdust.skypedust.connectivity.SkypedustWebSocket;
import eu.uberdust.skypedust.pojos.PluginSettings;
import eu.uberdust.skypedust.requestformater.RequestInterface;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;

/**
 *
 * @author Gkatziouras Emmanouil (gkatzioura)
 */
public class SkypeDustApp extends javax.swing.JFrame {

    /**
     * Creates new form SkypeDustApp
     */
    public SkypeDustApp() {
        initComponents();
        userAccount = new UserAccount();
        if(userAccount.userSettings!=null){
            usernameTextField.setText(userAccount.userSettings.getUsername());
            nicknameTextField.setText(userAccount.userSettings.getNickname());
            passwordPasswordField.setText(userAccount.userSettings.getPassword());
        }
        userAccount.initSaccount(this);
        userAccount.startListener();
        this.addWindowListener(winlistener);
        //SkypedustWebSocket.getInstance().getUpdate("urn:test:0x1","light");
    }
    
    //@Override
    //void onW
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        skypeAccountPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usernameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nicknameTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordPasswordField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        skypeFriendPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        contactTextField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        model = new DefaultListModel();
        contactsjList = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        concommandsjList = new javax.swing.JList();
        skypeMessagePanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        settingsPanel = new javax.swing.JPanel();
        asyncmsgCheckBox = new javax.swing.JCheckBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        pluginsPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        skypeMenu = new javax.swing.JMenu();
        skypeAccountItem = new javax.swing.JMenuItem();
        skypefriendsItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setText("Skype Username");

        usernameTextField.setText("Your Username");

        jLabel2.setText("Nickname Displayed");

        nicknameTextField.setText("Your Nickname");

        jLabel3.setText("Password");

        passwordPasswordField.setText("jPasswordField1");

        jButton1.setText("Save Settings");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout skypeAccountPanelLayout = new javax.swing.GroupLayout(skypeAccountPanel);
        skypeAccountPanel.setLayout(skypeAccountPanelLayout);
        skypeAccountPanelLayout.setHorizontalGroup(
            skypeAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(skypeAccountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(skypeAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(skypeAccountPanelLayout.createSequentialGroup()
                        .addGroup(skypeAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(20, 20, 20)
                        .addGroup(skypeAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameTextField)
                            .addComponent(nicknameTextField)
                            .addComponent(passwordPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                        .addContainerGap(147, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, skypeAccountPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );
        skypeAccountPanelLayout.setVerticalGroup(
            skypeAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(skypeAccountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(skypeAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(skypeAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nicknameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(17, 17, 17)
                .addGroup(skypeAccountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(32, 32, 32))
        );

        mainPanel.add(skypeAccountPanel, "card2");

        jLabel4.setText("Contacts");

        jLabel5.setText("Allowed to issue commands");

        jLabel6.setText("Add Contact");

        contactTextField.setText("Skype Contact");

        jButton2.setText("Add");

        jLabel7.setText("Drag and Drop to allow Contacts ");

        jLabel8.setText("to issue commands");

        contactsjList.setModel(model);
        jScrollPane1.setViewportView(contactsjList);

        concommandsjList.setModel(model);
        jScrollPane2.setViewportView(concommandsjList);

        javax.swing.GroupLayout skypeFriendPanelLayout = new javax.swing.GroupLayout(skypeFriendPanel);
        skypeFriendPanel.setLayout(skypeFriendPanelLayout);
        skypeFriendPanelLayout.setHorizontalGroup(
            skypeFriendPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(skypeFriendPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(skypeFriendPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(skypeFriendPanelLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(skypeFriendPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(skypeFriendPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, skypeFriendPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addGap(21, 21, 21))
        );
        skypeFriendPanelLayout.setVerticalGroup(
            skypeFriendPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(skypeFriendPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(skypeFriendPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(skypeFriendPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(skypeFriendPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(contactTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(skypeFriendPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(jLabel8))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        mainPanel.add(skypeFriendPanel, "card3");

        jLabel9.setText("Last Messages");

        tableModel.addColumn("DateTime");
        tableModel.addColumn("Contact");
        tableModel.addColumn("Message");
        jTable1.setModel(tableModel);
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout skypeMessagePanel1Layout = new javax.swing.GroupLayout(skypeMessagePanel1);
        skypeMessagePanel1.setLayout(skypeMessagePanel1Layout);
        skypeMessagePanel1Layout.setHorizontalGroup(
            skypeMessagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(skypeMessagePanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(skypeMessagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        skypeMessagePanel1Layout.setVerticalGroup(
            skypeMessagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(skypeMessagePanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        mainPanel.add(skypeMessagePanel1, "card4");

        settingsPanel.setName("card5"); // NOI18N

        asyncmsgCheckBox.setText("Unsynchronous Messaging");
        asyncmsgCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asyncmsgCheckBoxActionPerformed(evt);
            }
        });

        jLabel11.setText("UberDust Url");

        jButton9.setText("Set Url");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout settingsPanelLayout = new javax.swing.GroupLayout(settingsPanel);
        settingsPanel.setLayout(settingsPanelLayout);
        settingsPanelLayout.setHorizontalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(settingsPanelLayout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton9))
                    .addComponent(asyncmsgCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        settingsPanelLayout.setVerticalGroup(
            settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(settingsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addGap(31, 31, 31)
                .addComponent(asyncmsgCheckBox)
                .addContainerGap(203, Short.MAX_VALUE))
        );

        mainPanel.add(settingsPanel, "card5");

        pluginsPanel.setName("card6"); // NOI18N

        jLabel10.setText("Request Formatter");

        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel12.setText("Auto Plugin");

        reqpluginModel.addColumn("Name");
        jTable2.setModel(reqpluginModel);
        jScrollPane4.setViewportView(jTable2);

        jButton4.setText("Select");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Remove");

        jButton6.setText("Add");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Author", "On"
            }
        ));
        jScrollPane5.setViewportView(jTable3);

        jButton7.setText("Select");

        jButton8.setText("Remove");

        javax.swing.GroupLayout pluginsPanelLayout = new javax.swing.GroupLayout(pluginsPanel);
        pluginsPanel.setLayout(pluginsPanelLayout);
        pluginsPanelLayout.setHorizontalGroup(
            pluginsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pluginsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pluginsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pluginsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pluginsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        pluginsPanelLayout.setVerticalGroup(
            pluginsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pluginsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pluginsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pluginsPanelLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addGap(12, 12, 12)
                        .addComponent(jButton5))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(pluginsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pluginsPanelLayout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7)
                        .addGap(9, 9, 9)
                        .addComponent(jButton8))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        mainPanel.add(pluginsPanel, "card6");

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        skypeMenu.setMnemonic('e');
        skypeMenu.setText("Skype");

        skypeAccountItem.setText("Your Skype Account");
        skypeAccountItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skypeAccountItemActionPerformed(evt);
            }
        });
        skypeMenu.add(skypeAccountItem);

        skypefriendsItem.setText("Skype Friends");
        skypefriendsItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                skypefriendsItemActionPerformed(evt);
            }
        });
        skypeMenu.add(skypefriendsItem);

        jMenuItem1.setText("Chat Commands Center");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        skypeMenu.add(jMenuItem1);

        menuBar.add(skypeMenu);

        jMenu1.setText("Settings");

        jMenuItem2.setText("Settings");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        menuBar.add(jMenu1);

        jMenu2.setText("Plugins");

        jMenuItem3.setText("Manage Plugins");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        menuBar.add(jMenu2);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        JDialog about = new SkypeDustAboutBox(this, rootPaneCheckingEnabled);
        about.show();
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void skypefriendsItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skypefriendsItemActionPerformed
        cardSwitcher("card3");
    }//GEN-LAST:event_skypefriendsItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        cardSwitcher("card4");
        
        String[][] rows = LogFiles.lastMessages(4);
        
        for(String[] row: rows) {
            tableModel.addRow(row);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void skypeAccountItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_skypeAccountItemActionPerformed
        cardSwitcher("card2");
    }//GEN-LAST:event_skypeAccountItemActionPerformed

    private void asyncmsgCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asyncmsgCheckBoxActionPerformed
        if(asyncmsgCheckBox.isCursorSet()) {
            asyncmsg = true;
        }
        else {
            asyncmsg = false;
        }
    }//GEN-LAST:event_asyncmsgCheckBoxActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        cardSwitcher("card5");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        userAccount.setAccount(
                usernameTextField.getText(),
                nicknameTextField.getText(),
                passwordPasswordField.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        cardSwitcher("card6");
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        jFileChooser.showDialog(this,"Select Request Formatter Plugin");
        try {
            String path = jFileChooser.getSelectedFile().getAbsolutePath();
            PluginSettings pluginSettings = PluginManager.addrequestFormatter(path);
            
            if(pluginSettings!=null) {
                reqpluginModel.addRow(new Object[]{pluginSettings.getPath()});
            }
        } catch (PluginException ex) {
            Logger.getLogger(SkypeDustApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jFileChooser.showDialog(this,"Select Auto Plugin");
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    
        int i;
        if(( i = jTable2.getSelectedRow())!=-1) {
            System.out.println(reqpluginModel.getValueAt(0, i));
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        System.out.println(jTextField1.getText());
        String urlreg = "^(https?|ftp|file)://.+$";
        if(jTextField1.getText().matches(urlreg)) {
            System.out.println("matched");
        }
        else {
            System.out.println("no matched");
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void cardSwitcher(String card){
        CardLayout cardLayout = (CardLayout)(mainPanel.getLayout());
        cardLayout.show(mainPanel,card);
    }
    
    public void setContactList(String[] constring){

        model = new DefaultListModel();
        for(String i:constring)
            model.addElement(i);
        contactsjList.setModel(model);
        jScrollPane1.getViewport().setView(contactsjList);
            
    }

    public void setAllowedList(String[] allowedstring){
    
        System.out.println("set Allowed Contacts List");
        model = new DefaultListModel();
        for(String i:allowedstring)
            model.addElement(i);
        
        concommandsjList.setModel(model);
        jScrollPane2.getViewport().setView(concommandsjList);     
    }    
    
    private WindowListener winlistener = new WindowListener() {

        @Override
        public void windowOpened(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void windowClosing(WindowEvent e) {
            userAccount.stopSaccount();
        }

        @Override
        public void windowClosed(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void windowIconified(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void windowActivated(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet.");
            
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            //throw new UnsupportedOperationException("Not supported yet.");
        }
    };    
    
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JCheckBox asyncmsgCheckBox;
    private javax.swing.JList concommandsjList;
    private javax.swing.JTextField contactTextField;
    private javax.swing.JList contactsjList;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField nicknameTextField;
    private javax.swing.JPasswordField passwordPasswordField;
    private javax.swing.JPanel pluginsPanel;
    private javax.swing.JPanel settingsPanel;
    private javax.swing.JMenuItem skypeAccountItem;
    private javax.swing.JPanel skypeAccountPanel;
    private javax.swing.JPanel skypeFriendPanel;
    private javax.swing.JMenu skypeMenu;
    private javax.swing.JPanel skypeMessagePanel1;
    private javax.swing.JMenuItem skypefriendsItem;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables
    
    private JFileChooser jFileChooser = new JFileChooser();
    private UserAccount userAccount;
    private ConlistHandler conlistHandler = new ConlistHandler();
    private DefaultListModel model = new DefaultListModel();
    private DefaultTableModel tableModel = new DefaultTableModel();
    private DefaultTableModel reqpluginModel = new DefaultTableModel();
    private boolean asyncmsg = false;
}
