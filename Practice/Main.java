//package Practice;

public class Main{
    public static void main(String[] arg){
        Name name1 = new Name();
        name1.setName("Abdul Hazib");
        System.out.println("Name is: "+name1.getName());
    }    
}

 class Name {
 private String name;
 public void setName(String NewName){
    this.name = NewName;
 }
 public String getName(){
    return name;
 }
  
}
