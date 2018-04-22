
package adhocgloss;

import java.awt.Toolkit;
import java.util.Map;
import java.util.TreeMap;


public class Quiz extends javax.swing.JFrame {

    public TreeMap<String,String> Quiz;
    
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
        int slowo=(int)(Math.random()*tabLicz[RandAns]);
        return RandAns;        
    }
    
    public String generateRandomWord(int randomAnswer )
    {
        int slowo=(int)(Math.random()*tabLicz[randomAnswer]+1);
        int it = 0;
        for(Map.Entry<String,String> entry : Quiz.entrySet()) 
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
    
    public String giveRandomWord()
    {
        int RandomAnswer=this.generateRandomAnswer();
        return generateRandomWord(RandomAnswer);
    }        
    
    public long changeTotalCount(Entry e, int answer)
    //przedzial answer:(-2)-(2) Totalnie nie umiem-Umiem perfekcyjnie
    {   
        tabLicz[e.getLastAns()+2]--;
        tabLicz[answer+2]++;
        //liczność jednego zmniejszamy o 1, drugiego zwiększamy o 1
        e.setLastAns(answer);
        rank+=2*(answer-1)+e.getDifficulty()-1;
        return rank;        
    }
    
    public void startQuizu()
    {
        int a=this.generateRandomAnswer();
        this.generateRandomWord(a);
        String b=this.giveRandomWord();
        //uzytkownik klika opcje 1-5
        int answer;
        this.changeTotalCount(Translator.decode(b),a);
        //uzytkownik decyduje, czy chce grac dalej
        boolean decyzja=true;
        if(decyzja==true)
        {
            startQuizu();
        }
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
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("QUIZ");
        setBounds(new java.awt.Rectangle(0, 0, 500, 512));
        setIconImage(Toolkit.getDefaultToolkit().getImage("rysunek.png"));
        setMinimumSize(new java.awt.Dimension(500, 512));
        setPreferredSize(new java.awt.Dimension(500, 512));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 512));
        getContentPane().setLayout(null);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("1");
        jRadioButton1.setOpaque(false);
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(150, 390, 31, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("2");
        jRadioButton2.setOpaque(false);
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(190, 390, 31, 23);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("3");
        jRadioButton3.setOpaque(false);
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(230, 390, 31, 23);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("4");
        jRadioButton4.setOpaque(false);
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

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jTextPane1.setToolTipText("");
        jScrollPane2.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(30, 70, 430, 50);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Oceń siebie:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 360, 490, 16);

        jTextPane2.setBackground(new java.awt.Color(0, 153, 153));
        jTextPane2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTextPane2.setText("Pokaż odpowiedź!");
        jTextPane2.setToolTipText("");
        jTextPane2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextPane2.setEnabled(false);
        jTextPane2.setMargin(new java.awt.Insets(15, 15, 15, 15));
        jScrollPane3.setViewportView(jTextPane2);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(30, 140, 430, 190);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/adhocgloss/back1.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 500, 510);

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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration//GEN-END:variables
}
