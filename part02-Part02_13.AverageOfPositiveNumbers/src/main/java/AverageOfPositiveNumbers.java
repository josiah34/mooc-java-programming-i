
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numberCount = 0;
        double sum = 0;

        while (true) {
            System.out.println("");

            double number = Double.valueOf(scanner.nextLine());

            if (number > 0) {
                numberCount++;
                sum = number + sum;
                continue;
            }
            if (number == 0) {
                break;
            }
        }
        if (sum > 0) {
            System.out.println("Average of the numbers: " + sum / numberCount);
        } else if (sum <= 0) {
            System.out.println("Cannot calculate the average");
        }
    }
}
