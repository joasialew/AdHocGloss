
import adhocgloss.Entry;
import java.awt.Toolkit;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class Quiz extends javax.swing.JFrame 
{
    
    public TreeMap<String,String> Quiz;

    
    public Quiz() 
    {
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

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(600, 450));
        getContentPane().setLayout(null);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("1");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(49, 330, 31, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("2");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(137, 330, 31, 23);

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("3");
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(228, 330, 31, 23);

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("4");
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(318, 330, 31, 23);

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("5");
        getContentPane().add(jRadioButton5);
        jRadioButton5.setBounds(401, 330, 31, 23);

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
        jScrollPane1.setBounds(340, 110, 300, 108);

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Wynik:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(400, 20, 42, 17);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) 
    {
        
        java.awt.EventQueue.invokeLater(() -> 
        {
            new Quiz().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
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
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    static int rank=1200;
    
    int[] tabLicz={0,0,0,0,0};
    
    public long changeTotalCount(Entry e, int answer)
    //(-2)-(2) Totalnie nie umiem-Umiem perfekcyjnie
    {   
        tabLicz[e.getLastAns()+2]--;
        tabLicz[answer+2]++;
        //liczność jednego zmniejszamy o 1, drugiego zwiększamy o 1
        e.setLastAns(answer);
        rank+=2*(answer-1)+e.getDifficulty()-1;
        return rank;
        
    }
    
    public int generateRandomAnswer()
    {
        double losowa=Math.random();
        int szukanaLastAnswer;
        if(losowa>=0.6)
        {
            szukanaLastAnswer=-2;
        }
        else if(losowa>=0.32)
        {
            szukanaLastAnswer=-1;
        }
        else if(losowa>=0.12)
        {
            szukanaLastAnswer=0;
        }
        else if(losowa>=0.04)
        {
            szukanaLastAnswer=1;
        }
        else
        {
            szukanaLastAnswer=2;
        }
        return szukanaLastAnswer;
    }
    
    public String generateRandomWord()
    {
        int RandomAnswer=this.generateRandomAnswer();
        int slowo=(int)(tabLicz[RandomAnswer+2]*Math.random()+1);
        return GimmeWord(slowo,RandomAnswer);
    }
   
    public String GimmeWord(int slowo, int randomAnswer )
    {
        int it = 0;
        for(Map.Entry<String,String> entry : Quiz.entrySet()) {
          String key = entry.getKey();
          String value = entry.getValue();
          char c = value.charAt(1);
          if(c == randomAnswer){
              it++;
              if(it == slowo){
                  return key;
              }
          }
        }   
     return "xD";
       
    }
    
}


