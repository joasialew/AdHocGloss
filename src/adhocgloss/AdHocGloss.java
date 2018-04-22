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
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
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
    private static String current = ""; //żadna lista nie jest wybrana
    
    private static Properties currentList = new Properties();
    
    
    public static void main(String[] args) {
        readLists();
        
        Thread tg = new Thread(new GetterThread());
        tg.start();
        new Forms().setVisible(true);
    }
    
    
    public static void pair(String name, String def){        
        currentList.put(name, def);
        System.out.println(currentList.toString());
        saveCurrentList();
    }
    
    public static boolean isEmpty(){
        System.out.println("cur is empty:" + currentList.isEmpty());
        return currentList.isEmpty();
        
    }
    
    public static String getValue(String key){
        return currentList.getProperty(key);
    }
    
    public static Properties getCurrentList(){
        return currentList;
    }
    
    public static String getCurrent(){
        return current;
    }
    
    public static boolean setCurrent(String title){
        if (!listDir.contains(title))
            return false;
        current = title;
        readList(current);
        return true;
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
    
    public static void delete(String key){
        try{
            currentList.remove(key);
        } catch (NullPointerException e){
            System.out.println("Nie usunięto");
        }
    }
    
    public static void save(Entry ent){
        currentList.put(ent.getName(), Translator.encodeDef(ent));
        saveCurrentList();
    }
    
    public static void addList(String title){
        listDir.add(title);
        current = title;        
    }
    
    public static void renameCurrentList(String newTitle){
        listDir.remove(current);
        listDir.add(newTitle);
        try{    		
            File file = new File("Listy/"+current+".txt");      	
            if(file.renameTo(new File("Listy/"+current+".txt"))){
                System.out.println(file.getName() + " is renamed!");
            }else{
                System.out.println("Rename operation is failed.");
            }    	   
    	}catch(Exception e){
            e.printStackTrace();    		
    	}
        current = newTitle;
    }
    
    public static void deleteCurrentList(){
        listDir.remove(current);
        try{    		
            File file = new File("Listy/"+current+".txt");      	
            if(file.delete()){
                System.out.println(file.getName() + " is deleted!");
            }else{
                System.out.println("Delete operation is failed.");
            }    	   
    	}catch(Exception e){
            e.printStackTrace();    		
    	}
        current = listDir.get(0);
        readList(current);
    }
    
    
    public static void readLists(){
        listDir = new ArrayList<String>();
        File folder = new File("Listy");
        File[] listOfFiles = folder.listFiles();
                
        String extension = "";
        String fileName = "";
             
        for (File file : listOfFiles) {
            if (file.isFile()) {
                fileName = file.getName();
                int i = fileName.lastIndexOf('.');
                if (i > 0) {
                    extension = fileName.substring(i+1);
                    fileName = fileName.substring(0,i);
                    System.out.println(fileName + "." + extension);
                }                             
                
                if (extension.equals("txt" ) && !fileName.equals("")){
                    listDir.add(fileName);
                }
            }
        }
        if (listDir.isEmpty()){           
            listDir = new ArrayList<>();
            listDir.add("Default");
            current = "Default"; 
            currentList = new Properties();
            saveCurrentList();            
        }
}
    
    public static Properties readList(String title){
        Properties prop = new Properties();
        
        FileInputStream in;
        try {
            in = new FileInputStream("Listy/"+title+".txt");
            prop.load(in);        
            in.close();
            System.out.println("Po przeczytaniu z pliku: " + prop.toString());
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
            out = new FileOutputStream("Listy/"+current+".txt");
            currentList.store(out, "AdHocGlossary");
            out.close();
            return;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdHocGloss.class.getName()).log(Level.SEVERE, null, ex);            
            System.out.println("Nie znaleziono pliku!");
        } catch (IOException ex) {
            Logger.getLogger(AdHocGloss.class.getName()).log(Level.SEVERE, null, ex);           
            System.out.println("Problem z zapisywaniem pliku!");
        } catch (NullPointerException ex){
            System.out.println("out == null");
        }      
    }
    
    
    
    
}
