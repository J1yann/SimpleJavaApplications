import java.util.Scanner;

public class ZodacSign {
    public static void main(String[] args) {
        int birthYear;
        String month;
        int day;
        Scanner userInput = new Scanner(System.in);

        System.out.println("What is your birthmonth?: ");
        month = userInput.next();

        System.out.println("What is your birthdate?: ");
        day = userInput.nextInt();

        System.out.println("What is your birthyear?: ");
        birthYear = userInput.nextInt();
        boolean isLegal = birthYear < 2004;

        System.out.println('\n');
        String sign = "";

        if (month.equalsIgnoreCase("January")) {
            if (day < 20)
                sign = "Capricorn";
            else
                sign = "Aquarius";
        } else if (month.equalsIgnoreCase("February")) {
            if (day < 19)
                sign = "Aquarius";
            else
                sign = "Pisces";
        } else if (month.equalsIgnoreCase("March")) {
            if (day < 21)
                sign = "Pisces";
            else
                sign = "Aries";
        } else if (month.equalsIgnoreCase("April")) {
            if (day < 20)
                sign = "Aries";
            else
                sign = "Taurus";
        } else if (month.equalsIgnoreCase("May")) {
            if (day < 21)
                sign = "Taurus";
            else
                sign = "Gemini";
        } else if (month.equalsIgnoreCase("June")) {
            if (day < 21)
                sign = "Gemini";
            else
                sign = "Cancer";
        } else if (month.equalsIgnoreCase("July")) {
            if (day < 23)
                sign = "Cancer";
            else
                sign = "Leo";
        } else if (month.equalsIgnoreCase("August")) {
            if (day < 23)
                sign = "Leo";
            else
                sign = "Virgo";
        } else if (month.equalsIgnoreCase("September")) {
            if (day < 23)
                sign = "Virgo";
            else
                sign = "Libra";
        } else if (month.equalsIgnoreCase("October")) {
            if (day < 23)
                sign = "Libra";
            else
                sign = "Scorpio";
        } else if (month.equalsIgnoreCase("November")) {
            if (day < 22)
                sign = "scorpio";
            else
                sign = "Sagittarius";
        } else if (month.equalsIgnoreCase("December")) {
            if (day < 22)
                sign = "Sagittarius";
            else
                sign = "Capricorn";
        }

        System.out.println("The astrological sign for " + day + " " + month + " is " + sign);

        if (isLegal == true) {
            System.out.println("You're now in the legal age");
        } else if (isLegal == false) {
            System.out.println("You're a minor");
        }
        userInput.close();
    }
}
