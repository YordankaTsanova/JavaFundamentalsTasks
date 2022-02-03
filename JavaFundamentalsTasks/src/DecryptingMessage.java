import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        String decrypted = "";
        for (int i = 0; i < n; i++) {
            int numberFromLetter = scanner.nextLine().charAt(0);
            numberFromLetter += key;
            char words = (char) numberFromLetter;
            decrypted = decrypted + words;
        }
        System.out.println(decrypted);
    }
}
