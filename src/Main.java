import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner key = new Scanner(System.in);
        n = key.nextInt();
        int a[] = new int[n];
        System.out.println("Please enter " + n + " numbers");
        for (int i = 0; i < n; i++) {
            a[i] = key.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum = sum + a[i];
        }
        System.out.println("average="+sum/n);
    }
}