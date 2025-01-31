/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sashk
 *
 */
import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> list = new ArrayList<>();

    public void add(double status) {
        this.list.add(status);
    }

    public void clear() {
        this.list.clear();

    }

    @Override
    public String toString() {
        return this.list.toString();

    }

    public double maxValue() {
        if (this.list.isEmpty()) {
            return 0;
        }
        double max = list.get(0);
        for (Double value : list) {
            if (value > max) {
                max = value;
            }

        }
        return max;
    }

    public double minValue() {
        if (this.list.isEmpty()) {
            return 0;
        }
        double min = list.get(0);
        for (Double value : list) {
            if (value < min) {
                min = value;
            }

        }
        return min;

    }

    public double average() {
        double sum = 0;
        for(Double value : list){
            sum = sum + value;
        }
        double average = sum / list.size();
        return average;

    }
}
