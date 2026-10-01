import java.util.Scanner;

public class ReversePrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.next();

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        int index = word.indexOf(ch);

        if (index == -1) {
            System.out.println("Character not found");
        } else {
            String prefix = word.substring(0, index + 1);
            String reverse = "";

            for (int i = prefix.length() - 1; i >= 0; i--) {
                reverse = reverse + prefix.charAt(i);
            }

            String result = reverse + word.substring(index + 1);

            System.out.println("Result = " + result);
        }

        sc.close();
    }
}