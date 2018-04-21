/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adhocgloss;


/**
 *
 * @author User
 */
public class Translator{
    
    
    public static Entry decode(String key, String value){
        int diff = (int) value.charAt(0);
        int la = (int) value.charAt(1);
        int i = value.indexOf('#');
        long d = Long.parseLong(value.substring(2,i-1));
        String def = value.substring(i+1);
        
        Entry en = new Entry(key,diff,la,d,def);
        return en;
    }
    
    public static String encode(Entry en){
        String def = String.valueOf(en.getDifficulty()) + String.valueOf(en.getLastAns()) + String.valueOf(en.getDateReg()) + "#" + en.getDef();
        return def;
    }
}
