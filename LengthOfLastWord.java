import java.util.Scanner;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        str = str.trim();

        int lastSpace = str.lastIndexOf(" ");
        String lastWord = str.substring(lastSpace + 1);

        System.out.println("Length of last word = " + lastWord.length());

        sc.close();
    }
}