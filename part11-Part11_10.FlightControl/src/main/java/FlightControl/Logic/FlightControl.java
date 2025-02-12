/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.Logic;

/**
 *
 * @author sashk
 */
import java.util.Map;
import java.util.HashMap;
import FlightControl.Domain.Airplane;
import FlightControl.Domain.Place;
import FlightControl.Domain.Flight;
import java.util.Collection;

public class FlightControl {
    private Map<String, Airplane> planes;
    private Map<String, Place> places;
    private Map<String, Flight> flights;
    
    public FlightControl(){
        this.planes = new HashMap<>();
        this.places = new HashMap<>();
        this.flights = new HashMap<>();
    }
    
    public void addAirplane(String ID, int capacity){
        Airplane plane = new Airplane(ID, capacity);
        this.planes.putIfAbsent(ID, plane);
    }
    
    public void addFlight(Airplane plane, String departure, String target){
        this.places.putIfAbsent(departure, new Place(departure));
        this.places.putIfAbsent(target, new Place(target));
        
        Flight flight = new Flight(plane, this.places.get(departure), this.places.get(target));
        this.flights.put(flight.toString(), flight);
    }
    
    public Collection<Airplane> getAirplanes(){
        return this.planes.values();
    }
    
    public Collection<Flight> getFlights(){
        return this.flights.values();
    }
    
    public Airplane getAirplane(String ID){
        return this.planes.get(ID);
    }
    
}
