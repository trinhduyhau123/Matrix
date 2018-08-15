import java.util.Random;

public class Matrix {
    public static void PrintMatrix(int n) {
        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            int number = rand.nextInt(2) +0;
            for (int j = 0; j < n; j++) {
                System.out.printf(number + "  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n;
        PrintMatrix(5);
    }
}
