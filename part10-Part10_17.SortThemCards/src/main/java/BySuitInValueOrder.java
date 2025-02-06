


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sashk
 */
import java.util.Comparator;

public class BySuitInValueOrder implements Comparator<Card>{

    @Override
    public int compare(Card o1, Card o2) {
        int suitComp = Integer.compare(o1.getSuit().ordinal(), o2.getSuit().ordinal());
        
        if(suitComp == 0){
            return Integer.compare(o1.getValue(), o2.getValue());
        }
        return suitComp;
       
    }
    
}
