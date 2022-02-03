import java.util.Scanner;

public class m_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = input.nextInt();
        System.out.println("Enter second number");
        int b = input.nextInt();
        System.out.println("Enter third number");
        int c = input.nextInt();
        Pythagorean(a,b,c);
    }
    static void Pythagorean(int a, int b,int c){
        if(((a*a)+(b*b))==(c*c))
            System.out.println(a +","+b+","+c+" forms a Pythagorean Triplet");
        else
            System.out.println(a +","+b+","+c+" does not form a Pythagorean Triplet");

    }
}
