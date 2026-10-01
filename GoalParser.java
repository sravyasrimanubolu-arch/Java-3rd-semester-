import java.util.Scanner;

public class GoalParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter command: ");
        String command = sc.next();

        String result = command
                .replace("()", "o")
                .replace("(al)", "al");

        System.out.println("Output = " + result);

        sc.close();
    }
}