
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give a number:");
        double double2 = Double.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + double2);

    }
}

