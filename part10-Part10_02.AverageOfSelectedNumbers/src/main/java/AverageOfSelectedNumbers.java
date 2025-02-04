
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }
            list.add(line);
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String choice = scanner.nextLine();
        double average = 0;

        if (choice.equals("n")) {
            average = list.stream()
                    .mapToInt(line -> Integer.valueOf(line))
                    .filter(number -> number < 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the negative numbers: " + average);
        } else {
            average = list.stream()
                    .mapToInt(line -> Integer.valueOf(line))
                    .filter(number -> number > 0)
                    .average()
                    .getAsDouble();
            System.out.println("Average of the positive numbers: " + average);
        }
        
        
    }
}
