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
import java.util.Comparator;
import java.util.Iterator;

public class Hand implements Comparable<Hand>{

    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void print() {
        this.cards.stream()
                .forEach(System.out::println);
    }

    public void sort() {
        this.cards.sort(Comparator.comparing(Card::getValue).thenComparing(Card::getSuit));
    }
    
    public int sumOfCards(){
        Iterator<Card> iterator = cards.iterator();
        int sum = 0;
        while(iterator.hasNext()){
            Card card = iterator.next();
            sum += card.getValue();
        }
        return sum;
    }

    @Override
    public int compareTo(Hand o) {
        return this.sumOfCards() - o.sumOfCards();
    }
    
    public void sortBySuit(){
        this.cards.sort(Comparator.comparing(Card::getSuit).thenComparing(Card::getValue));
    }

}
