/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adhocgloss;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.TreeMap;
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
    
    static ArrayList<String> listDir;
    private int index = -1; //żadna lista nie jest wybrana
    
    private TreeMap currentList = null;
    
    
    public static void main(String[] args) {
        readLists();
        Thread tg = new Thread(new GetterThread());
        tg.start();
        
    }
    
    
    void pair(String name, String def){
        currentList.put(name, def);
        saveCurrentList();
    }
    
    static void readLists(){
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
        
    }
    
    
    void readCurrentList(){
        
    }
    
    static void saveCurrentList(){
        /*
        Properties temp = new Properties();
        try {
            FileOutputStream out = new FileOutputStream(listDir.get(index));
            temp.store(out, "Ad Hoc Glossary");
            out.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdHocGloss.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AdHocGloss.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        currentList = new TreeMap(temp);*/
    }
    
    
    
    
}
