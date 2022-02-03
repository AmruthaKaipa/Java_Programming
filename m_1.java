import java.util.Scanner;

public class m_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = input.nextInt();
        System.out.println("Enter Second number");
        int b = input.nextInt();
        System.out.println("Enter third number");
        int c = input.nextInt();
        min(a,b,c);
        max(a,b,c);
    }
    static void max(int a, int b,int c){
        if(a>b){
            if(a>c){
                System.out.println(a+ " is greater.");
            }
            else{
                System.out.println(c + " is greater");
            }
        }
        else{
            if (b>c){
                System.out.println(b + " is greater");
            }
            else
                System.out.println(c + " is greater");
        }
    }
    static void min(int a,int b,int c) {
        if (a<b) {
            if(a<c){
                System.out.println(a+ " is Smaller.");
            }
            else{
                System.out.println(c + " is Smaller");
            }
        }
        else {
            if (b < c) {
                System.out.println(b + " is Smaller");
            }
            else
                System.out.println(c + " is Smaller");
        }
    }
}

