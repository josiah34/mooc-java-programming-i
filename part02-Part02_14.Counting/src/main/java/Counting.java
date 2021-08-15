
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        int number = Integer.valueOf(scanner.nextLine());
//        A for loop contains four parts: 
//        (1) introducing the variable for counting the number of executions
//        (2) the condition of the loop 
//        (3) increasing (or decreasing or changing) the value of the counter variable and
//         (4) the functionality to be executed.
        for (int i = 0; i != number + 1; i++) {
            System.out.println(i);
            
        }
    }
}
