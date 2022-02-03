import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        matrix(number);
    }

    private static void matrix(int number) {
        for (int row = 0; row < number; row++) {
            for (int column = 0; column < number; column++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
