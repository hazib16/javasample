package ForLoop;
import java.util.Scanner;

public class ForLoopSum {
    public static void main(String ar[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }
}
