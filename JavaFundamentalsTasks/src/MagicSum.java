import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int number = Integer.parseInt(scanner.nextLine());
        String pairs = "";

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == number){
                    System.out.printf("%d %d\n", numbers[i], numbers[j]);
                }
            }
        }

        System.out.println(pairs);
    }
}
