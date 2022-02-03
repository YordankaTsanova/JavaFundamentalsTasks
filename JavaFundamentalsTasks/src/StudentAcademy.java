import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Double> studentsAndGrades = new LinkedHashMap<>();
        for (int i = 0; i <= n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if(!studentsAndGrades.containsKey(name)) {
                studentsAndGrades.put(name, grade);
            }
            studentsAndGrades.put(name, (studentsAndGrades.get(name) + grade)/ 2);
        }
        for (Map.Entry<String, Double> entry : studentsAndGrades.entrySet()) {
            double checkGrade = entry.getValue();
            if(checkGrade >= 4.50) {
                System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue());
            }
        }
    }
}
