
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("");
        int number2 = Integer.parseInt(scanner.nextLine());
        int sum = number + number2;
        double squareroot = Math.sqrt(sum);
        System.out.println(squareroot);

    }
}
