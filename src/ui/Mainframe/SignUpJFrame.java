/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Mainframe;

import ui.Mainframe.MainJFrame;
import business.DB4OUtil.DB4OUtil;
import business.EcoSystem;
import business.Employee.Employee;
import business.Enterprise.Enterprise;
import business.Enterprise.EnterpriseDirectory;
import business.Network.Network;
import business.Organization.Organization;
import business.Role.CaseReporterRole;
import business.UserAccount.UserAccount;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static java.time.Clock.system;
import java.util.Properties;
import javax.imageio.ImageIO;
import javax.mail.Message;
import javax.mail.Session;
import javax.swing.ImageIcon;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.Transport;
import javax.swing.JOptionPane;
/**
 *
 * @author abhishekbagdare
 */
public class SignUpJFrame extends javax.swing.JFrame {

    /**
     * Creates new form SignUpJFrame
     */
   EnterpriseDirectory enterpriseDirectory;
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public SignUpJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        this.setSize(1080, 680);
        this.setExtendedState(MainJFrame.MAXIMIZED_BOTH);
        populateNetworkComboBox();
       // emailValidator();
    }
 private void populateNetworkComboBox(){
        networkJComboBox.removeAllItems();
        
        for (Network network : system.getNetworkList()){
            networkJComboBox.addItem(network);
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        detailsjPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fnamejLabel = new javax.swing.JLabel();
        contactjLabel = new javax.swing.JLabel();
        usernamejLabel = new javax.swing.JLabel();
        passwordjLabel = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        contactTextField = new javax.swing.JTextField();
        usernameJTextField = new javax.swing.JTextField();
        signupjButton = new javax.swing.JButton();
        passwordJPasswordField = new javax.swing.JPasswordField();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        detailsjPanel.setBackground(new java.awt.Color(255, 255, 255));
        detailsjPanel.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 126, 34));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Enter your details below ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.ipadx = 86;
        gridBagConstraints.ipady = 33;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 142, 0, 0);
        detailsjPanel.add(jLabel1, gridBagConstraints);

        fnamejLabel.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        fnamejLabel.setText("Full Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 46;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 142, 0, 0);
        detailsjPanel.add(fnamejLabel, gridBagConstraints);

        contactjLabel.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        contactjLabel.setText("Contact Number");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 142, 0, 0);
        detailsjPanel.add(contactjLabel, gridBagConstraints);

        usernamejLabel.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        usernamejLabel.setText("Username");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 142, 0, 0);
        detailsjPanel.add(usernamejLabel, gridBagConstraints);

        passwordjLabel.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        passwordjLabel.setText("Password");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 48;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 142, 0, 0);
        detailsjPanel.add(passwordjLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 125;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 27, 0, 0);
        detailsjPanel.add(nameJTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 125;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 27, 0, 0);
        detailsjPanel.add(contactTextField, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 125;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 27, 0, 0);
        detailsjPanel.add(usernameJTextField, gridBagConstraints);

        signupjButton.setBackground(new java.awt.Color(51, 102, 255));
        signupjButton.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        signupjButton.setForeground(new java.awt.Color(255, 255, 255));
        signupjButton.setText("Sign Up");
        signupjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                signupjButtonMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                signupjButtonMouseEntered(evt);
            }
        });
        signupjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupjButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 51, 20, 0);
        detailsjPanel.add(signupjButton, gridBagConstraints);

        passwordJPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordJPasswordFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 125;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 27, 0, 0);
        detailsjPanel.add(passwordJPasswordField, gridBagConstraints);

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 74;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 27, 0, 0);
        detailsjPanel.add(networkJComboBox, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Monaco", 1, 18)); // NOI18N
        jLabel2.setText("City");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 142, 0, 0);
        detailsjPanel.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 10;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 24;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 106);
        detailsjPanel.add(jLabel3, gridBagConstraints);

        getContentPane().add(detailsjPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1380, 560));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridBagLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 826, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Monaco", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 102, 255));
        jButton1.setText("Child Rescue Volunteer");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 130));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signupjButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupjButtonMouseEntered
        signupjButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_signupjButtonMouseEntered

    private void signupjButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signupjButtonMouseExited
        signupjButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_signupjButtonMouseExited

    private void signupjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupjButtonActionPerformed

        if(nameJTextField.getText().isEmpty() || contactTextField.getText().isEmpty() ||
            "ssgetText()".isEmpty() || usernameJTextField.getText().isEmpty() ||
            passwordJPasswordField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please fill all details", "Info", JOptionPane.INFORMATION_MESSAGE);
        }else{

            Network network = (Network) networkJComboBox.getSelectedItem();

            String username = usernameJTextField.getText();
            String password = String.valueOf(passwordJPasswordField.getPassword());
            String name = nameJTextField.getText();
            String contactno=contactTextField.getText();
            //long contact=Long.parseLong(contactno);
            String email="aaa@gmail.com";

            if(isNumber(contactno)){
                // JOptionPane.showMessageDialog(null, "Info added!", "Info", JOptionPane.INFORMATION_MESSAGE);
                long contact = Long.parseLong(contactno);

            }
            else{
                JOptionPane.showMessageDialog(null, "Contact should be a number!", "Warning", JOptionPane.INFORMATION_MESSAGE);
            }

            int length= contactno.length();
            if(length<10||length>10)
            {
                contactTextField.setEditable(true);
                JOptionPane.showMessageDialog(null, "Contact should be 10 digits!", "Warning", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            else
            {
                contactTextField.setEditable(false);

            }

            String validate="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
            if(1==0)
            {
                JOptionPane.showMessageDialog(null, "Please enter valid email");
                return;
            }
            //System.out.println("start1");
            boolean x = true;

            if(network.getEnterpriseDirectory().searchEnterprisebyType(Enterprise.EnterpriseType.CaseReporter)==null){
                x=false;
            }

            if(x==true){
                Enterprise enterprise = network.getEnterpriseDirectory().searchEnterprisebyType(Enterprise.EnterpriseType.CaseReporter);
                //System.out.println("start2");
                if(enterprise.getOrganizationDirectory().searchOrganizationbyname("CaseReporterOrganization")==null){
                    //System.out.println("start3");
                    Organization.Type type = (Organization.Type) Organization.Type.CaseReporter;
                    Organization org= enterprise.getOrganizationDirectory().createOrganization(type);
                    Employee employee= org.getEmployeeDirectory().createEmployee(name);
                    if(org.getUserAccountDirectory().CheckIsValidInput(password)){
                        UserAccount userAccount=org.getUserAccountDirectory().createUserAccnt(username, password, employee, new CaseReporterRole());
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Password should have a minimum length of 8 and contain atleast 1 Uppercase, 1 Lowercase, 1 Special character and 1 Digit ");
                        passwordJPasswordField.setText("");
                        return;
                    }

                }
                else{
                    //System.out.println("start4");

                    Organization org = enterprise.getOrganizationDirectory().searchOrganizationbyname("CaseReporterOrganization");
                    Employee employee= org.getEmployeeDirectory().createEmployee(name);
                    if(org.getUserAccountDirectory().CheckIsValidInput(password)){
                        UserAccount userAccount=org.getUserAccountDirectory().createUserAccnt(username, password, employee, new CaseReporterRole());
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Password should have a minimum length of 8 and contain atleast 1 Uppercase, 1 Lowercase, 1 Special character and 1 Digit ");
                        passwordJPasswordField.setText("");
                        return;
                    }
                }
            }
            else{
                Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise("HS", Enterprise.EnterpriseType.CaseReporter);
                if(enterprise.getOrganizationDirectory().searchOrganizationbyname("CaseReporterOrganization")==null){
                    //System.out.println("start3");
                    Organization.Type type = (Organization.Type) Organization.Type.CaseReporter;
                    Organization org= enterprise.getOrganizationDirectory().createOrganization(type);
                    Employee employee= org.getEmployeeDirectory().createEmployee(name);
                    if(org.getUserAccountDirectory().CheckIsValidInput(password)){
                        UserAccount userAccount=org.getUserAccountDirectory().createUserAccnt(username, password, employee, new CaseReporterRole());
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Password should have a minimum length of 8 and contain atleast 1 Uppercase, 1 Lowercase, 1 Special character and 1 Digit ");
                        passwordJPasswordField.setText("");
                        return;
                    }

                }
                else{
                    //System.out.println("start4");
                    Organization org = enterprise.getOrganizationDirectory().searchOrganizationbyname("CaseReporterOrganization");
                    Employee employee= org.getEmployeeDirectory().createEmployee(name);
                    if(org.getUserAccountDirectory().CheckIsValidInput(password)){
                        UserAccount userAccount=org.getUserAccountDirectory().createUserAccnt(username, password, employee, new CaseReporterRole());
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Password should have a minimum length of 8 and contain atleast 1 Uppercase, 1 Lowercase, 1 Special character and 1 Digit ");
                        passwordJPasswordField.setText("");
                        return;
                    }
                }
            }

            String FromEmail="sexualawareness.help@gmail.com";
            String FromEmailPass="Fin@lProject21";
            String Subject = "Sign up successful";

            Properties properties=new Properties();
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.port", "587");

            Session session=Session.getDefaultInstance(properties, new javax.mail.Authenticator(){
                @Override
                protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication(FromEmail,FromEmailPass);
                }
            });

            try
            {
                Message msg=new MimeMessage(session);
                msg.setFrom(new InternetAddress(FromEmail));
                msg.addRecipients(Message.RecipientType.TO, InternetAddress.parse(email));
                msg.setSubject("Sign up Successful, " +username );
                msg.setText("Dear "+ name+"\n"+"You have signed up successfully. Thank you for signing up."+"\n"+"Best");
                Transport.send(msg);
            }catch(Exception e)
            {
                System.out.println(""+e);
            }

            //UserAccount ua=system.getUserAccountDirectory().searchUserAccount(username, password);
            //Enterprise enterprise = network.getEnterpriseDirectory().searchEnterprisebyType(Enterprise.EnterpriseType.HelpSeeker);
            this.setVisible(false);
            Enterprise enterprise = network.getEnterpriseDirectory().searchEnterprisebyType(Enterprise.EnterpriseType.CaseReporter);
            Organization org = enterprise.getOrganizationDirectory().searchOrganizationbyname("CaseReporterOrganization");
            UserAccount ua= org.getUserAccountDirectory().authenticateUserAccnt(username, password);
            //ReportJFrame r = new ReportJFrame(system,network,ua,org);
            dB4OUtil.storeSystem(system);
            SignInJFrame s = new SignInJFrame();
            s.setVisible(true);
        }

    }//GEN-LAST:event_signupjButtonActionPerformed

    private void passwordJPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordJPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordJPasswordFieldActionPerformed

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        /*  Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }*/
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        MainJFrame eng = new MainJFrame();
        eng.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setForeground(Color.white);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseExited

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
            java.util.logging.Logger.getLogger(SignUpJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUpJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUpJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUpJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpJFrame().setVisible(true);
            }
        });
    }

    
public static boolean isNumber(String price){
        try{
            Long.parseLong(price);
            return true;    
        }
        catch(Exception e)
        {
             return false;
        }  
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contactTextField;
    private javax.swing.JLabel contactjLabel;
    private javax.swing.JPanel detailsjPanel;
    private javax.swing.JLabel fnamejLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JLabel passwordjLabel;
    private javax.swing.JButton signupjButton;
    private javax.swing.JTextField usernameJTextField;
    private javax.swing.JLabel usernamejLabel;
    // End of variables declaration//GEN-END:variables
}