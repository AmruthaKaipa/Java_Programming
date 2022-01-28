import java.util.Scanner;

public class P_C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = input.nextInt();
        System.out.println("Enter the value of r");
        int r = input.nextInt();
        int i, s = 1, p = 1, q = 1;
        for (i = 1; i <= n; i++){
            s = s * i;
        }
        for (i = 1; i <= r; i++){
            p = p * i;
        }
        for (i = 1; i <= n-r; i++){
            q = q * i;
        }
        System.out.println("npr = "+ s/q);
        System.out.println("ncr = " + s/(q * p));
    }
}
