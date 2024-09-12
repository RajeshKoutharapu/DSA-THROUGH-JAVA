import java.util.Scanner;

public class  sample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(performOperation(Math.min(num1, num2), Math.max(num1, num2)));
    }

    public static int performOperation(int num1, int num2) {
        int len = Integer.MAX_VALUE;
        int res = Integer.MAX_VALUE;

        for (int i = num2; i >= num1; i--) {
            boolean isPowerOf2 = check(i);
            if (isPowerOf2) {
                int newlen = findLength(i);
                if (len >= newlen) {
                    len = newlen;
                    res = i;
                }
            }
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }

    // Corrected check method to verify if n is a power of 2
    public static boolean check(int n) {
        return n != 0 && (n & (n - 1)) == 0;
    }

    // Method to find the length of the binary representation of n
    public static int findLength(int n) {
        String binaryRepresentation = "";
        while (n > 0) {
            binaryRepresentation += n % 2;
            n /= 2;
        }
        return binaryRepresentation.length();
    }
}
