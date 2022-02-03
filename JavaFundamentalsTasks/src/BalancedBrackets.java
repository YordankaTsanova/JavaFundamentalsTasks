import java.util.Scanner;

public class BalancedBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int counterOpeningBracket = 0;
        int counterClosingbracket = 0;
        for (int i = 1; i <= n; i++) {
            char input = scanner.nextLine().charAt(0);
            int numberFromLetter = (int) input;
            if (numberFromLetter == 40) {
                counterOpeningBracket++;
            } else if (numberFromLetter == 41) {
                counterClosingbracket++;
            }
        }
        if (counterOpeningBracket == counterClosingbracket) {
            System.out.println("BALANCED");
        } else {
            System.out.println("UNBALANCED");
        }
    }
}
