
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberCount = 0;
        double sum = 0;

        while (true) {
            System.out.println("Give a number: ");

            double number = Double.valueOf(scanner.nextLine());

            if (number != 0) {
                numberCount++;
                sum = number + sum;
                continue;

            } else if (number == 0) {
                break;
            }
        }
        System.out.println("Average of the numbers: " + sum / numberCount);
    }
}
