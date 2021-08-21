
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        int number = Integer.valueOf(scanner.nextInt());
        for (int i = number; i < 100 + 1; i++) {
            System.out.println(i);
        }
    }
}
