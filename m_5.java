import java.util.Scanner;

public class m_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to find factorial");
        int n = input.nextInt();
        fact(n);
    }
    static void fact(int n){
        int s=1;
        for(int i=1;i<=n;i++){
            //System.out.print(i + "*" );
            s = s * i;
        }
        System.out.println("Factorial  of " +n +"is " + s);
    }
}
