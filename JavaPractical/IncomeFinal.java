public class IncomeFinal {
    public static void main(String ar[]){
        Income p1=new Income();
        Income p2=new Income();
        p1.Income1=1000;
        p1.Income2=5000;
        p2.Income1=2000;
        p2.Income2=3000;
        System.out.println("Total Income P1: "+p1.Sum());
        System.out.println("Total Income P2: "+p2.Sum());
    }    
}
