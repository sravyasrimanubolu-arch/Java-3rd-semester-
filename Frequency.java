public class Frequency {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 10};

        for (int i = 0; i < arr.length; i++) {
            boolean counted = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    counted = true;
                    break;
                }
            }

            if (!counted) {
                int count = 0;

                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

                System.out.println(arr[i] + " occurs " + count + " times");
            }
        }
    }
}