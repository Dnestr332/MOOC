/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sashk
 */
public class AverageSensor implements Sensor {

    private List<Sensor> list;
    private List<Integer> history;


    public AverageSensor() {
        this.list = new ArrayList<>();
        this.history = new ArrayList<>();

    }

    public void addSensor(Sensor toAdd) {
        this.list.add(toAdd);
    }

    @Override
    public boolean isOn() {
        boolean on = false;
        for (Sensor sensor : list) {
            if (sensor.isOn() == true) {
                on = true;
            }
        }
        return on;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : list) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : list) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if (this.list.isEmpty()) {
            throw new IllegalStateException();
        } else {
            int sum = 0;
            for (Sensor sensor : list) {
                sum += sensor.read();
            }
            int average = sum / list.size();
            this.history.add(average);
            return average;
        }
    }
    
    public List<Integer> readings(){
        return this.history;
    }
}
