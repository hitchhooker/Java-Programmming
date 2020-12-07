
import java.util.Scanner;

public class Conversation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here as follow
        //Greetings! How are you doing?
        //Good thank you!
        //Oh, how interesting. Tell me more!
        //Well, there's really nothing to tell.
        //Thanks for sharing!
        
        
        System.out.println("Greetings! How are you doing?");
        String goodthankyou = scanner.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        String nothingtotell = scanner.nextLine();
        System.out.println("Thanks for sharing!");
        
    }
}

