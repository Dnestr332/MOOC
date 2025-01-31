/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sashk
 */
import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (!dictionary.containsKey(word)) {
            this.dictionary.put(word, new ArrayList<>());
        }
        dictionary.get(word).add(translation);
    }

    public void remove(String word) {
        dictionary.remove(word);

    }

    public ArrayList<String> translate(String word) {
        return dictionary.getOrDefault(word, new ArrayList<String>());

    }
}
