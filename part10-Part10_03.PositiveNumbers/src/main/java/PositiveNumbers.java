
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(-7);
        numbers.add(4);
        numbers.add(-2);
        numbers.add(6);
        
        System.out.println(positive(numbers));
        // test your method here

    }

    public static List<Integer> positive(List<Integer> numbers) {
        ArrayList<Integer> positiveNumbers = numbers.stream()
                .filter(number -> number > 0)
                .collect(Collectors.toCollection(ArrayList::new));
         return positiveNumbers;
    }
   

}
