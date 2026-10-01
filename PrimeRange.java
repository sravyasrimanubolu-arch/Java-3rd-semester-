public class PrimeRange {
    public static void main(String[] args) {
        int start = 10;
        int end = 50;
        int count = 0;

        System.out.println("Prime numbers:");

        for (int num = start; num <= end; num++) {
            boolean prime = true;

            if (num < 2) {
                prime = false;
            }

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(num + " ");
                count++;
            }
        }

        System.out.println("\nCount: " + count);
    }
}