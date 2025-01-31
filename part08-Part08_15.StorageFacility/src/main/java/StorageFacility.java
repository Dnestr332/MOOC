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
import java.util.ArrayList;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> facility;

    public StorageFacility() {
        this.facility = new HashMap<>();
    }

    public void add(String unit, String item) {
        if (!facility.containsKey(unit)) {
            facility.put(unit, new ArrayList<String>());
        }
        facility.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.facility.getOrDefault(storageUnit, new ArrayList<String>());
    }

    public void remove(String storageUnit, String item) {
        for (String unit : facility.keySet()) {
            if (unit.equals(storageUnit)) {
                facility.get(unit).remove(item);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for (String unit : this.facility.keySet()) {
            if (!this.facility.get(unit).isEmpty()) {
                units.add(unit);
            }
        }
        return units;
    }

}
