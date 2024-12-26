//package Practice;

public class Car {
    String Model;
    String Color;
    int Year;
    public Car(String Model,String Color,int Year){
        this.Color=Color;
        this.Model=Model;
        this.Year=Year;
    }
    void DisplayDetails(){
        System.out.println("Car Model: "+Model);
        System.out.println("Car Color: "+Color);
        System.out.println("Car Year: "+Year);
    }
    public static void main(String arg[]){
        Car Car1=new Car("Toyota","Red",2012);
        Car1.DisplayDetails();

    } 
}
