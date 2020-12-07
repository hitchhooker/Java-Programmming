
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("Password?");
        String pw = scan.nextLine();
        String password = "Caput Draconis";

        if (pw.equals(password)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
    }
}

