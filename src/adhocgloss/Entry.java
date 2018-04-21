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
    private String definition;    //definicja słówka
    private int difficulty;    //wartość słówka
    public Date dateReg;    //data dodania słówka
    public static long totalCount;    //"Ranking" użytkownika
    
    public Entry(String word, String definition, double difficulty){
        
    };
    
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

    
}
