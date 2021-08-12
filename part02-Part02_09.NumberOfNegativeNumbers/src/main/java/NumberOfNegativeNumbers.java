
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = 0;
 
        while (true) {
            System.out.println("Give a number: ");
 
            int number = Integer.valueOf(scanner.nextLine());
 
            if (number != 0 && number < 0) {
                numberCount++;
                continue;
 
            } else if (number == 0) {
                break;
            }
        }
        System.out.println("Number of negative numbers: "+numberCount);
    }
}