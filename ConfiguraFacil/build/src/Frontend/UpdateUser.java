
package Frontend;

import Backend.Business.InterfaceFrontend;
import javax.swing.JFrame;

import Backend.Business.ConfiguraFacil;
import Backend.Business.Employee;
import Backend.Business.InterfaceFrontend;
import Backend.Business.Seller;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.xml.transform.Templates;
import javax.swing.JFrame;

public class UpdateUser extends javax.swing.JFrame {

    private InterfaceFrontend cf;
    private String user;
    
    /**
     * Creates new form addSeller
     */
    public UpdateUser() {
        initComponents();
        this.cf = new ConfiguraFacil();
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
        jLabel2 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        UserEmailTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PhoneNrTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        NIBTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        NIFTextField = new javax.swing.JTextField();
        SSTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        UserNameTextField = new javax.swing.JTextField();
        UserAdressTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        SellerRadioButton = new javax.swing.JRadioButton();
        EmployeeRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("ConfiguraFacil");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setText("Update User");

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Name");

        jLabel4.setText("E-mail");

        jLabel5.setText("Phone Number");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel6.setText("Contacts");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel7.setText("Bank Info");

        jLabel8.setText("NIB");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel9.setText("Personal Info");

        jLabel10.setText("NIF");

        NIFTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NIFTextFieldActionPerformed(evt);
            }
        });

        jLabel11.setText("SS Number");

        jLabel13.setText("Address");

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jLabel16.setText("UserName");

        UserAdressTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserAdressTextFieldActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel12.setText("Profession");

        SellerRadioButton.setText("Seller");
        SellerRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellerRadioButtonActionPerformed(evt);
            }
        });

        EmployeeRadioButton2.setText(" Employee");
        EmployeeRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UserAdressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5)
                                .addComponent(jLabel13)
                                .addComponent(jLabel4)
                                .addComponent(PhoneNrTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                .addComponent(UserEmailTextField))
                            .addComponent(jLabel6))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(NIBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SellerRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(EmployeeRadioButton2)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(NIFTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11)
                                            .addComponent(SSTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                        .addComponent(UserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3)
                                        .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel16)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NIBTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneNrTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NIFTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SellerRadioButton)
                                    .addComponent(EmployeeRadioButton2)))
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SSTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserAdressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(BackButton))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NIFTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NIFTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NIFTextFieldActionPerformed
  
    
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:

        String NIB = this.NIBTextField.getText();
        String NIF = this.NIFTextField.getText();
        String name = this.NameTextField.getText();
        String phoneNr = this.PhoneNrTextField.getText();
        String SS = this.SSTextField.getText();
        String userAdr = this.UserAdressTextField.getText();
        String userMail = this.UserEmailTextField.getText();
        String username = this.UserNameTextField.getText();
        Boolean flag = false;
        Error error = new Error();

        if(!NIB.isEmpty() && !NIF.isEmpty() && !name.isEmpty() && !phoneNr.isEmpty() && !SS.isEmpty() && !userAdr.isEmpty() && !userMail.isEmpty()){
            if(this.SellerRadioButton.isSelected()){
                this.cf = new ConfiguraFacil();
                flag = false;
                try {
                    flag = this.cf.updateSeller(username, name, userMail, phoneNr, userAdr, NIB, NIF, SS);
                } catch (Exception ex) {
                   System.out.println("Error: " +ex.getMessage());
                   error.showError(ex.getMessage());
                }
                
                if(flag){
                    Success success = new Success();
                    success.showSuccess(this.user,"Admin");
                    this.hide();
                    
                } else {
                    error.showError("Unable to update Seller!!");
                }
                
            } else {
                 this.cf = new ConfiguraFacil();
                 flag = false;
                 try {
                     flag = this.cf.updateEmployee(username, name, userMail, phoneNr, userAdr, NIB, NIF, SS);
                 } catch (Exception ex) {
                    System.out.println("Error: " +ex.getMessage());
                    error.showError(ex.getMessage());
                 }
                
                 if(flag){
                     Success success = new Success();
                     success.showSuccess(this.user,"Admin");
                     this.hide();
                    
                 } else {
                     error.showError("Unable to update Employee!!");
                 }
            }
        } else {
            error.showError("Please complete all required text fields!!");
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void clear(){
        NIBTextField.setText("");
        NIFTextField.setText("");
        NameTextField.setText("");
        PhoneNrTextField.setText("");
        SSTextField.setText("");
        UserAdressTextField.setText("");
        UserEmailTextField.setText("");
        UserNameTextField.setText("");
    }
    
    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        Error error = new Error();
        MenuAdmin menuadmin = new MenuAdmin();
        try {
            menuadmin.showMenuAdmin(this.user);
            this.hide();
            clear();
        } catch (Exception ex) {
           System.out.println("Error: " +ex.getMessage());
            error.showError(ex.getMessage());
        }
    }//GEN-LAST:event_BackButtonActionPerformed

    private void UserAdressTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserAdressTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserAdressTextFieldActionPerformed

    private void SellerRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellerRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SellerRadioButtonActionPerformed

    private void EmployeeRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeRadioButton2ActionPerformed

     
    public void showUpdateUserSeller(Seller s, String user){
        this.user = user;
        fillSellerFields(s);
        this.setLocationRelativeTo(null); //center form in the screen
        this.setVisible(true);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void showUpdateUserEmployee(Employee e, String user){
        this.user = user;
        fillEmployeeFields(e);
        this.setLocationRelativeTo(null); //center form in the screen
        this.setVisible(true);
        this.pack();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void fillSellerFields(Seller s){
        this.UserNameTextField.setText(s.getID());
        this.NameTextField.setText(s.getName());
        this.NIBTextField.setText(s.getPhone());
        this.SSTextField.setText(s.getSSocial());
        this.NIBTextField.setText(s.getNIB());
        this.UserEmailTextField.setText(s.getEmail());
        this.PhoneNrTextField.setText(s.getPhone());
        this.UserAdressTextField.setText(s.getAddress());
        this.NIFTextField.setText(s.getNIF());
        this.SellerRadioButton.setSelected(true);
        this.EmployeeRadioButton2.setEnabled(false);
        this.SellerRadioButton.setEnabled(false);
        this.UserNameTextField.setEnabled(false);
    }
    
    private void fillEmployeeFields(Employee e){
        this.UserNameTextField.setText(e.getUserID());
        this.NameTextField.setText(e.getName());
        this.NIBTextField.setText(e.getPhone());
        this.SSTextField.setText(e.getSSocial());
        this.NIBTextField.setText(e.getNIB());
        this.UserEmailTextField.setText(e.getEmail());
        this.PhoneNrTextField.setText(e.getPhone());
        this.UserAdressTextField.setText(e.getAddress());
        this.NIFTextField.setText(e.getNIF());
        this.EmployeeRadioButton2.setSelected(true);
        this.EmployeeRadioButton2.setEnabled(false);
        this.SellerRadioButton.setEnabled(false);
        this.UserNameTextField.setEnabled(false);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JRadioButton EmployeeRadioButton2;
    private javax.swing.JTextField NIBTextField;
    private javax.swing.JTextField NIFTextField;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JTextField PhoneNrTextField;
    private javax.swing.JTextField SSTextField;
    private javax.swing.JRadioButton SellerRadioButton;
    private javax.swing.JTextField UserAdressTextField;
    private javax.swing.JTextField UserEmailTextField;
    private javax.swing.JTextField UserNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}