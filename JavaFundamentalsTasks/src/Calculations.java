import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        switch (command) {
            case "add":
                addNumbers(a,b);
                break;
            case "multiply":
                multiplyNumbers(a,b);
                break;
            case "subtract":
                subtractNumbers(a,b);
                break;
            case "divide":
                divideNumbers(a,b);
                break;
            default:
                System.out.println("needs to be void");
        }
    }

    private static void divideNumbers(int a, int b) {
        if (a != 0 && b != 0) {
            System.out.println(a / b);
        }
    }

    private static void subtractNumbers(int a, int b) {
        System.out.println(Math.abs(a - b));
    }

    private static void multiplyNumbers(int a, int b) {
        System.out.println(a * b);
    }

    private static void addNumbers(int a, int b) {
        System.out.println(a + b);
    }
}
