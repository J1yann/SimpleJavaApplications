
//Jeane Ledesma
/*OddEven Prelim Exam*/
import java.util.Scanner;
import java.util.Date;

public class OddEven {
    public static void main(String[] args) {
        Date now = new Date();
        Scanner userInput = new Scanner(System.in);
        Scanner tryAgain = new Scanner(System.in);
        String string = "";
        int number;
        boolean bool = true;

        System.out.println(now);
        System.out.println("OddEven");
        System.out.println("Enter your number: ");
        number = userInput.nextInt();

        if (number % 2 == 0) // if statement
            System.out.println("Even");
        else
            System.out.println("Odd");
        System.out.println("\n");

        System.out.println("Do you want to try again? y/n: ");
        string = tryAgain.nextLine().toLowerCase();
        System.out.println("\n");

        if (string.equals("y")) { // if statement for tryAgain
            bool = false;
            if (tryAgain.equals("n"))
                bool = true;
        }
        while (bool == false) { // while loop
            System.out.println("Enter your number: ");
            number = userInput.nextInt();
            if (number % 2 == 0)
                System.out.println("Even");
            else
                System.out.println("Odd");
            System.out.println();
            System.out.println("Do you want to try again? y/n: ");
            string = tryAgain.nextLine().toLowerCase();
            System.out.println("\n");

            if (string.equals("n")) {
                bool = true;
                break; // breaks the loop
            } else if (string.equals("y"))
                bool = false;
            else
                break;

        }

        do { // do while

            System.out.println("Bye!");
            break;// breaks the loop
        } while (bool == true);
        userInput.close();
        tryAgain.close();
    }
}
