import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String typeOfTheValues = scanner.nextLine();

        if (typeOfTheValues.equals("int")) {

            int firstNum = Integer.parseInt(scanner.nextLine());
            int secondNum = Integer.parseInt(scanner.nextLine());
            System.out.println(getMax(firstNum, secondNum));

        } else if (typeOfTheValues.equals("char")) {

            char first = scanner.nextLine().charAt(0);
            char second = scanner.nextLine().charAt(0);
            System.out.println(getMax(first, second));

        } else if (typeOfTheValues.equals("string")) {

            String first = scanner.nextLine();
            String second = scanner.nextLine();
            System.out.println(getMax(first, second));
        }
    }

    private static int getMax(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        }
        return secondNum;
    }

    private static char getMax(char first, char second) {
        if (Character.compare(first, second) > 0) {
            return first;
        }
        return second;
    }

    private static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }
}
