/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.Domain;

/**
 *
 * @author sashk
 */
public class Flight {
    private Airplane plane;
    private Place departure;
    private Place target;
    
    public Flight(Airplane plane, Place departure, Place target){
        this.plane = plane;
        this.departure = departure;
        this.target = target;
    }
    
    public Airplane getPlane(){
        return this.plane;
    }
    
    public Place getDeparture(){
        return this.departure;
    }
    
    public Place getTarget(){
        return this.target;
    }
    
    @Override
    public String toString(){
        return this.getPlane() + " (" + this.getDeparture() + "-" + this.getTarget() + ")";
    }
    
}
