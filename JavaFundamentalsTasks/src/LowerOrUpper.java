import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);

        int numberFromLetter = (int) letter;

        if (numberFromLetter >= 65 && numberFromLetter <= 90) {
            System.out.println("upper-case");
        } else if (numberFromLetter >= 97 && numberFromLetter <= 122) {
            System.out.println("lower-case");
        }
    }
}
