/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adhocgloss;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class AdHocGloss {

    /**
     * @param args the command line arguments
     */
    
    public static ArrayList<String> listDir;
    private static int index = -1; //żadna lista nie jest wybrana
    
    private static Properties currentList = null;
    
    
    public static void main(String[] args) {
        readLists();
        Thread tg = new Thread(new GetterThread());
        tg.start();        
    }
    
    
    void pair(String name, String def){
        currentList.put(name, def);
        saveCurrentList();
    }
    
    public boolean isKey(String key){
        return currentList.containsKey(key);
    }
    
    public String getValue(String key){
        return currentList.getProperty(key);
    }
    
    
    public static ArrayList<String> findListsWthKey(String name){        
        int n = listDir.size();
        Properties temp = new Properties();
        ArrayList<String> r = new ArrayList<>();
        String title;
        for (int i = 0; i < n; i++){
            title = listDir.get(i);
            temp = readList(title);
            if (temp.containsKey(name)){
                r.add(title);
            }              
        }
        return r;
    }
    
    
    
    
    
    public static void readLists(){
        File folder = new File("Listy");
        File[] listOfFiles = folder.listFiles();
        
        if (listOfFiles == null){
            listDir = new ArrayList<>();
            listDir.add("Default");
            saveCurrentList();
            return;
        }
                
        String extension = "";
        String fileName = "";
             
        for (File file : listOfFiles) {
            if (file.isFile()) {
                fileName = file.getName();
                int i = fileName.lastIndexOf('.');
                if (i >= 0) {
                    extension = fileName.substring(i+1);
                }
                
                fileName = fileName.substring(0,i-1);
                
                if (extension.equals("txt" ) && !fileName.equals("")){
                    listDir.add(fileName);
                }
            }
        }
        index = 0;
    }
    
    
    public static Properties readList(String title){
        Properties prop = new Properties();
        
        FileInputStream in;
        try {
            in = new FileInputStream(title);
            prop.load(in);        
            in.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdHocGloss.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Nie znaleziono pliku!");
        } catch (IOException ex) {
            Logger.getLogger(AdHocGloss.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Problem z czytaniem pliku!");
            prop = new Properties();
        }        
        return prop;
    }
    
    public static void saveCurrentList(){
        FileOutputStream out;
        try {
            out = new FileOutputStream(listDir.get(index));
            currentList.store(out, "AdHocGlossary");
            out.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdHocGloss.class.getName()).log(Level.SEVERE, null, ex);            
            System.out.println("Nie znaleziono pliku!");
        } catch (IOException ex) {
            Logger.getLogger(AdHocGloss.class.getName()).log(Level.SEVERE, null, ex);           
            System.out.println("Problem z zapisywaniem pliku!");
        }        
        
    }
    
    
    
    
}
