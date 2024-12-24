public class ClassAndObjectSum {
    public static void main(String ar[]) {
        ClassSum s1 = new ClassSum();
        ClassSum s2 = new ClassSum();
        s1.a = 10;
        s1.b = 20;
        s2.a = 30;
        s2.b = 40;
        s1.CalculateSum();
        s2.CalculateSum();
        s1.display();
        s2.display();

    }
}
