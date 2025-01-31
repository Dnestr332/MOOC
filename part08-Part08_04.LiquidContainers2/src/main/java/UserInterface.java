/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sashk
 */
import java.util.Scanner;

public class UserInterface {

    private Container first;
    private Container second;
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
        this.first = new Container();
        this.second = new Container();

    }

    public void start() {
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                first.add(amount);
            }

            if (command.equals("move")) {
                if (first.contains() >= amount) {
                    second.add(amount);
                } else {
                    second.add(first.contains());
                }
                first.remove(amount);
            }
            
            if(command.equals("remove")){
                second.remove(amount);
            }
        }
    }

}
