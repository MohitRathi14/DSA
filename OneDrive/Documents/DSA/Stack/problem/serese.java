import java.util.Scanner;
public class serese {
    public static int factorial(int n){
        for (int i = n-1; i >=1; i--) {
            n=n*i;
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        float sum =0f;
        for (int i = 2; i <2+n; i++) {
            if (i%2==0) {
                sum +=(float) Math.pow(x, i)/factorial(i+1);
            }
            else{
                sum -= (float) Math.pow(x, i)/factorial(i+1);
            }
            
        }
        System.out.println(sum);
        scanner.close();
    }
}
