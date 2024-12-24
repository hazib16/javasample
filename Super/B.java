package Super;
//package Super;

public class B extends A {
    int a;
    void display(){
        System.out.println("It's B");
        
    }
    void basedisplay(){
        super.display();
    }

public static void main(String arr[]){
    B b=new B();
    b.basedisplay();
}
}