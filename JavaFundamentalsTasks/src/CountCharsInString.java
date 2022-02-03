import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> lettersCount = new LinkedHashMap<>();

        for (int i = 0; i <= text.length() - 1; i++) {
            char currentSymbol = text.charAt(i);
            if(currentSymbol == ' ') {
                continue;
            }

            if(!lettersCount.containsKey(currentSymbol)) {
                lettersCount.put(currentSymbol, 1);
            } else {
                int currentCount = lettersCount.get(currentSymbol);
                lettersCount.put(currentSymbol, currentCount + 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : lettersCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
