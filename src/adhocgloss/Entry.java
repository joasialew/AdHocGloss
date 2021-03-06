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
public class Entry {
    private String word;   //słówko
    private String def;    //definicja słówka
    private int diff;    //wartość słówka
    private int lastAns;
    private long dateReg;    //data dodania słówka
    
    
    
    public Entry(){
        this.word = "";
        this.def = "";
        this.diff = 3;
        this.lastAns = 0;
        this.dateReg = 0;     
    }
    
    public Entry(String word, int difficulty, int lastA, long dateReg, String definition){
        this.word = word;
        this.def = definition;
        this.diff = difficulty;
        this.lastAns = lastA;
        this.dateReg = dateReg;     
    }
    
    public void setName(String word){
        this.word=word;
    }
    
    public String getName(){
        return word;
    }
    
    public void setDef(String definition){
        this.def=definition;
    }
    
    public String getDef(){
        return def;
    }
    
    public void setDiff(int difficulty){
        this.diff=difficulty; 
    }
    
    public int getDiff(){
        return diff;
    }
    
    public void setDateReg(long dateReg){
        this.dateReg=dateReg;
    }
    
    public long getDateReg(){            
        return dateReg;
    }

    public void setLastAns(int la){
        this.lastAns = la;
    }
    
    public int getLastAns(){
        return this.lastAns;
    }
    
}




/*
Key: Name
Definition: *dff*la*date*definition
*/
