import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        String firstText = input[0];
        String secondText = input[1];

        System.out.println(getMultipliedResult(firstText, secondText));
    }

    private static int getMultipliedResult(String firstText, String secondText) {
        int maxLength = Integer.max(firstText.length(), secondText.length());
        int minLength = Integer.min(firstText.length(), secondText.length());
        String maxText = (firstText.length() > secondText.length()) ? firstText : secondText;

        int sum = 0;
        for (int i = 0; i < minLength; i++) {
            sum += firstText.charAt(i) * secondText.charAt(i);
        }
        for (int i = minLength; i < maxLength; i++) {
            sum += maxText.charAt(i);
        }
        return sum;
    }
}
