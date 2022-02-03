import java.util.Scanner;

public class CaesarCipherWithStringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder builderEncryptedText = new StringBuilder();

        for (char symbol : text.toCharArray()) {
            char encryptedSymbol = (char)(symbol + 3);
            builderEncryptedText.append(encryptedSymbol);
        }

        System.out.println(builderEncryptedText);
    }
}
