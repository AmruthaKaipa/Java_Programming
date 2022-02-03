import java.util.Scanner;

public class m_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to find sum of all numbers till that number");
        int n = input.nextInt();
        int s = series(n);
        System.out.println("Sum of all natural numbers = "+s);
    }
    static int series(int n){
        int s = n*(n+1)/2;
        //int s=0;
       // for(int i=1;i<=n;i++){
            //s=s+i;
       // }

        return s;
    }
}
