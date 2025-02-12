package FlightControl;

import FlightControl.Logic.FlightControl;
import FlightControl.Domain.Airplane;
import FlightControl.Domain.Place;
import FlightControl.Domain.Flight;
import java.util.Scanner;
import FlightControl.UserInterface.TextInterface;



public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        FlightControl control = new FlightControl();
        TextInterface ti = new TextInterface(control, scanner);
        
        ti.start();
        // Write the main program here. It is useful to create some classes of your own.
    }
}
