
import java.awt.Toolkit;


public class Quiz extends javax.swing.JFrame {

    
    public Quiz() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("rysunek.png"));
        this.setResizable(false);
        this.setDefaultCloseOperation(2);
        this.setBounds(200,200,515,450);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 450));
        getContentPane().setLayout(null);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("1");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(49, 330, 35, 25);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("2");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(137, 330, 35, 25);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("3");
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(228, 330, 35, 25);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("4");
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(318, 330, 35, 25);

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("5");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton5);
        jRadioButton5.setBounds(401, 330, 35, 25);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("NIE UMIEM");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 290, 93, 22);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("UMIEM");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(400, 290, 59, 22);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 50, 300, 120);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Wynik:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 20, 60, 22);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(480, 20, 0, 0);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Quiz().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
