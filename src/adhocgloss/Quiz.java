/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adhocgloss;

/**
 *
 * @author dell
 */
public class Quiz {
    
      public long changeTotalCount(Entry e, int answer)
    //(-2)-(2) Totalnie nie umiem-Umiem perfekcyjnie
    {   
        Entry.tabLicz[e.lastAnswer+2]--;
        Entry.tabLicz[answer+2]++;
        //liczność jednego zmniejszamy o 1, drugiego zwiększamy o 1
        e.lastAnswer=answer;
        e.totalCount+=2*(answer-1)+e.getDifficulty()-1;
        return e.totalCount;
        
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
        int slowo=(int)Entry.tabLicz[RandomAnswer+2]*Math.random();
        return word;
    }
}
