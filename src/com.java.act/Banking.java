import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {

        BankAccount mainSystem = new BankAccount("");
        mainSystem.showmenu();

    }

    static class BankAccount {
        double balance = 0.1;
        double previousTransaction;
        String customerName;
        int customerId;

        BankAccount(String userName) {

            userName = customerName;
        }

        BankAccount(int userID) {
            userID = customerId;
        }

        void deposit(Double amount) {
            if (amount != 0) {
                balance = balance + amount;
                previousTransaction = amount;
            }
        }

        void widthraw(Double amount) {
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
                System.out.println("No transactions yet!");
            }
        }

        void showmenu() {
            byte option;
            Scanner userinput = new Scanner(System.in);
            Scanner userName = new Scanner(System.in);
            System.out.println("Good day! Please tell us your name: ");
            String customerName = userName.nextLine();
            Scanner userID = new Scanner(System.in);
            System.out.println("Please enter your ID: ");
            int customerId = userID.nextInt();

            System.out.println("Welcome " + customerName + '!');
            System.out.println("ID: " + customerId);
            System.out.println(
                    "Choose what you want to do:\n1: Check your balance\n2: Deposit\n3: Widthraw\n4: Your previous transactions\n5: Exit");

            do {
                System.out.println("Enter your option: ");
                option = userinput.nextByte();
                switch (option) {
                    case 1:
                        if (balance == 0.1) {
                            System.out.println("By default, your balance is 0.1 pesos.");
                        } else {
                            System.out.println("Your balance is " + balance);
                        }
                        break;

                    case 2:
                        System.out.println("Enter the amount you want to deposit: ");
                        Double amount = userinput.nextDouble();
                        deposit(amount);
                        break;

                    case 3:
                        System.out.println("Enter the amount you want to widthraw: ");
                        Double widthrawnAmount = userinput.nextDouble();
                        widthraw(widthrawnAmount);
                        break;

                    case 4:
                        getPreviousTransaction();
                        break;

                    case 5:
                        System.out.println("=============================================================");
                        break;
                    default:
                        System.out.println("Error! please try again");
                }
            } while (option != 5);
            System.out.println("Thank you!");
            userinput.close();
            userName.close();
            userinput.close();
            userID.close();
        }

    }
}