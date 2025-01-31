
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sashk
 */
public class Herd implements Movable {

    private ArrayList<Movable> list;

    public Herd() {
        this.list = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.list.add(movable);
    }

    @Override
    public String toString() {
        String result = "";
        for(Movable movable : list){
            result += movable.toString() + "\n";
        }
        return result;

    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable : list) {
            movable.move(dx, dy);

        }
    }
}
