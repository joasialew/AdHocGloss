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
    private double difficulty;
    //wartość słówka
    public Date dateReg;
    //data dodania słówka
    public static long totalCount;
    //"Ranking" użytkownika
    public Entry(String word, String definition, double difficulty){};
    public String setPhrase(String word)
    {
        this.word=word;
        return word;
    }
    public String getPhrase()
    {
        return word;
    }
    public String setDef(String definition)
    {
        this.definition=definition;
        return definition;
    }
    public String getDef()
    {
        return definition;
    }
    public double setDifficulty(double difficulty)
    {
        this.difficulty=difficulty;
        return difficulty;
    }
    public double getDifficulty()
    {
        return difficulty;
    }
    /*public Date setDateReg(Date dateReg)
    {
        this.dateReg=dateReg;
        return dateReg;
    }
    public Date getDateReg()
    {
        
    }
    */
    
}
