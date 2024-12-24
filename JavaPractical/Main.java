public class Main {
    public static void main(String arr[]){
        Person person1=new Person();
        Person person2=new Person();
        person1.Name="Ramesh";
        person1.Age=21;
        person1.MicStatus = true;
        person2.Name="Sumesh";
        person2.Age=25;
        System.out.println(person1.GetName() +" is "+person1.GetAge()+"years old");
        System.out.println(person2.GetName() + " is "+person2.GetAge()+"years old");
        Rectangle rec1=new Rectangle();
        rec1.Length=5;
        rec1.Breadth=6;
        System.out.println("Area is: "+rec1.GetArea());
    }
}
