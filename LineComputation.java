import java.util.Scanner;

public class LineComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Computation program");
        double lengthOfLine, line1, line2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the x1 value");
        double x1 = scanner.nextDouble();
        System.out.println("Enter the x2 value");
        double x2 = scanner.nextDouble();
        System.out.println("Enter the y1 value");
        double y1 = scanner.nextDouble();
        System.out.println("Enter the y2 value");
        double y2 = scanner.nextDouble();
        lengthOfLine = Math.sqrt(Math.pow((x2 - x1), 2 + Math.pow((y2 - y1), 2)));
        System.out.println("Length of line is :" + lengthOfLine);
        line1 = x2 - x1;
        System.out.println(line1);
        line2 = y2 - y1;
        System.out.println(line2);
        if (line1 == line2) {
            System.out.println("Two lines are equal");
        } else {
            System.out.println("Two lines are not equal");
        }
    }
}
