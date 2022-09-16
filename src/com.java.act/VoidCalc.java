import java.util.Scanner;

public class VoidCalc {
    public static void main(String[] args) {
        System.out.println("Calculator" + '\n');

        Scanner inputOne = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int numOne = inputOne.nextInt();

        Scanner inputTwo = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int numTwo = inputTwo.nextInt();

        Scanner chooseOperator = new Scanner(System.in);
        System.out.println("Choose your operator: \n (A)ddition (S)ubtraction (M)ultiplication (D)ivision");
        String operator = chooseOperator.next();

        switch (operator) {
            case "A", "a":
                sum(numOne, numTwo);
                break;

            case "S", "s":
                difference(numOne, numTwo);
                break;

            case "M", "m":
                product(numOne, numTwo);
                break;

            case "D", "d":
                qoutient(numOne, numTwo);
                break;

            default:
                System.out.println("Error! Please try again");
        }
        Scanner tryAgain = new Scanner(System.in);
        System.out.println("Try again? Y/N: ");
        String tryAgainTwo = tryAgain.next();

        if (!tryAgainTwo.equalsIgnoreCase("N")) {
            main(null);
        } else {
            System.out.println("Bye!");
        }
        inputOne.close();
        inputTwo.close();
        chooseOperator.close();
        tryAgain.close();
    }

    public static void sum(int numOne, int numTwo) {
        System.out.println("You chose (A)ddition!");
        System.out.println("The sum is: " + (numOne + numTwo));
    }

    public static void difference(int numOne, int numTwo) {
        System.out.println("You chose (S)ubtraction!");
        System.out.println("The difference is: " + (numOne - numTwo));
    }

    public static void product(double numOne, double numTwo) {
        System.out.println("You chose (M)ultiplication!");
        System.out.println("The product is: " + (numOne * numTwo));
    }

    public static void qoutient(double numOne, double numTwo) {
        System.out.println("You chose (D)ivision!");
        System.out.println("The qoutient is: " + (numOne / numTwo));
    }

}