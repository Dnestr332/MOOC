/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sashk
 */
public class Item {
    private String product;
    private int qty;
    private int price;
    
    public Item(String product, int qty, int unitPrice){
        this.product = product;
        this.qty = qty;
        this.price = unitPrice;
    }
    
    public int price(){
        int totalPrice = this.price * this.qty;
        return totalPrice;
    }
    
    public void increaseQuantity(){
        this.qty++;
    }
    
    @Override
    public String toString(){
        return this.product + ": " + this.qty;
    }
    
}
