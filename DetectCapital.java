import java.util.Scanner;

public class DetectCapital {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.next();

        int upperCount = 0;
        int lowerCount = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (Character.isUpperCase(ch)) {
                upperCount++;
            } else {
                lowerCount++;
            }
        }

        if (upperCount == word.length()
                || lowerCount == word.length()
                || (upperCount == 1 && Character.isUpperCase(word.charAt(0)))) {

            System.out.println("Valid Capitalization");

        } else {
            System.out.println("Invalid Capitalization");
        }

        sc.close();
    }
}