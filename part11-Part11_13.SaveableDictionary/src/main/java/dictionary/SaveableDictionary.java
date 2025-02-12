/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;


import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author sashk
 */
public class SaveableDictionary {

    private Map<String, String> dictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();

    }
    
    public SaveableDictionary(String file){
        this.dictionary = new HashMap<>();
        this.file = file;
        
    }
    
    public boolean load(){
        try{
            Scanner reader = new Scanner(Paths.get(this.file));
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                String[] parts = line.split(":");
                this.dictionary.putIfAbsent(parts[0], parts[1]);
            }
            return true;
            
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return false;
    }
    
    public boolean save(){
        try{
            PrintWriter writer = new PrintWriter(this.file);
            for(String key : this.dictionary.keySet()){
                String word = key;
                String translate = this.dictionary.get(key);
                writer.println(word + ":" + translate);
            }
            writer.close();
            return true;
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return false;
        
    }

    public void add(String words, String translation) {
        if (!(this.dictionary.containsKey(words))) {
            this.dictionary.put(words, translation);
        }

    }

    public String translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        } else if (this.dictionary.containsValue(word)) {
            for (String key : this.dictionary.keySet()) {
                if (this.dictionary.get(key).equals(word)) {
                    return key;
                }
            }
        }
        return null;
    }
    
    public void delete(String word){
        if (this.dictionary.containsKey(word)){
            this.dictionary.remove(word);
        } else if (this.dictionary.containsValue(word)) {
            String keyToDelete = "";
            for(String key : this.dictionary.keySet()){
                if(this.dictionary.get(key).equals(word))
                    keyToDelete = key;
            }
            this.dictionary.remove(keyToDelete);
        }
    }
}
