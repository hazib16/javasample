package ClassAndObjects;
import java.util.Scanner;

public class InputValue {
    public static void main(String ar[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("The Numbers are: " + a + " " + b);
    }

}
