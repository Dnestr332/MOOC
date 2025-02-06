
import java.nio.file.Files;
import java.nio.file.Paths;

public class LiteracyComparison {

    public static void main(String[] args) {

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(line -> line.replace("(%)", ""))
                    .map(row -> row.split(","))
                    .sorted((p1, p2) -> {return p1[5].compareTo(p2[5]);})
                    .forEach(p -> System.out.println(p[3] + " (" + p[4] + "), " + p[2] + ", " + p[5]));
                    

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
