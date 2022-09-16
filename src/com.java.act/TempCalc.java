import java.util.Scanner;
import java.util.Date;

public class TempCalc {
    public static void main(String[] args) {
        Date dateNow = new Date();
        double celcius, fahrenheit;
        Scanner inputOne = new Scanner(System.in);
        Scanner cToF = new Scanner(System.in);
        Scanner fToC = new Scanner(System.in);

        System.out.println(dateNow);
        String title = "Celcius to Fahreinheit converter";
        System.out.println(title);
        System.out.println("\n");

        System.out.println("(C)elcius or (F)ahreinheit?: ");
        String celciusOrFahrenheit = inputOne.next();

        if (celciusOrFahrenheit.equalsIgnoreCase("C")) {
            System.out.println("Celcius to Fahrenheit Converter" + "\n");
            System.out.println("Please enter the number you want to convert: ");
            double numInput = cToF.nextFloat();
            fahrenheit = (numInput * 9 / 5) + 32;

            System.out.println("The Fahrenheit is " + fahrenheit);
        }

        else if (celciusOrFahrenheit.equalsIgnoreCase("F")) {
            System.out.println("Fahrenheit to Celcius Converter" + '\n');
            System.out.println("Please enter the number you want to convert: ");
            double numInput1 = fToC.nextDouble();

            celcius = (numInput1 - 32) * 5 / 9;

            System.out.println("The Celcius is " + celcius);

        }

        Scanner tryAgain = new Scanner(System.in);
        System.out.println("Wanna try again? Y/N: ");
        String yesOrNo = tryAgain.next();

        while (!yesOrNo.equalsIgnoreCase("N")) {
            System.out.println("(C)elcius or (F)ahreinheit?: ");
            celciusOrFahrenheit = inputOne.next();

            if (celciusOrFahrenheit.equalsIgnoreCase("C")) {

                System.out.println("Celcius to Fahrenheit Converter" + "\n");
                System.out.println("Please enter the number you want to convert: ");
                double numInput = cToF.nextFloat();
                fahrenheit = (numInput * 9 / 5) + 32;

                System.out.println("The Fahrenheit is " + fahrenheit);

            }

            else if (celciusOrFahrenheit.equalsIgnoreCase("F")) {

                System.out.println("Fahrenheit to Celcius Converter" + '\n');
                System.out.println("Please enter the number you want to convert: ");
                double numInput1 = fToC.nextDouble();

                celcius = (numInput1 - 32) * 5 / 9;

                System.out.println("The Celcius is " + celcius);

                System.out.println("Wanna try again? Y/N: ");
                yesOrNo = tryAgain.next();
            }
        }
        System.out.println("Bye!");

        inputOne.close();
        tryAgain.close();
        cToF.close();
        fToC.close();
    }
}