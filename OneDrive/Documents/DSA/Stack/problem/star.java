import java.util.Scanner;
public class star {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int n1=n;
        int maxIndex=Integer.toString(n).length();
        int maxNumberOfStars = Integer.MIN_VALUE;
        while (n>0) {
            if (n%10 > maxNumberOfStars) {
                maxNumberOfStars = n % 10;
            }
            n /= 10;
        }
        for (int i = 0; i < maxNumberOfStars; i++) {
            int temp = n1;
            for (int j = 0; j < maxIndex; j++) {
                int digit = temp / (int) Math.pow(10, maxIndex - j - 1) ;
                // System.out.println(digit);
                if (i<maxNumberOfStars - digit) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
                temp %= (int) Math.pow(10, maxIndex - j - 1);
            }
            System.out.println();
        }
    }
}