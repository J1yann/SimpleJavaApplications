import java.util.Scanner;

public class BankingSystem {
    public static void main(String[] args) {

        BankAccount obj = new BankAccount("Admin", "001");
        obj.showmenu();

    }

    static class BankAccount {
        int balance;
        int previousTransaction;
        String customerName;
        String customerId;

        BankAccount(String userName, String userId) {

            customerName = userName;
            customerId = userId;

        }

        void deposit(int amount) {
            if (amount != 0) {
                balance = balance + amount;
                previousTransaction = amount;
            }
        }

        void widthraw(int amount) {
            if (amount != 0) {
                balance = balance - amount;
                previousTransaction = -amount;
            }
        }

        void getPreviousTransaction() {
            if (previousTransaction > 0) {
                System.out.println("Deposited: " + previousTransaction);
            } else if (previousTransaction < 0) {
                System.out.println("Widthrawn: " + Math.abs(previousTransaction));
            } else {
                System.out.println("No transactions yet");
            }
        }

        void showmenu() {
            char option = '\0';
            Scanner userInput = new Scanner(System.in);

            System.out.println("Welcome! " + customerId);
            System.out.println("Your ID " + customerId + '\n');

            System.out.println("A: Check your balance\nB: Deposit\nC: Widthraw\nD: Exit");

            do {
                System.out.println("Enter your option: \n");
                option = userInput.next().charAt(0);
                switch (option) {
                    case 'A':
                        System.out.println("Your balance is: " + balance + '\n');
                        break;

                    case 'B':
                        System.out.println("Enter the amount you want to deposit: ");
                        int amount = userInput.nextInt();
                        deposit(amount);
                        break;

                    case 'C':
                        System.out.println("Enter the amount you want to widthraw: ");
                        int widthrawAmount = userInput.nextInt();
                        widthraw(widthrawAmount);
                        break;

                    case 'D':
                        getPreviousTransaction();
                        break;

                    case 'E':
                        System.out.println("==========================================================");
                        break;

                    default:
                        System.out.println("Error! Please try again!");
                        break;
                }

            } while (option != 'E');
            System.out.println("Thank you!");
            userInput.close();
        }
    }
}
