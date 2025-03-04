/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sashk
 */
import java.util.Scanner;

public class Store {
    
    private Warehouse warehouse;
    private Scanner scanner;
    
    public Store(Warehouse warehouse, Scanner scanner){
        this.warehouse = warehouse;
        this.scanner = scanner;
    }
    
    public void shop(String customer){
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("our selection:");
        
        for(String product : this.warehouse.products()){
            System.out.println(product);
        }
        
        while(true){
            System.out.println("What to put in the cart (press enter to go to the register): ");
            String product = scanner.nextLine();
            if(product.isEmpty()){
                break;
            }
            int price = 0;
            for(String stuff : this.warehouse.products()){
                if(product.equals(stuff)){
                    price = warehouse.price(product);
                    cart.add(product, price);
                    warehouse.take(product);
                }
            }    
        }
        
        System.out.println("your shoppingcart contents:");
        cart.print();
        System.out.println("total: " + cart.price());       
    }
}

