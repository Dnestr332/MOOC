
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }

            if (number > 0) {
                sum = sum + number;
                count++;
            }
        }


        if (count > 0) {
            double average = (double) sum / count;
            System.out.println(average);

        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
