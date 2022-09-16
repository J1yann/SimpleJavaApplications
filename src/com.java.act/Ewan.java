import java.util.Scanner;

public class Ewan {
    public static void main(String[] args) {

        System.out.println("hi");
        System.out.println("plus calculator" + " \n");

        Scanner num1 = new Scanner(System.in);
        System.out.println("Enter ur number ");
        int sum1 = num1.nextInt();

        Scanner num2 = new Scanner(System.in);
        System.out.println("Enter ur num2: ");
        int sum2 = num2.nextInt();

        System.out.println("The answer is " + (sum1 + sum2));

        Scanner yes = new Scanner(System.in);
        System.out.println("Wanna try again?: ");
        String k = yes.nextLine();

        while (!k.equalsIgnoreCase("n")) {
            System.out.println("hi");
            System.out.println("plus calculator" + " \n");

            System.out.println("Enter ur number ");
            sum1 = num1.nextInt();

            num2 = new Scanner(System.in);
            System.out.println("Enter ur num2: ");
            sum2 = num2.nextInt();

            System.out.println("The answer is " + (sum1 + sum2));
            System.out.println("Wanna try again?: ");
            k = yes.nextLine();
        }
        yes.close();
        num1.close();
        num2.close();
        num2.close();
    }
}