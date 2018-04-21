/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adhocgloss;

import java.util.Date;

/**
 *
 * @author dell
 */
public class Entry {
    private String word;
    //słówko
    
    private String definition;
    //definicja słówka
    
    private int difficulty;
    //wartość słówka
    
    public Date dateReg;
    //data dodania słówka
    
    public long totalCount=1200;
    //"Ranking" użytkownika
    
    public int lastAnswer=-2;
    //Ostatnia odpowiedź na pytanie o słówko (początkowo -2)
    
    static public int[] tabLicz={0,0,0,0,0};//[0]<==>-2,[1]<==>-1,[2]<==>0,[3]<==>1,[4]<==>2
    
    public Entry(String word, String definition, int difficulty, int lastAnswer)
    {
        tabLicz[0]++;
    };
    
    public void setPhrase(String word)
    {
        this.word=word;
    }
    
    public String getPhrase()
    {
        return word;
    }
    
    public void setDef(String definition)
    {
        this.definition=definition;
    }
    
    public String getDef()
    {
        return definition;
    }
    
    public void setDifficulty(int difficulty)
    {
        this.difficulty=difficulty;
    }
    
    public int getDifficulty()
    {
        return difficulty;
    }
    
    public void setDateReg(Date dateReg)
    {
        this.dateReg=dateReg;
        
    }
    
    public Date getDateReg()
    {
        return dateReg;
    }
    
  

    
}
