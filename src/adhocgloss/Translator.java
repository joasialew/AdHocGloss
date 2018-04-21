/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adhocgloss;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;


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
        
        Entry en = new Entry(key,encodeDiff(value),la,d,def);
        return en;
    }
    
    //trzeba dodać resztę encode i resztę comaparatorów
    
    private static int encodeDiff(String value){
        return (int) value.charAt(0);
    }
    //
    
    public static String encode(Entry en){
        String def = String.valueOf(en.getDifficulty()) + String.valueOf(en.getLastAns()) + String.valueOf(en.getDateReg()) + "#" + en.getDef();
        return def;
    }
    
    public static <K, V extends Comparable<V>> Map<K, V> sortByDiff(final Map<K, V> map) {
        Comparator<K> valueComparator = new Comparator<K>() {
            @Override
            public int compare(K k1, K k2) {
                int compare = encodeDiff((String)map.get(k1)) - encodeDiff((String)map.get(k2));
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
