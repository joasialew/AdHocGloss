/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adhocgloss;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class AdHocGloss {

    /**
     * @param args the command line arguments
     */
    
    static ArrayList<String> listDir;
    int ind = 0; 
    
    
    
    
    public static void main(String[] args) {
        readLists();
        Thread tg = new Thread(new GetterThread());
        tg.start();
    }
    
    
    void pair(){
        
        
    }
    
    
    
    static void readLists(){
        File folder = new File("Listy");
        File[] listOfFiles = folder.listFiles();
        
        if (listOfFiles == null){
            listDir = new ArrayList<>();
            listDir.add("Default");
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
    
    
    void readList(int ind){
        
    }
    
    void saveList(int ind){
        
    }
    
    
    
    
}
