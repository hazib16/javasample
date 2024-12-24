package Functions;
public class FunctionCalling {
    public static void main(String ar[]){
        First f=new First();
        f.display();
    }
}
    class First{
        void display(){
         Final f=new Final();
         f.displayFinal();   
        }
    }
    class Final{
        void displayFinal(){
            System.out.println("Vasu The Great");
        }
    }
