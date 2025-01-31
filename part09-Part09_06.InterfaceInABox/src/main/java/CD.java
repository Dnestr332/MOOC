/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sashk
 */
public class CD implements Packable{
    private String arthist;
    private String name;
    private int year;
    private double weight;
    
    public CD(String arthist, String name, int year){
        this.arthist = arthist;
        this.name = name;
        this.year = year;
        this.weight = 0.1;
    }
    
    @Override
    public String toString(){
        return this.arthist + ": " + this.name + " (" + this.year + ")";
    }

    @Override
    public double weight() {
        return this.weight;
    }
    
    
}
