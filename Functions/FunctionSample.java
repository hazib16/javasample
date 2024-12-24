package Functions;
import java.util.Scanner;

public class FunctionSample {
    public static void main(String ar[]){
        Scanner s=new Scanner(System.in); 
        System.out.println("Enter two numbers: ");
        int num1=s.nextInt();
        int num2=s.nextInt();
        int r=sum(num1,num2);
        System.out.println("The sum is: "+r);
    } 
    static int sum(int a,int b){
        int c=a+b;
        return c;
    }
}
