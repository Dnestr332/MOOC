
public class Program {

    public static void main(String[] args) {

        int rows = 2;
        int columns = 3;
        int[][] matrix = new int[rows][columns];
        matrix[0][1] = 5;
        matrix[1][0] = 3;
        matrix[1][2] = 7;
        System.out.println(arrayAsString(matrix));
        // Test your method here
    }

    public static String arrayAsString(int[][] array) {
        StringBuilder builder = new StringBuilder();
        String result = "";
        for(int row = 0; row < array.length; row++){
            for(int column = 0; column < array[row].length; column++){
                result = builder.append(array[row][column]).toString();
            }
            result = builder.append("\n").toString();
        }
        return result;
    }

}
