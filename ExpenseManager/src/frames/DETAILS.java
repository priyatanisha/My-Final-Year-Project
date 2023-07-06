/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;


import beans.ExpenseDetails;
import beans.UserDetails;
import bo.PhonenoValidator;
import frames.SIGN_IN;
import java.awt.Color;
import javax.swing.JOptionPane;
import controller.Controller;

/*
 * @author Dibyadyuti Roy
 */
public class DETAILS extends javax.swing.JFrame {
String uname,umail,upwd,uques,uans;

    public DETAILS() {
        initComponents();
    }
     public DETAILS(String gname,String gmail,String gpassword,String gquestion,String ganswer ) {
        initComponents();
         this.uname=gname;
         this.umail=gmail;
         this.upwd=gpassword;
         this.uans=ganswer;
         this.uques=gquestion;
         mail.setText(umail);
    }
public void register(){
    try{
            UserDetails ud=new UserDetails();
            ud.setName(uname);
            ud.setEmail(umail);
            ud.setPassword(upwd);
            ud.setQues(uques);
            ud.setAns(uans);
            ud.setMonthlyexp(Integer.parseInt(mexp.getText()));
            ud.setIncome(Integer.parseInt(mincome.getText()));
            ud.setAddr(address.getText());
            ud.setPhno(phone.getText());
            ExpenseDetails ed=new ExpenseDetails();
            ed.setEmail(umail);
         ed.setExpense1((expense1.isSelected())?"Bazar":null);
         ed.setExpense2((expense2.isSelected())?"Travel":null);
         ed.setExpense3((expense3.isSelected())?"Grocery":null);
         ed.setExpense4((expense4.isSelected())?"Garments":null);
         ed.setExpense5((expense5.isSelected())?"Doctor/Medicine":null);
         ed.setExpense6((expense6.isSelected())?"Fixed Expense":null);
         ed.setExpense7((expense7.isSelected())?"Accessaries":null);
         ed.setExpense8((expense8.isSelected())?"Others":null);
         Controller c=new Controller();
         c.registerUser(ud, ed);
         this.dispose();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Wrong Inputs");
            
        }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        expense1 = new javax.swing.JCheckBox();
        expense5 = new javax.swing.JCheckBox();
        expense3 = new javax.swing.JCheckBox();
        expense6 = new javax.swing.JCheckBox();
        expense8 = new javax.swing.JCheckBox();
        expense7 = new javax.swing.JCheckBox();
        expense4 = new javax.swing.JCheckBox();
        expense2 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        mail = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mexp = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        mincome = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setFont(new java.awt.Font("MS Gothic", 1, 18)); // NOI18N
        jLabel1.setText("ENTER SOME MORE DETAILS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(424, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        expense1.setBackground(new java.awt.Color(204, 204, 204));
        expense1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        expense1.setText("Bazar");

        expense5.setBackground(new java.awt.Color(204, 204, 204));
        expense5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        expense5.setText("Medicine/Doctore");
        expense5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expense5ActionPerformed(evt);
            }
        });

        expense3.setBackground(new java.awt.Color(204, 204, 204));
        expense3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        expense3.setText("Grocery");

        expense6.setBackground(new java.awt.Color(204, 204, 204));
        expense6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        expense6.setText("Fixed Expense");

        expense8.setBackground(new java.awt.Color(204, 204, 204));
        expense8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        expense8.setText("Others");

        expense7.setBackground(new java.awt.Color(204, 204, 204));
        expense7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        expense7.setText("Accessaries");

        expense4.setBackground(new java.awt.Color(204, 204, 204));
        expense4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        expense4.setText("Garments");

        expense2.setBackground(new java.awt.Color(204, 204, 204));
        expense2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        expense2.setText("Travel");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel2.setText("E_MAIL");

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel4.setText("Estimated Monthly Expense");

        mexp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mexpFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mexpFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel5.setText("Monthly Income");

        mincome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mincomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mincomeFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 14)); // NOI18N
        jLabel6.setText("Phone Number");

        phone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phoneFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phoneFocusLost(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel7.setText("Expense Type");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 18)); // NOI18N
        jLabel8.setText("Address");

        address.setColumns(20);
        address.setRows(5);
        address.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addressFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                addressFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(address);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78)
                                        .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mexp)
                                            .addComponent(mincome)
                                            .addComponent(phone))))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(169, 169, 169))
                                    .addComponent(jScrollPane1)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(expense5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(expense2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(expense3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(expense4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(81, 81, 81)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(expense7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(88, 88, 88)
                                        .addComponent(expense8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(expense6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78)
                                        .addComponent(expense1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(40, 40, 40))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mexp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mincome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expense5)
                    .addComponent(expense3)
                    .addComponent(expense6)
                    .addComponent(expense1))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expense2)
                    .addComponent(expense4)
                    .addComponent(expense7)
                    .addComponent(expense8))
                .addGap(17, 17, 17))
        );

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("RESET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("CONFORM AND SIGN_IN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jButton1)
                        .addGap(85, 85, 85)
                        .addComponent(jButton2)
                        .addGap(79, 79, 79)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void expense5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expense5ActionPerformed

    }//GEN-LAST:event_expense5ActionPerformed

    private void mexpFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mexpFocusGained
        mexp.setBackground(Color.white);mexp.setText("");mexp.setFont(new java.awt.Font("Tahoma", 0, 11));
        
    }//GEN-LAST:event_mexpFocusGained

    private void mexpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mexpFocusLost
         if(mexp.getText().equals("")){mexp.setBackground(new java.awt.Color(249, 217, 217));
        mexp.setFont(new java.awt.Font("Times New Roman", 0, 10));mexp.setText("Invalid Data");}
    }//GEN-LAST:event_mexpFocusLost

    private void addressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusGained
        address.setBackground(Color.white);address.setText("");address.setFont(new java.awt.Font("Tahoma", 0, 11));
    }//GEN-LAST:event_addressFocusGained

    private void addressFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addressFocusLost
        if(address.getText().equals("")){address.setBackground(new java.awt.Color(249, 217, 217));
        address.setFont(new java.awt.Font("Times New Roman", 0, 10));address.setText("Invalid Address");}
    }//GEN-LAST:event_addressFocusLost

    private void mincomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mincomeFocusGained
        mincome.setBackground(Color.white);mincome.setText("");mincome.setFont(new java.awt.Font("Tahoma", 0, 11));
    }//GEN-LAST:event_mincomeFocusGained

    private void mincomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mincomeFocusLost
        if(Integer.parseInt(mincome.getText())<=Integer.parseInt(mexp.getText())){
           mincome.setBackground(new java.awt.Color(249, 217, 217));
        mincome.setFont(new java.awt.Font("Times New Roman", 0, 10));mincome.setText("Enter Income Greater than Expense"); 
        }
    }//GEN-LAST:event_mincomeFocusLost

    private void phoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneFocusGained
        phone.setBackground(Color.white);phone.setText("");phone.setFont(new java.awt.Font("Tahoma", 0, 11));
    }//GEN-LAST:event_phoneFocusGained

    private void phoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phoneFocusLost
         PhonenoValidator p=new PhonenoValidator();
       if(! p.validate(phone.getText()))
         if(phone.getText().equals("")){
        phone.setBackground(new java.awt.Color(249, 217, 217));
        phone.setFont(new java.awt.Font("Times New Roman", 0, 10));phone.setText("Invalid Phone Number");    
       }
    }//GEN-LAST:event_phoneFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 register();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        mexp.setText("");
        mincome.setText("");
        phone.setText("");
        address.setText("");
        expense1.setSelected(false);
        expense2.setSelected(false);
        expense3.setSelected(false);
        expense4.setSelected(false);
        expense5.setSelected(false);
        expense6.setSelected(false);
        expense7.setSelected(false);
        expense8.setSelected(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        new frames.SIGN_IN().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DETAILS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DETAILS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DETAILS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DETAILS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
////                new DETAILS().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JCheckBox expense1;
    private javax.swing.JCheckBox expense2;
    private javax.swing.JCheckBox expense3;
    private javax.swing.JCheckBox expense4;
    private javax.swing.JCheckBox expense5;
    private javax.swing.JCheckBox expense6;
    private javax.swing.JCheckBox expense7;
    private javax.swing.JCheckBox expense8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel mail;
    private javax.swing.JTextField mexp;
    private javax.swing.JTextField mincome;
    private javax.swing.JTextField phone;
    // End of variables declaration//GEN-END:variables
}
