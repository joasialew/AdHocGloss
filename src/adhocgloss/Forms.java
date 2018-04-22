package adhocgloss;

import java.awt.Toolkit;
import java.awt.event.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;



public class Forms extends javax.swing.JFrame {
    
    boolean isListSelected = false;
    

    public Forms() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("rysunek.png"));
        this.setResizable(true);
        this.setDefaultCloseOperation(3);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newEntry = new javax.swing.JButton();
        quiz = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        back = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ad Hoc Gloss");
        setBounds(new java.awt.Rectangle(100, 100, 770, 565));
        setFocusTraversalPolicyProvider(true);
        setFocusable(false);
        setIconImage(Toolkit.getDefaultToolkit().getImage("rysunek.png"));
        setMinimumSize(new java.awt.Dimension(770, 565));
        setName("Ad Hoc Gloss"); // NOI18N
        setPreferredSize(new java.awt.Dimension(770, 565));
        setResizable(false);
        setSize(new java.awt.Dimension(770, 565));
        getContentPane().setLayout(null);

        newEntry.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        newEntry.setText("NOWY WPIS");
        newEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newEntryActionPerformed(evt);
            }
        });
        getContentPane().add(newEntry);
        newEntry.setBounds(30, 20, 139, 40);

        quiz.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        quiz.setText("QUIZ");
        quiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quizActionPerformed(evt);
            }
        });
        getContentPane().add(quiz);
        quiz.setBounds(30, 70, 140, 40);

        jList1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        jList1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 169, 694, 350);

        back.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        back.setText("WSTECZ");
        back.setToolTipText("Wróć do wszystkich list");
        back.setEnabled(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(580, 120, 140, 40);

        jTextField1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setText("...");
        jTextField1.setMargin(new java.awt.Insets(2, 20, 2, 20));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(180, 20, 540, 40);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Wybierz listę");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 132, 200, 30);

        searchButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        searchButton.setText("SZUKAJ");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton);
        searchButton.setBounds(580, 70, 140, 40);

        jRadioButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jRadioButton1.setText("Hasła");
        jRadioButton1.setToolTipText("Znajduje wszystkie listy, na których hasło występuje");
        jRadioButton1.setOpaque(false);
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(480, 80, 90, 20);

        jRadioButton2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jRadioButton2.setText("Listy");
        jRadioButton2.setOpaque(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(390, 80, 65, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adhocgloss/back1.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 760, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newEntryActionPerformed
        new Wpis().setVisible(true);
    }//GEN-LAST:event_newEntryActionPerformed

    private void quizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quizActionPerformed
        new Quiz().setVisible(true);
    }//GEN-LAST:event_quizActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        int selInd = -1;
        boolean success = false;
        
        String t = jTextField1.getText();
        boolean isList = jRadioButton1.isSelected();
        if (isList){            
            success = AdHocGloss.setCurrent(t);
            if (success = AdHocGloss.setCurrent(t)){
                displayCurrentList();
            }
                
        } else{
            ArrayList<String> temp = AdHocGloss.findListsWthKey(t);
            if (success = !temp.isEmpty()){
                displayLists(temp);
            }
        }
        
        if (!success){
            DefaultListModel<String> listModel = new DefaultListModel<>();
            listModel.addElement("Nie znaleziono szukanego elementu");
            jList1 = new JList<>(listModel);
            jList1.setEnabled(false);
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Forms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forms.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Forms().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton newEntry;
    private javax.swing.JButton quiz;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables

    
    
    
    
    
    
    
    
    
    
    
    void selectEntry(){
        
    }

    private void displayCurrentList() {
        DefaultListModel<String> listModel = Translator.getKeysNames(AdHocGloss.getCurrent());
        jList1 = new JList<>(listModel);        
        jList1.setEnabled(true);
    }


    private void displayLists(ArrayList<String> li){
        DefaultListModel<String> listModel = new DefaultListModel<>(); 
        AdHocGloss.listDir.forEach((String name) -> {
            listModel.addElement(name);
        });
        jList1 = new JList<>(listModel);
        jList1.setEnabled(true);
    }




}
