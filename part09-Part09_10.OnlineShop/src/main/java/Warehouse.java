
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> products;
    private Map<String, Integer> ballance;
    

    public Warehouse() {
        this.products = new HashMap<>();
        this.ballance = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.products.put(product, price);
        this.ballance.put(product, stock);
    }

    public int price(String product) {
        int result = -99;
        for (String key : products.keySet()) {
            if (key.equals(product)) {
                result = products.get(key);
            }
        }
        return result;
    }
    
    public int stock(String product){        
        int result = 0;
        for (String key : ballance.keySet()) {
            if (key.equals(product)) {
                result = ballance.get(key);
            }
        }
        return result;
        
    }
    
    public boolean take(String product){
        int stock = 0;
        for(String key : ballance.keySet()){
            if(key.equals(product)){
                if(ballance.get(key) > 0){
                stock = ballance.get(key) - 1;
                ballance.put(key, stock);
                return true;
                }
            }           
        }
        return false;
    }
    
    public Set<String> products(){
        return this.products.keySet();
    }

}
