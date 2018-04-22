
package adhocgloss;

import java.awt.Toolkit;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Laptop
 */
public class EditDisp extends javax.swing.JFrame {

    /**
     * Creates new form EditDisp
     */
    
    Entry entry;
    int selection = 3;
    
    public EditDisp(Entry ent){
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage("rysunek.png"));
        setResizable(false);
        entry = ent;
        display(entry);
    }
    
    
    
    public EditDisp() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage("rysunek.png"));
        setResizable(false);        
        display(entry);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel3 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        save = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ad Hoc Gloss");
        setBounds(new java.awt.Rectangle(0, 0, 660, 510));
        setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        setMaximumSize(new java.awt.Dimension(660, 520));
        setMinimumSize(new java.awt.Dimension(660, 520));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(660, 520));
        setResizable(false);
        setSize(new java.awt.Dimension(660, 520));
        getContentPane().setLayout(null);

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setEnabled(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(80, 20, 530, 40);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Lista:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 30, 43, 22);

        jTextField1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextField1.setText("Podaj hasło...");
        jTextField1.setEnabled(false);
        jTextField1.setMargin(new java.awt.Insets(2, 15, 2, 15));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(30, 80, 580, 40);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Stopień trudności:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 130, 144, 22);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jRadioButton1.setText("1");
        jRadioButton1.setEnabled(false);
        jRadioButton1.setOpaque(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(260, 130, 39, 31);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jRadioButton2.setText("2");
        jRadioButton2.setEnabled(false);
        jRadioButton2.setOpaque(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(320, 130, 39, 31);

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jRadioButton5.setText("5");
        jRadioButton5.setEnabled(false);
        jRadioButton5.setOpaque(false);
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton5);
        jRadioButton5.setBounds(490, 130, 39, 31);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jRadioButton4.setText("4");
        jRadioButton4.setEnabled(false);
        jRadioButton4.setOpaque(false);
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(430, 130, 39, 31);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jRadioButton3.setText("3");
        jRadioButton3.setEnabled(false);
        jRadioButton3.setOpaque(false);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(370, 130, 39, 31);

        jTextPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTextPane1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextPane1.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        jTextPane1.setEnabled(false);
        jTextPane1.setMargin(new java.awt.Insets(15, 15, 15, 15));
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 200, 580, 240);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Definicja:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(42, 169, 74, 22);

        delete.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        delete.setText("USUŃ");
        delete.setEnabled(false);
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(503, 450, 100, 40);

        save.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        save.setText("ZAPISZ");
        save.setEnabled(false);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save);
        save.setBounds(390, 450, 100, 40);

        edit.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        edit.setText("EDYTUJ");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit);
        edit.setBounds(270, 450, 110, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back1.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 650, 510);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        AdHocGloss.delete(entry.getName());
    }//GEN-LAST:event_deleteActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        delete.setEnabled(true);
        save.setEnabled(true);
        jTextField1.setEnabled(true);
        jTextPane1.setEnabled(true);
        jRadioButton1.setEnabled(true);
        jRadioButton2.setEnabled(true);
        jRadioButton3.setEnabled(true);
        jRadioButton4.setEnabled(true);
        jRadioButton5.setEnabled(true);
    }//GEN-LAST:event_editActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        AdHocGloss.delete(entry.getName());
        Date date = new Date();
        entry = new Entry(jTextField1.getText(),selection, 0, date.getTime(), jTextPane1.getText());
        AdHocGloss.pair(entry.getName(), Translator.encodeDef(entry));
    }//GEN-LAST:event_saveActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String sel = (String) jComboBox1.getSelectedItem();
        if (sel.equals("Dodaj nową listę...")){
            jComboBox1.setEditable(true);
        }
      
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        selection = 1;
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        selection = 2;
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        selection = 3;
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        selection = 4;
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
        selection = 5;
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new EditDisp().setVisible(true);
        });
    }
    
    
    void display(Entry en){
        jTextField1.setText(en.getName());
        selection = en.getDiff();
        switch(selection){
            case 1 : 
                jRadioButton1.setSelected(true);
                break;
            case 2 : 
                jRadioButton2.setSelected(true);
                break;
            case 3 : 
                jRadioButton3.setSelected(true);
                break;
            case 4 : 
                jRadioButton4.setSelected(true);
                break;
            case 5 : 
                jRadioButton5.setSelected(true);
                break;             
        }
        jTextPane1.setText(en.getDef());
        
        
        DefaultComboBoxModel myModel = new DefaultComboBoxModel(AdHocGloss.listDir.toArray());
        myModel.addElement("Dodaj nową listę...");
        jComboBox1.setModel(myModel);        
    }
    

}


