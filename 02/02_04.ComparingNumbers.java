
import java.util.Scanner;

public class ComparingNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Write a program that reads two integers from the user. 
        //If the first number is greater than the second, the program prints 
        //"(first) is greater than (second)." If the first number is less than the second, 
        //the program prints "(first) is smaller than (second)." Otherwise, the program prints 
        //"(first) is equal to (second)." The (first) and (second) should always be replaced 
        //with the actual numbers that were provided by the user.

        System.out.println("Give first number:");
        int integer = Integer.valueOf(scanner.nextLine());
        System.out.println("Give second number:");
        int integer2 = Integer.valueOf(scanner.nextLine());

        if (integer > integer2) {
            System.out.println(integer + " is greater than " + integer2);
        } else if (integer < integer2) {
            System.out.println(integer + " is smaller than " + integer2);
        } else {
            System.out.println(integer + " is equal to " + integer2);
        }
    }
}

