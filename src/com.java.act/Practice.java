import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        System.out.println("Simple Java Banking System" + '\n');

        BankSystem mainSystem = new BankSystem("");
        mainSystem.menu();

    }

    static class BankSystem {
        double balance = 0.1;
        String customerName;

        BankSystem(String userName) {
            userName = customerName;
        }

        void deposit(double amount) {
            if (amount != 0) {
                balance = balance + amount;
            }
        }

        void widthraw(double amount) {
            if (amount != 0) {
                balance = balance - amount;
            }
        }

        void menu() {
            Scanner userInput = new Scanner(System.in);
            byte option;

            Scanner customerName = new Scanner(System.in);
            System.out.println("Good Day! What's your name?: ");
            String userName = customerName.nextLine();
            System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
            System.out.println("Hello, " + userName + '!' + " What you want to do?: ");
            System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");

            do {
                System.out.println("1: Check balance\n2: Deposit\n3: Widthraw\n4: Exit");
                option = userInput.nextByte();

                switch (option) {
                    case 1:
                        if (balance == 0.1) {
                            System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
                            System.out.println("Your default balance is 0.1");
                        } else {
                            System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
                            System.out.println("Your balance is: " + balance);
                        }
                        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
                        break;

                    case 2:
                        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
                        System.out.println("Enter the number you want to deposit in PHP: ");
                        int amount = userInput.nextInt();
                        deposit(amount);
                        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
                        System.out.println("You deposited " + amount + " Pesos");
                        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
                        break;

                    case 3:
                        System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
                        System.out.println("Enter the amount you want to widthraw in PHP: ");
                        int widthrawAmount = userInput.nextInt();
                        widthraw(widthrawAmount);
                        System.out.println("=*=*=*=*=*=*=*=*=*");
                        System.out.println("You've widthrawn " + widthrawAmount + " Pesos");
                        System.out.println("=*=*=*=*=*=*=*=*=*");
                        break;

                    case 4:
                        System.out.println("==================================================");
                }
            } while (option != 4);
            System.out.println("Thank you!");
            userInput.close();
            customerName.close();

        }
    }
}
