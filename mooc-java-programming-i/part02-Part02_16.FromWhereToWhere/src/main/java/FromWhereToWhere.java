
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int number = Integer.valueOf(scanner.nextInt());
        System.out.println("Where from?");
        int number2 = Integer.valueOf(scanner.nextInt());
        for (int i = number2; i <= number; i++) {
            if (number2 <= number) {
                System.out.println(i);
            } else {
                System.out.println("");
            }

        }
        // Write your program here
    }
}
