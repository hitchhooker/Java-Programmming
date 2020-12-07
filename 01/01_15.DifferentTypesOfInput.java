
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        
        System.out.println("Give a string:");
        String stringer = scan.nextLine();
        System.out.println("Give an integer:");
        int integer = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double double2 = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean boolean2 = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string " + stringer);
        System.out.println("You gave the integer " + integer);
        System.out.println("You gave the double " + double2);
        System.out.println("You gave the boolean " + boolean2);

    }
}

