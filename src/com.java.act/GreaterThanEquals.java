import java.util.Scanner;

public class GreaterThanEquals {
    public static void main(String[] args) {
        greaterThanEquals show = new greaterThanEquals();
        show.mainMenu();
    }

    static class greaterThanEquals {
        int A;
        int B;
        Scanner userInputA = new Scanner(System.in);
        Scanner userInputB = new Scanner(System.in);

        void isEqual(int A, int B) {
            System.out.println("A: ");
            A = userInputA.nextInt();
            System.out.println("B: ");
            B = userInputB.nextInt();

            if (A == B) {
                System.out.println("-------------------------------------");
                System.out.println("A is equals to B.");
                System.out.println("-------------------------------------");
            } else if (A != B) {
                System.out.println("-------------------------------------");
                System.out.println("A is not equals to B.");
                System.out.println("-------------------------------------");
            }
        }

        void greaterThan(int A, int B) {
            System.out.println("A: ");
            A = userInputA.nextInt();
            System.out.println("B: ");
            B = userInputB.nextInt();

            if (A > B) {
                System.out.println("-------------------------------------");
                System.out.println("A is greater than B.");
                System.out.println("-------------------------------------");
            } else if (A < B) {
                System.out.println("-------------------------------------");
                System.out.println("A is less than B.");
                System.out.println("-------------------------------------");
            }
        }

        void mainMenu() {
            byte menu = 0;

            while (menu != 3) {

                System.out.println("1: Greater than\n2: Equals\n3: Exit");
                menu = userInputA.nextByte();

                switch (menu) {
                    case 1:
                        greaterThan(A, B);
                        break;
                    case 2:
                        isEqual(A, B);
                        break;
                    case 3:
                        System.out.println("-------------------------------------");
                        break;
                    default:
                        System.out.println("Error! please try again");
                }
            }
            System.out.println("Thank you!");
            userInputA.close();
            userInputB.close();
        }
    }
}