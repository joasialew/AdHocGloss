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
    private String word;   //słówko
    private String def;    //definicja słówka
    private int diff;    //wartość słówka
    private int lastAns;
    public Date dateReg;    //data dodania słówka
    
    public Entry(String word, String definition, int difficulty, int lastA, Date dateReg){
        this.word = word;
        this.def = definition;
        this.diff = difficulty;
        this.lastAns = lastA;
        this.dateReg = dateReg;     
    }
    
    public void setPhrase(String word){
        this.word=word;
    }
    
    public String getPhrase(){
        return word;
    }
    
    public void setDef(String definition){
        this.definition=definition;
    }
    
    public String getDef(){
        return definition;
    }
    
    public void setDifficulty(int difficulty){
        this.difficulty=difficulty; 
    }
    
    public int getDifficulty(){
        return difficulty;
    }
    
    public void setDateReg(Date dateReg){
        this.dateReg=dateReg;
    }
    
    public Date getDateReg(){            
        return dateReg;
    }

    public void setLastAns(int la){
        this.lastAns = la;
    }
    
    public int getLastAns(){
        return this.lastAns;
    }
    
}
