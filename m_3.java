import java.util.Scanner;

public class m_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of a circle");
        double r = input.nextDouble();
        double area = ar(r);
        System.out.println("Area of circle is "+area);
    }
    static double ar(double r){
        double a =  (3.14*r*r);
        double c =  (2*3.14*r);
        System.out.println("Circumference of circle is "+c);
        return a;
    }
}
