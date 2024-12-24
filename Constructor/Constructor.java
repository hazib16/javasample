import Functions.Final;
import This.sample;

package Constructor;
public class Constructor {
    public static void main(String ar[]){
        sample s=new sample();
    }    
}
    class sample{
        sample(){
           System.out.println("Constructor is made");
        Final f=new Final();
        }
        
    }
    class Final{
        Final(){
            System.out.println("Final Constructor is made");
        }
    }