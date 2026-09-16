import java.util.Scanner;
import java.lang.Math;
public class rotate_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("Enter number of rotation");
        int k = sc.nextInt();
        int test = num;
        int count = 0;
        while (test != 0) {
            test /= 10;
            count++;
        }
        k %= count;
        while (k != 0) {
            int rem = num %10;
            num /= 10;
            num = rem *(int)(Math.pow(10, (count - 1)))+ num;
            k--;
        }
        System.out.println("output :- " + num);
        sc.close();
    }
}
