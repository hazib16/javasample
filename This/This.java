package This;
public class This {
   public static void main(String ar[]){
    sample s=new sample(10,11);
   } 
}
class sample{
    int a=100,b=300;
    sample(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println(a+"  "+b);
    }
}
