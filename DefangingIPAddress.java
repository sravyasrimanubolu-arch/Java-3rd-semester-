import java.util.Scanner;

public class DefangingIPAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter IP address: ");
        String ip = sc.next();

        String result = ip.replace(".", "[.]");

        System.out.println("Defanged IP address = " + result);

        sc.close();
    }
}