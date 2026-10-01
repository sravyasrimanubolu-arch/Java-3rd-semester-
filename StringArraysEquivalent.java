import java.util.Scanner;

public class StringArraysEquivalent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings in first array: ");
        int n1 = sc.nextInt();

        String[] arr1 = new String[n1];

        System.out.println("Enter first array strings:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.next();
        }

        System.out.print("Enter number of strings in second array: ");
        int n2 = sc.nextInt();

        String[] arr2 = new String[n2];

        System.out.println("Enter second array strings:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.next();
        }

        String str1 = "";
        String str2 = "";

        for (int i = 0; i < n1; i++) {
            str1 = str1 + arr1[i];
        }

        for (int i = 0; i < n2; i++) {
            str2 = str2 + arr2[i];
        }

        if (str1.equals(str2)) {
            System.out.println("String arrays are equivalent");
        } else {
            System.out.println("String arrays are not equivalent");
        }

        sc.close();
    }
}