/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sashk
 */
import java.util.ArrayList;

public class Box implements Packable {

    private double capacity;
    private ArrayList<Packable> list;

    public Box(double capacity) {
        this.capacity = capacity;;
        this.list = new ArrayList<>();
    }

    public void add(Packable packable) {
        if (packable.weight() <= this.capacity) {
            this.list.add(packable);
            weight();
            this.capacity -= packable.weight();
        }

    }

    public String toString() {
        return "Box: " + this.list.size() + " items, total weight " + weight() + " kg";
    }

    @Override
    public double weight() {
        double weight = 0;
        for(Packable packable : list){
            weight += packable.weight();
        }
        return weight;

    }

}
