import java.util.Scanner;

public class LineComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Computation program");
        double lengthOfLine;
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
    }
}
