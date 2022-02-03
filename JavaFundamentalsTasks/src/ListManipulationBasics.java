import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {

            String[] commandData = command.split("\\s+");
            String commandName = commandData[0];

            switch (commandName) {
                case"Add":
                    int numberToAdd = Integer.parseInt(commandData[1]);
                    numbers.add(numberToAdd);
                    break;
                case"Remove":
                    int numberToRemove = Integer.parseInt(commandData[1]);
                    numbers.remove(Integer.valueOf(numberToRemove));
                    break;
                case"RemoveAt":
                    int removedTheNumberOnThatIndex = Integer.parseInt(commandData[1]);
                    numbers.remove(removedTheNumberOnThatIndex);
                    break;
                case"Insert":
                    int numberToInsert = Integer.parseInt(commandData[1]);
                    int insertIndex = Integer.parseInt(commandData[2]);
                    numbers.add(insertIndex, numberToInsert);
                    break;
            }
            command = scanner.nextLine();
        }
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
