
package adhocgloss;

import java.awt.Toolkit;
import java.util.Map;
import java.util.TreeMap;


public class Quiz extends javax.swing.JFrame {
    public TreeMap<String,String> Q;
    long userScore = 0;
    long totalScore = 0;
    int ans = 0;
    String v;
    
    public Quiz() {
        initComponents();
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("rysunek.png"));
        this.setResizable(false);
        this.setDefaultCloseOperation(2);
        this.setBounds(200,200,515,450);
        
        
    }
    static int rank=1200;
    
    int[] tabLicz={0,0,0,0,0};
    
    public int generateRandomAnswer()
    {
        int RandAns=((((int)(Math.random()*30))%9)%7)%5-2;
        if(tabLicz[RandAns]==0)
        {
            generateRandomAnswer();
        }
    //    int slowo=(int)(Math.random()*tabLicz[RandAns]);
        return RandAns;        
    }
    
    public String generateRandomWord(int randomAnswer )
    {
        int slowo=(int)(Math.random()*tabLicz[randomAnswer]+1);
        int it = 0;
        for(Map.Entry<String,String> entry : Q.entrySet()) 
        {
            String key = entry.getKey();
            String value = entry.getValue();
            char c = value.charAt(1);
            if(c == randomAnswer)
            {
                it++;
                if(it == slowo)
                {
                   return key;
                }
            }
        }   
    return "xD";       
    }
    
       
    
    public long changeTotalCount(Entry e, int answer)
    //przedzial answer:(-2)-(2) Totalnie nie umiem-Umiem perfekcyjnie
    {   
        tabLicz[e.getLastAns()+2]--;
        tabLicz[answer+2]++;
        //liczność jednego zmniejszamy o 1, drugiego zwiększamy o 1
        e.setLastAns(answer);
        rank+=2*(answer-1)+e.getDiff()-1;
        return rank;        
    }
    
    
    
    public void nextQuestion()
    {
        int a=this.generateRandomAnswer();
        String k = this.generateRandomWord(a);
        keyDisplay.setText(k); //wyrzuca hasło na górny panel
        v = this.Q.get(k);
        String b=this.generateRandomWord(a);
        //uzytkownik klika opcje 1-5
        this.changeTotalCount(Translator.decode(b),ans);
        //uzytkownik decyduje, czy chce grac dalej
       // boolean decyzja=true;
        //if(decyzja==true)
        //{
          //  startQuizu();
        //}
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
        jButton1 = new javax.swing.JButton();
        next = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        keyDisplay = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        showAnswer = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("QUIZ");
        setBounds(new java.awt.Rectangle(0, 0, 500, 512));
        setIconImage(Toolkit.getDefaultToolkit().getImage("rysunek.png"));
        setMinimumSize(new java.awt.Dimension(500, 512));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 512));
        getContentPane().setLayout(null);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("1");
        jRadioButton1.setOpaque(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(150, 390, 31, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("2");
        jRadioButton2.setOpaque(false);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(190, 390, 31, 23);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("3");
        jRadioButton3.setOpaque(false);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(230, 390, 31, 23);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("4");
        jRadioButton4.setOpaque(false);
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(270, 390, 31, 23);

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("5");
        jRadioButton5.setOpaque(false);
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton5);
        jRadioButton5.setBounds(310, 390, 31, 23);

        jButton1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButton1.setText("Koniec");
        jButton1.setActionCommand("Koniec");
        jButton1.setMaximumSize(new java.awt.Dimension(73, 31));
        jButton1.setMinimumSize(new java.awt.Dimension(73, 31));
        jButton1.setPreferredSize(new java.awt.Dimension(73, 31));
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 420, 90, 30);

        next.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        next.setText("Dalej");
        next.setEnabled(false);
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });
        getContentPane().add(next);
        next.setBounds(380, 420, 80, 31);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("NIE UMIEM");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 390, 93, 22);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("UMIEM");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(390, 390, 59, 22);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Wynik:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(190, 20, 150, 22);

        keyDisplay.setEditable(false);
        keyDisplay.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        keyDisplay.setToolTipText("");
        jScrollPane2.setViewportView(keyDisplay);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 70, 430, 50);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Oceń siebie:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 360, 490, 16);

        showAnswer.setBackground(new java.awt.Color(0, 153, 153));
        showAnswer.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        showAnswer.setText("Pokaż odpowiedź!");
        showAnswer.setToolTipText("");
        showAnswer.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        showAnswer.setEnabled(false);
        showAnswer.setMargin(new java.awt.Insets(15, 15, 15, 15));
        showAnswer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showAnswerMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(showAnswer);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(30, 140, 430, 190);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adhocgloss/back1.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -10, 500, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        next.setEnabled(true);
        ans = 5;
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        nextQuestion();
    }//GEN-LAST:event_nextActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        ans = 4;
        next.setEnabled(true);
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        ans = 3;
        next.setEnabled(true);
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        ans = 2;
        next.setEnabled(true);
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        ans = 1;
        next.setEnabled(true);
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void showAnswerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showAnswerMouseClicked
        showAnswer.setText(v);
    }//GEN-LAST:event_showAnswerMouseClicked

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Quiz().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane keyDisplay;
    private javax.swing.JButton next;
    private javax.swing.JTextPane showAnswer;
    // End of variables declaration//GEN-END:variables
}
