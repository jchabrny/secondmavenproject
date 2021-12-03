import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Passwort {

    public static void main(String[] args) {
        System.out.print("Enter your password: ");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String lengthCheck = passwordCheck(input);
        String digitCheck = containsDigits(input);

        System.out.println(lengthCheck);
        System.out.println(digitCheck);
    }

    public static String passwordCheck(String input) {
        if (input.length() > 7)
            return "Sehr gut. Dein Passwort hat eine ausreichende Länge.";
        else
            return "Dein Passwort ist nicht sicher. Es muss mindestens acht Zeichen enthalten.";
    }

    public static String containsDigits(String input) {
        char[] chars = input.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                return "Perfekt. Dein Passwort enthält Zahlen.";
            }   }
            return "Dein Passwort ist nicht sicher. Es muss Zahlen enthalten.";
    }
}


