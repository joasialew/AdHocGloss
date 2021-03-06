/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adhocgloss;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import javax.swing.DefaultListModel;


/**
 *
 * @author User
 */
public class Translator{
    
    
    public static Entry decode(String key){
        String value = AdHocGloss.getValue(key);
        int i = value.indexOf('#');
        String def = value.substring(i+1);
        Entry en = new Entry(key,decodeDiff(value),decodeLA(value),decodeDate(value),def);
        return en;
    }
    

    
    private static int decodeDiff(String value){
        return Character.getNumericValue(value.charAt(0));
    }
    
    public static int decodeLA(String value){
        return Character.getNumericValue(value.charAt(1));
    }
    
    private static long decodeDate(String value){
        int i = value.indexOf('#');
        return Long.parseLong(value.substring(2,i-1));
    }        
    
    public static String encodeDef(Entry en){
        String def = String.valueOf(en.getDiff()) + String.valueOf(en.getLastAns()) + String.valueOf(en.getDateReg()) + "#" + en.getDef();
        return def;
    }
    
    /*
    public static String[] getKeys(){
        System.out.println("wielkość prop" + AdHocGloss.getCurrentList().size());
        String[] keyList = new String[AdHocGloss.getCurrentList().size()];
        Set<String> keys = AdHocGloss.getCurrentList().stringPropertyNames();
        int it = 0;
        for (String key : keys) {
            keyList[it] = key;
            System.out.println(key + " : " );
            it++;
        }
        return keyList;
    }*/
    
    
    public static <K, V extends Comparable<V>> Map<K, V> sortByDiff(final Map<K, V> map) {
        Comparator<K> valueComparator = new Comparator<K>() {
            @Override
            public int compare(K k1, K k2) {
                int compare = decodeDiff((String)map.get(k1)) - decodeDiff((String)map.get(k2));
                if (compare == 0) 
                    return 1;
                else 
                    return compare;
            }
        };
 
        Map<K, V> sortedByValues = new TreeMap<K, V>(valueComparator);
        sortedByValues.putAll(map);
        return sortedByValues;        
    }      
    
    
    
}
